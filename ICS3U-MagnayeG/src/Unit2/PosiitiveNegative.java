package Unit2;

//Import for scanner
import java.util.Scanner;
/**
 * Description: This is a program that determines whether an integer is positive or negative and is divisible by 7
 * Date: 11/01/2024
 * @author Gabriel Magnaye
 */

public class PosiitiveNegative {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {

		//variables
		int num;

		//collecting user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number");
		num = sc.nextInt();
		sc.close();

		//if the value is greater than zero, it is positive. If it is not, it is a negative number
		if (num > 0) {
			System.out.println("This is a positive number");
		}
		else {
			System.out.println("This is a negative number");
		}

		//if the value after mod 7 is zero it is divisible by 7. If not, it is not divisible by 7
		if (num %7 == 0) {
			System.out.println("This is number is divisable by 7");
		}
		else {
			System.out.println("This is number is not divisable by 7");
		}
	}

}
