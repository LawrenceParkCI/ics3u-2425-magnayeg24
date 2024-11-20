package unit1;

import java.util.Scanner;

/**
 * Date: 10/04/2024
 * Description: Calculates the days alive and hours asleep
 * @author Gabriel Magnaye
 */
public class Alive {
	/**
	 *This is the entry point to the program
	 * @param args unused
	 */		
	public static void main(String[] args) {
		//declare variables
		int birthYear;
		int birthMonth;
		int birthDay;
		int currentYear;
		int currentMonth;
		int currentDay;
		
		//display the info
		Scanner sc = new Scanner(System.in);
			System.out.println("What is your birthday? [Please use numbers] ");
			System.out.print("Year: ");
			birthYear =sc.nextInt();
			System.out.print("Month: ");
			birthMonth =sc.nextInt();
			System.out.print("Day: ");
			birthDay =sc.nextInt();
			System.out.println("\nWhat day is it? [Please use numbers] ");
			System.out.print("Year: ");
			currentYear =sc.nextInt();
			System.out.print("Month: ");
			currentMonth =sc.nextInt();
			System.out.print("Day: ");
			currentDay =sc.nextInt();
		sc.close();
		
		
		//calculating days alive and hours asleep
		int daysAlive = (currentYear*365 + currentMonth*30 + currentDay)-(birthYear*365 + birthMonth*30 + birthDay);
	    int hoursAsleep = daysAlive*8; 
	    
	    //display the information
	    System.out.println("\nYou have been alive for " + daysAlive + " days");
	    System.out.println("You have been asleep for " + hoursAsleep + " hours");
	    
	}

}
