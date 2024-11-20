package Unit2;

import java.util.Scanner;

/**
 * Description: This is an if challenge worksheet
 * Date: 11/11/2024
 * @author Gabriel Magnaye
 */

public class IfChallenge2 {
	public static void main(String[] args) {
		//This is for the portfolio

		/*Create a program that asks for three numbers.
    Tell the user if the numbers are strictly in order.
    ie.  2 5 11 or 5 6 7 are strictly in order.
    ie.  6 5 7 or 5 5 7 are not
		 */

		Scanner in = new Scanner(System.in);

		// Collecting user data
		System.out.println("What is your favorite number?");
		int num1 = in.nextInt();

		System.out.println("What is your second favorite number?");
		int num2 = in.nextInt();

		System.out.println("What is your third favorite number?");
		int num3 = in.nextInt();

		// Outputting the results

		if(num1<num2 && num2<num3) {
			System.out.println("The numbers are in order (:");
		} else {
			System.out.println("The number are NOT in order ):");
		}
		in.close();
	}
}