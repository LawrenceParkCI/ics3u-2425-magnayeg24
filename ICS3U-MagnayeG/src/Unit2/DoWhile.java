package Unit2;

/**
Description: This is a do-while loop worksheet
Date: 11/21/2024
@author Gabriel Magnaye
 */

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		/*
   A loop is another control structure that allows for repetition. It 
   does not make a decision on which branch to go on, like the 
   conditional.
   It makes a decision whether it should go back to redo a set of code.
		 */

		//Declaring variables and scanner 
		Scanner in = new Scanner(System.in);
		String name;
		int repeat = 0;

		//Collecting user input
		System.out.print("What is your favorite word? ");
		name = in.nextLine();

		//Looping name 20 times
		do {
			repeat += 1;
			System.out.println(name);
		} while (repeat <= 19);
		
		System.out.println("You are welcome into the secret secret pogchamp club.");

		in.close();

		//Run the code. Explain the code in your own words
		//The code asks for your name. If you do not input "Mr. Lee", the program repeats. If you do input the required name, more code is displayed and the program ends.

		//What code is repeated?
		//"What is your name?"

		//When does it decide whether to repeat or not?
		//If the variable "name" is not equal to "Mr. Lee", the code repeats.

		//What is the condition for repeating?
		//The variable must not be equal to "Mr. Lee".


		/*
    Note:Pay attention to the brackets, and the semicolon
		 */

		/*
     When constructing a loop, there are many strategies. I like to 
     break down the problems this way:
       1. What commands am I going to repeat?
       2. How many times/until when will I repeat the code?
		 */

		//Create a do-while loop that asks for a word, and 
		//prints it out 20 times.
	}
}