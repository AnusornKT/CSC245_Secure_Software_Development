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
		
			// ################### ERR01-J. Do not allow exceptions to expose sensitive information ###################
			File file = null;
			try {
				file = new File("Email_addresses_20210205.txt");
				if (!file.getPath().startsWith("/workspace/SP_2021_CSC245_SecureSoftware/")){
					System.out.println("Invalid file");
				}
			}catch(IOException x){ 
				System.out.println("Invalid file"); 
			}
			
			try {
				FileInputStream fis = new FileInputStream(file);
			}catch (FileNotFoundException x){ 
				System.out.println("Invalid file");
			}

	}
}