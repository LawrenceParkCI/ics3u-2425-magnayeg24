package Unit2;

import java.util.Scanner;

/**
Description:
Date:
@author
 */
public class LoopChallenge1 {
	public static void main(String[] args) {
		/*
     Create a program that will ask for the password.  If they answer 
     incorrectly, tell them, and repeat. If they answer correctly, 
     welcome them in.

     Extra: if they don't give a proper answer within 3 
     Decide on whether you should use the while or do while loop.
		 */

		//Declaring variables
		int tries = 3;
		String password;

		do {
			Scanner in = new Scanner(System.in);
			System.out.println("What is the password?");
			password = in.nextLine();

			tries = tries - 1;
			
			if (password.equalsIgnoreCase("password")) {
				System.out.println("CORRECT! Welcome in Mr. President!");
				tries = 0;
			}
			else if (tries >= 1) {
				System.out.println("INCORRECT! Please try again"); 
				
			}
			if (tries == 0)  {
				System.out.println("INCORRECT! Please try again later");
			}
		}
		while (tries > 0); 

	}



}
