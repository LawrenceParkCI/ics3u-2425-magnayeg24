package Unit2;

//Import for scanner
import java.util.Scanner;
/**
 * Description: This is a program that determines whether an integer is odd or even
 * Date: 11/01/2024
 * @author Gabriel Magnaye
 */

public class OddEven {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		int num;
		
		//collecting user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number");
		num = sc.nextInt();
	sc.close();
	
		//if the value is zero after mod 2, it is even
		if (num %2 == 0) {
			System.out.println("This is an even number");
		}
		else {
			System.out.println("This is an odd number");
		}

	}

}
