/////////////////////////////////////////////////////////
//
// Daniel Murphy
// Sep 11, 2020
//
/////////////////////////////////////////////////////////

/* This program takes two variables and assigns them two 
 * two randomly selected numbers between 1 and 100 using 
 * Math.random then adds the two variables. Then it asks
 * the user what the sum of the two numbers is and if the
 * user answers incorrectly than the programs displays text
 * with the correct answer. When the user answers correctly
 * the "You are correct is displayed". */

// Importing Scanner
import java.util.Scanner;
// Importing class "classWork3"
public class classWork3 {
	public static void main(String[] args) {

		/* Using the name "firstRan", or first random, for 
		 * variable as it is the first variable being randomly 
		 * assigned a value. Assigning variable firstRan a single 
		 * value using a range of numbers between 1 and 100 
		 * via Math.random which is a pseudorandom number generator*/ 
		int firstRan = 1 + (int) (Math.random() * 100);
		
		/* Using the name "secondRan", or second random, for
		 * variable as it is the second variable being randomly
		 * assigned a value between 1 and 100. with the same method
		 * listed above. */
		int secondRan = 1 + (int) (Math.random() * 100);
		
		// if firstRan is smaller than secondRan, swap firstRan with secondRan
		if (firstRan < secondRan) {
			int temp = firstRan;
			firstRan = secondRan;
			secondRan = temp;
		}
		// Displaying text to user asking what the sum of firstRan and secondRan is.
		System.out.println("What is " + firstRan + " + " + secondRan + "?");
		
		// Setting up scanner with variable name input
		Scanner input = new Scanner(System.in);
		
		// Scanning for user int input
		int answer = input.nextInt();
		
		// If user entered correct sum than display text "You are correct!"
		if (firstRan + secondRan == answer)
			System.out.println("You are correct!");
		
		// If user entered any amount other than the sum than display "your answer is wrong" and display firstRan and secondRan with the correct sum.
		else {
			System.out.println("Your answer is wrong.");
			System.out.println(firstRan + " + " + secondRan + " should be " + (firstRan + secondRan));
		
			// closing scanner "input" as it is no longer needed.
			input.close();
		}
		

	}

}
