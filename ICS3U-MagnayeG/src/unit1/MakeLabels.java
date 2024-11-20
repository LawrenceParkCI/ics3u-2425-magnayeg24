package unit1;

import java.util.Scanner;

/**
 * Date: 10/02/2024
 * Description: This is a MakeLabels worksheet 
 * @author Gabriel Magnaye
 */
public class MakeLabels {
	/**
	 *This is the entry point to the program
	 * @param args unused
	 */
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Variables
		String subject; 
		String name;
		
		//Program
		System.out.println("Type in the subject and press <Enter>");
		subject = sc.nextLine();
		
		System.out.println("Type in the name and press <Enter>");
		name = sc.nextLine();
		
		System.out.println();
		System.out.println("******************************");
		System.out.println(name);
		System.out.println(subject);
		System.out.println("******************************");
		sc.close();
	}

}
