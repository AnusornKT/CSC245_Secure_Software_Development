// Project 4 - Example 2 - Noncompliant Code Example (Off-by-One Programming Error)
// MSC04-J. Do not leak memory
// Programming: Anusorn KT
// CSC245 Secure Software Development 
// April 21, 2021

// Import: Veector
import java.util.Vector;

// MSC04-J. Do not leak memory
// Original Source Code: Carnegie Mellon University
// Title: Noncompliant Code Example (Off-by-One Programming Error)
// https://wiki.sei.cmu.edu/confluence/display/java/MSC04-J.+Do+not+leak+memory#:~:text=Do%20not%20leak%20memory&text=Programming%20errors%20can%20prevent%20garbage,remain%20unused%20indicates%20memory%20mismanagement.

public class MSC04SecondExample {
	// Declared and created a vector:
	static Vector vector = new Vector();
	 
	  public void useVector(int count) {   
	    for (int n = 0; n < count; n++) {
	    	// Adding integers to the vector:
	    	vector.add(Integer.toString(n));
	    }
	    for (int n = count - 1; n > 0; n--) {
	    	// Free the memory by removing an element at index 'n':
	    	vector.removeElementAt(n);
	    }  
	  }

	public static void main(String[] args) {
		// Class object:
		MSC04SecondExample obj = new MSC04SecondExample();
		
		// variable:
	    int i = 1;
	    while (true) {
	    	// Print our "Iteration: i"
	    	// i is a while counting:
	        System.out.println("Iteration: " + i);
	        
	        // Class obj will use the .useVector method to perform adding and removing elements
	        // from the vector:
	        obj.useVector(1);
	        
	        // Increment a value of i by adding i + 1:
	        i++;
	      }
	}
}
