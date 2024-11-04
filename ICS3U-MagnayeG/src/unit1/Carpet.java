package unit1;

import java.util.Scanner;
/**
 * Date: 10/07/2024
 * Description: Calculates the cost to carpet a room
 * @author Gabriel Magnaye
 */
public class Carpet {
	/**
	 *This is the entry point to the program
	 * @param args unused
	 */		
	public static void main(String[] args) {
		
	//declare the variables
	int length;
	int width;
	int cost;
		
	//get the user input
	Scanner sc = new Scanner(System.in);
		System.out.print("Type in the length of the carpet (in meters): ");
		length =sc.nextInt();
		System.out.println("Type in the width of the carpet (in meters): ");
		width = sc.nextInt();
		System.out.println("Type in the cost of the carpet per square-meter: ");
		cost = sc.nextInt();
	sc.close();
		
	//calculate the cost
	int area = length*width;
	int totalCost = cost*area;
	
	//output the information
		System.out.println("Your carpet is " + area + "m^2");
		System.out.println("The cost of your carpet is: $" + totalCost);
	}

}
