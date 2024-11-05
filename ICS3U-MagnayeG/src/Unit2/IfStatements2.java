package Unit2;

import java.util.Scanner;

/**
 * Description: This is an if statements worksheet
 * Date: 11/05/2024
 * @author Gabriel Magnaye
 */

public class IfStatements2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("What is your age?");
		int userAge = in.nextInt();
		/*
    if (userAge > 18) { //If they're over 18, they are titled an adult
      String title = "Adult";
    } else {  //if they're not over 18, I don't want a title
      System.out.println("Sorry, not quite yet.");
    }

    System.out.println(title);
		 */
		//Looking at the logic above, why do you think the 
		//program won't work? The variable was never initialized outside the block of code. If the else statement was run instead of the if statement, then that variable woulnd't have been initialized but still would have tried to be used.

		//Copy the code below, and try to find a solution.
		//Comment the code above to avoid compilation errors.
		
		String title;
		
	    if (userAge > 18) { //If they're over 18, they are titled an adult
	      title = "Adult";
	    } 
	    else {  //if they're not over 18, I don't want a title
	      System.out.println("Sorry, not quite yet.");
	      title = "youth";
	    }

	    System.out.println(title);


	}
}
		