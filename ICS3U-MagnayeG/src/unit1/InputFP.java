package unit1;

import java.util.Scanner;

/**
 * Date: 10/03/2024
 * Description: This is a floating point variables worksheet
 * @author Gabriel Magnaye
 */
public class InputFP {
	/**
	 *This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
			
		//declare the variables
		double num1, num2;
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		
		//output the data
		System.out.println();
		System.out.println("The first number entered was " + num1);
		System.out.println("The second number entered was " + num2);
		sc.close();
	}

}
