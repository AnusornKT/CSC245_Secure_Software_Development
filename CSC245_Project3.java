package edu.arapahoe.csc245;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.*;
import com.google.gson.reflect.*;

////////////////////////////////////////////////////////////////////////////////////
// Project 3 - Peer Review and Correction
// Programming: Anusorn KT
// CSC245 - Secure Software Development
// April 3, 2021
////////////////////////////////////////////////////////////////////////////////////
//
// This program was created for Arapahoe Community College's CSC-245 course and
// identifies the current temperature for a location using the Open Weather Map API.
//
// The use of the API (openweathermap.org) was applied for and access granted 202010321
// The key comes with several technical constraints regarding its usage, including:
//     Hourly forecast: unavailable
//     Daily forecast: unavailable
//     Calls per minute: 60
//     3 hour forecast: 5 days
//
// Details on the use of the API can be found here:
//     https://openweathermap.org/current
//
// The default location is Castle Rock, CO (encoded as Castle Rock, US) but can be
// changed, as required.
//
// CSC 245 Secure Software Development
//
// Change log:
//      20210321 API access granted
//      20210322 Initially created (ddl)
//
// Dependencies:
//      gson-2.2.2.jar is needed for correct functioning
//		Oracle JDK 1.8
//
////////////////////////////////////////////////////////////////////////////////////

public class CSC245_Project3 {

	// Java Maps are used with many API interactions. OpenWeatherMap also uses Java Maps.
	public static Map<String, Object> jsonToMap(String str){
		Map<String, Object> map = new Gson().fromJson(
				str, new TypeToken<HashMap<String, Object>>() {}.getType()
				);
		return map;
	}
	
	public static String getTempForCity (String cityString, String api_key){

		try {
			String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" +
					cityString + "&appid=" + api_key + "&units=imperial";
			StringBuilder result = new StringBuilder();
			URL url = new URL(urlString);
			URLConnection conn = url.openConnection();
			BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			

			while ((line = rd.readLine()) != null){
				result .append(line);
			}
				

			Map<String, Object > respMap = jsonToMap (result.toString());
			Map<String, Object > mainMap = jsonToMap (respMap.get("main").toString());
			
			return mainMap.get("temp").toString();

		} catch (IOException e){
			
			return "Temp not available (API problem?)";
		}
		
	}

	public static void main(String[] args) {
		// In order to run the CSC245_Project3.java, you need to have API key:
		// If an API hkey provided, it needs to be set as the value of the variable called 'own'.
		// Once ypu have the API key set, please uncomment the line below ( String own = "....").
		// String owm = "....(API key)....";
		
		String LOCATION = "Castle Rock, US";
		
		System.out.println("Current temperature in " + LOCATION +" is: " + getTempForCity(LOCATION,owm) + " degrees.");

	}

}