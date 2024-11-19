package Unit2;

import java.util.Scanner;
/**
 * Description: This is a name game
 * Date: 11/19/2024
 * @author Gabriel Magnaye
 */
public class NameGame {

	public static void main(String[] args) {
		/*
		 * The application should prompt the user for their name. 
		 * 70% of the time the program should output that the user's name is their favourite, 
		 * and 30% of the time says they hate that name.
		 * */

		//Declaring variables

		String name;
		int luck;

		//Collecting user info

		Scanner sc = new Scanner(System.in);
		System.out.println("You there! What is your name?");
		name = sc.nextLine();

		//Finding a random number

		luck = (int)(Math.random()*10 + 1);

		if (luck > 3) {
			System.out.println("WOW! " + name + ", your name is my favorite.");
		}


		else {
			System.out.println("BOO! " + name + ", I hate your name");

		}


	}

}
