// 7 Common Vulnerabilities in Java
// Programming: Anusorn Kiattanaphon
// ACC Student
// CSC245 - Secure Software Development
// Instructor: Doug Lundin
// Arapahoe Community College - Class Spring2021
// Reference: SEI CERT Oracle Coding Standard for Java
// www.https://wiki.sei.cmu.edu/confluence/display/java/SEI+CERT+Oracle+Coding+Standard+for+Java


////////////////////////////////////////////////////////////////////////////////////
// Project and report 2: Detect vulnerabilities on input validation and mitigate
// Programming: Anusorn KT
// CSC245 - Secure Software Development
// Mar 24, 2021
////////////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Base64;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;
import java.io.OutputStream;
import java.text.Normalizer;
import java.text.Normalizer.Form;


public class Project_2_AnusornKT {
	
	// ################### Method: buildEncodedUrl() ################
	static String buildEncodedUrl(String q) {
	    String encodedUrl = "https://example.com?query=" + Base64.getUrlEncoder().encodeToString(q.getBytes());
	  
	    return encodedUrl;
	}
	
	

	public static void main(String[] args) throws IOException {
		

		// ##### IDS50-J. Use conservative file naming conventions #####
		// ---- Examples of a file name: ----
		// First file name that contains bad chars:
		String filename = "A\uD8AB";
		
		// Second file name that does not contain bad chars:
		// Recheck: please uncomment to see the different results after switching between two names:
		//String filename = "Email_addresses_20210205.txt";
		
		
		Pattern pattern = Pattern.compile("[^A-Za-z0-9._]");
		Matcher matcher = pattern.matcher(filename);
		
		
		if (matcher.find()) {
		// File name contains bad chars; handle error System.out.println("File name: " + filename + " contains bad chars!"); }else{
		System.out.println("File name: " + filename + " doest not contain bad chars"); }

	}
}