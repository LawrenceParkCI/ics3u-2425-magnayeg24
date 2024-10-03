package unit1;

import java.util.Scanner;

/**
 * Date: 10/01/2024
 * Description: This is a math worksheet
 * @author Gabriel Magnaye
 */
public class RectangleArea {
	/**
	 *This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);	
		
		//declare variables
		int length, width, depth;
		
		//get the user input
		System.out.println("AREA PROGRAM");
		System.out.print("Type in the length of the rectangle and <Enter>: ");
		length =sc.nextInt();
		
		System.out.println("Type in the width of the rectange and <Enter>: ");
		width = sc.nextInt();
		
		System.out.println("Type in the depth of the rectange and <Enter>: ");
		depth = sc.nextInt();
		
		
		//calculate the area
		int area = length * width;
		
		//calculate the volume
		int volume = length * width * depth;
		
		//print the output
		System.out.println("The area of your rectangle is " + area);
		sc.close();
		
		System.out.println("The volume of your rectangle is " + volume);
		sc.close();
	}

}
