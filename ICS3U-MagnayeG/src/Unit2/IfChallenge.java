package Unit2;

import java.util.Scanner;

/**
 * Description: This is an if challenge worksheet
 * Date: 11/05/2024
 * @author Gabriel Magnaye
 */

public class IfChallenge {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int num1;

		System.out.println("What is your favorite number?");
		num1 = in.nextInt();

		//Part 1 Negative Number 

		if (num1 < 0) {
			System.out.println("You need to look on the bright side");
		}

		//Part 2 Odd or Even

		if (num1 % 2 != 0) {
			System.out.println("It's a bit strange");
		}

		//Part 3 divisible by 2/3

		if (num1 % 2 == 0 && num1 % 3 ==0) {
			System.out.println("You should really consider thinking about 6");
		} else {
			System.out.println("Otherwise, you can keep wholesome");
		}

		//Part 4 Ones Digit Check

		int onesDigit = Math.abs(num1) % 10;
		if (onesDigit == 8) {
			System.out.println("I am too full");
		} else if (onesDigit == 9) {
			System.out.println("Canada is a nice country");
		} else {
			System.out.println("Don't count on it");
			in.close();
		}

		/*

    (IF)

    ask for the user's favorite number.
    if the number is negative, say that they need to look on
    the bright side.  If their number is odd, say that it's a 
    bit strange.

    (IF, ELSE)

    If their number is divisible by 3 and by 2, 
    say that they should really consider thinking about 6, 
    otherwise say they can keep wholesome.  

    (IF, ELSE IF, ELSE)

    Finally, if the 
    ones digit of the number is 8, say that you too are full, 
    if the ones digit is 9, say Canada is a nice country, 
    and any other number should result in "don't count on 
    it". 
		 */


	}
}