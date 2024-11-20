package Unit2;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Description: This is a multiple choice quiz
 * Date: 11/13/2024
 * @author Gabriel Magnaye
 */

public class IfChallenge3 {
	public static void main(String[] args) {

		//Declaring Variables
		String start;
		String answer1;
		String answer2;
		String answer3;
		String answer4;
		String answer5;
		int score = 0;
		double percentGrade;
		char letterGrade;

		
		//Formatting for the decimal grade
		DecimalFormat percent = new DecimalFormat("##.0%");
		System.out.println("Hi there! This is a general knowledge quiz.");

		//Introduction to program
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you ready to start? (yes/no)");
		start = sc.nextLine();

		if (start.equalsIgnoreCase("yes")) {
			System.out.println("Great! Let's start!\n");
		}

		else {
			System.out.println("Alright :(");
			System.exit(0);
		}

		//Question 1

		System.out.println("Question 1: Are there any fish that have teeth?");
		System.out.println("1) True");
		System.out.println("2) False");
		answer1 = sc.nextLine();

		//Question 2

		System.out.println("Question 2: What planet is furthest from the sun?");
		System.out.println("1) Earth");
		System.out.println("2) Neptune");
		System.out.println("3) Pluto");
		System.out.println("4) Saturn");
		answer2 = sc.nextLine();

		//Question 3

		System.out.println("Question 3: Toronto has hosted the olympics");
		System.out.println("1) True");
		System.out.println("2) False");
		answer3 = sc.nextLine();

		//Question 4

		System.out.println("Question 4: What does the \".equals()\" function do in Java?");
		System.out.println("1) Compares apples to oranges");
		System.out.println("2) Checks if two variables are equal");
		System.out.println("3) Checks if two variables are equal while ignoring their capitilization");
		System.out.println("4) Finds the difference between the two variables ascii value");
		answer4 = sc.nextLine();

		//Question 5

		System.out.println("Question 5: How many calories are in a 800kg great white shark");
		System.out.println("1) 4.1 million");
		System.out.println("2) 1.4 million");
		System.out.println("3) 1.04 million");
		System.out.println("4) A lot");
		answer5 = sc.nextLine();

		sc.close();

		System.out.println("Congratulations, you finished the quiz.");
		System.out.println("Now lets see your score!");

		//Calculating score

		if (answer1.equalsIgnoreCase("True") || answer1.equals("1")  || answer1.equalsIgnoreCase("t")) {
			score += 1;
		}

		if (answer2.equalsIgnoreCase("Neptune") || answer2.equals("2")) {
			score += 1;

		}

		if (answer3.equalsIgnoreCase("False") || answer3.equals("2")  || answer3.equalsIgnoreCase("F")) { 
			score += 1;

		}

		if (answer4.equalsIgnoreCase("Checks if two variables are equal") || answer4.equals("2")) {
			score += 1;
		}

		if (answer5.equalsIgnoreCase("1.04 million") || answer5.equals("3") || answer5.equals("1.04")) {
			score += 1;
		}

		//Calculating percent score and letter grade

		if (score == 5) {
			percentGrade = 1;
			letterGrade = 'A';

		}

		else if (score == 4) {
			percentGrade = 0.8;
			letterGrade = 'B';

		}

		else if (score == 3) {
			percentGrade = 0.6;
			letterGrade = 'C';	

		}

		else if (score == 2) {
			percentGrade = 0.4;
			letterGrade = 'D';	

		} 

		else if (score == 1) {
			percentGrade = 0.2;
			letterGrade = 'F';	
		}
		
		else {
			percentGrade = 0.0;
			letterGrade = 'F';
		}

		//Outputting the final grade
		System.out.println("\nCalculating... \nCalculating... \nCalculating... \n");
		System.out.println("Your final grade is "+ letterGrade + ". Which is a " + percent.format(percentGrade) +".");
		System.out.println("Good Job!");
		
	}


}	