// Project 4 - Example 1
// MSC04-J. Do not leak memory
// Programming: Anusorn KT
// CSC245 Secure Software Development 
// April 19, 2021

// Import: java.util.Vector
import java.util.Vector;

public class MSC04 {
	public static void main(String[] args){
		
		// Create my_simple_vector object with a large space required:
		
		// Uncomment either one of these to see the different result:
		// Vector my_simple_vector = new Vector(784324699);
		Vector my_simple_vector = new Vector(17);
		
		// Print out a statement that the program can read the last line:
		System.out.println("Your program just read the last line");
	}
}
