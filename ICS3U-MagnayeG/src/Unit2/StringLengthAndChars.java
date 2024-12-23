package Unit2;

import java.util.Scanner;

/**
Description: This is a string length and chars worksheet
Date: 12/23/2024
@author Gabriel Magnaye 
 */

public class StringLengthAndChars {

	/**
	 * @param args unused
	 */

	public static void main(String[] args) {
		/*
      Goal: Using string methods with a for loop
        .length()
        .charAt(<position>)
		 */

		String name = "Ms. Kemp";

		//write comments for the following code - what does it print out, and why?
		System.out.println(name.length()); //"8" the number of character
		System.out.println(name.charAt(1)); //"s" the character at index 1
		System.out.println(name.charAt(2)); //"." the character at index 2
		System.out.println(name.charAt(3)); //"space" the character at index 3

		//.length() gets the number of characters
		//.charAt(position) gets the character at the given index
		//counting starts at zero

		/**
      Ask for user input for name. Print out each individual letter of the name on separate lines, using a for loop
		 */
		
		Scanner sc = new Scanner(System.in);

        // Collect user input
        System.out.print("What is your name?");
        String name1 = sc.nextLine();

        // Print the results of the loop
        for (int i = 0; i < name1.length(); i++) {
            System.out.println(name1.charAt(i));
        }

        sc.close();
	}
}