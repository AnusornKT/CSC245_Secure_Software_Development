// Project 4 - Example 2 Compliant Solution (clear())
// MSC04-J. Do not leak memory
// Programming: Anusorn KT
// CSC245 Secure Software Development 
// April 21, 2021

// Import: Veector
import java.util.Vector;

// MSC04-J. Do not leak memory
// Original Source Code: Carnegie Mellon University
// Title: Compliant Solution (clear())
// https://wiki.sei.cmu.edu/confluence/display/java/MSC04-J.+Do+not+leak+memory#:~:text=Do%20not%20leak%20memory&text=Programming%20errors%20can%20prevent%20garbage,remain%20unused%20indicates%20memory%20mismanagement.

public class MSC04SecondExampleCompliantSolution {
	
	// Declared and created a vector:
	static Vector vector = new Vector();
	 
	public void useVector(int count) {
		try{
			for (int n = 0; n < count; n++) {
				// Adding integers to the vector:
				vector.add(Integer.toString(n));
			}
		} finally {
			 // Using the .clear() method to removed all element in the vector:
			 vector.clear();
		}
	}  
	
	public static void main(String[] args) {
		
		// Class object:
		MSC04SecondExampleCompliantSolution obj = new MSC04SecondExampleCompliantSolution();
		
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
