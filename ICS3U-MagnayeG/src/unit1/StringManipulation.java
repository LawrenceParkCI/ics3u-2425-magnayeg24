package unit1;

import java.util.Scanner;
/**
 * Date: 10/07/2024
 * Description: Manipulating strings assignment
 * @author Gabriel Magnaye
 */
public class StringManipulation {
	/**
	 *This is the entry point to the program
	 * @param args unused
	 */		
	public static void main(String[] args) {
		//declare variable
		String newSentence; 

		//display the information
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the sentence you would like me to manipulate?");
		newSentence =sc.nextLine();
		sc.close();

		//declaring new variables based on the initialization of the sentence
		String upperCase = newSentence.toUpperCase();
		String lowerCase = newSentence.toLowerCase();
		char letter = newSentence.charAt(5);
		int firstWord = newSentence.indexOf(" ");
		int lastWord = newSentence.lastIndexOf(" ");
		
		//manipulating the sentence
		System.out.println("\nThis is how I will manipulate your sentence:");
		System.out.println("Your sentence is: " + newSentence);
		System.out.println(upperCase);
		System.out.println(lowerCase);
		System.out.println("Your sentence has: " + newSentence.length() + " letters (including spaces)");
		System.out.println("The character at index 5 is: " + letter);
		System.out.println("The first word in your sentence is: " + newSentence.substring(0,firstWord));
		System.out.println("The last word in your sentence is:" + newSentence.substring(lastWord));
	}

}
