package Unit2;

import java.util.Scanner;

/**
 * Description: This is a string challenge worksheet
 * Date: 11/12/2024
 * @author Gabriel Magnaye
 */

public class StringChallenge {
	public static void main(String[] args) {
		//This is for the portfolio

		/*
    Create a program that demonstrates the use of .equals(), .equalsIgnoreCase(), .compareTo().  You should be using if statements for this program.

    Also, include an example of explicit and implicit casting.

    Comment to explain:
      -when you use the different String functions
      -when you are casting and how the value is changed
      
      
		 */ 

		//Declaring variables
		String word1;
		String word2;
		boolean wordsSame;
		int wordDifference;
		int tOrF;

		
		//Collecting user input
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Please input a word");
		word1 = sc.nextLine();

		System.out.println("Please input another word");
		word2 = sc.nextLine();
		sc.close();

		//Using .equals() and .equalsIgnoreCase() functions and if statements
		
		if (word1.equals(word2)) { 
			wordsSame = true;
			System.out.println("The words are exactly the same");
		}
		
		else if (word1.equalsIgnoreCase(word2)) {
			wordsSame = true;
			System.out.println("The words are exactly the same, ignoring the capitilization");
		}
		
		else {
			wordsSame = false;
			System.out.println("The words are NOT the same");
		}
		
		//Using the .compareTo function
		
		wordDifference = word1.compareTo(word2);
		
		//explicitly casting boolean -> integer
		tOrF = wordsSame ? 1 : 0;
		
		//Implicit casting
		
		System.out.println(tOrF + wordDifference + '.' + " This is the value of the difference between the letters of your two words, plus the boolean value if they are equal " + '.');
	}
}