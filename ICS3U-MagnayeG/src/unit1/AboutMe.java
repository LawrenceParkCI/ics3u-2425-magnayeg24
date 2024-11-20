/*
 * Description: This program prints my information
 * Date: 09/20/2024
 * @author Gabriel Magnaye
 */
package unit1;


public class AboutMe {

	public static void main(String[] args) {
		//Info
		System.out.println("My Information\n");
		System.out.println("Gabriel Magnaye");
		System.out.println("Grade 11");
		System.out.println("Ms. Kemp");
		System.out.println("Lawrence Park");
		System.out.println("\"Go Panthers!\"\n");
		
		//Timetable
		System.out.println("\n\nDay: \t  |Classes: \t  |Time:");
		System.out.print("______________________________________");
		System.out.format("\n%-9s %-14s %-10s", "Monday", "|Comp Sci", "|9:00-10:15"); 
		System.out.format("\n%-9s %-14s %-10s", " ", "|Cooking", "|10:20-11:40"); 
		System.out.format("\n%-9s %-14s %-10s", " ", "|French", "|12:40-1:55"); 
		System.out.format("\n%-9s %-14s %-10s", " ", "|Functions", "|2:00-3:15"); 
		System.out.print("\n______________________________________");
		System.out.format("\n%-9s %-14s %-10s", "Tuesday", "|Cooking", "|9:00-10:15");
		System.out.format("\n%-9s %-14s %-10s", " ", "|Comp Sci", "|10:20-11:40");
		System.out.format("\n%-9s %-14s %-10s", " ", "|Functions", "|12:40-1:55");
		System.out.format("\n%-9s %-14s %-10s", " ", "|French", "|2:00-3:15");
		System.out.print("\n______________________________________");
		System.out.format("\n%-9s %-14s %-10s", "Wednesday", "|Comp Sci", "|9:55-10:55");
		System.out.format("\n%-9s %-14s %-10s", " ", "|Cooking", "|11:00-12:00");
		System.out.format("\n%-9s %-14s %-10s", " ", "|French", "|1:00-2:00"); 
		System.out.format("\n%-9s %-14s %-10s", " ", "|Functions", "|2:05-3:15"); 
		System.out.print("\n______________________________________");
		System.out.format("\n%-9s %-14s %-10s", "Thursday", "|Cooking", "|9:00-10:15");
		System.out.format("\n%-9s %-14s %-10s", " ", "|Comp Sci", "|10:20-11:40");
		System.out.format("\n%-9s %-14s %-10s", " ", "|Functions", "|12:40-1:55");
		System.out.format("\n%-9s %-14s %-10s", " ", "|French", "|2:00-3:15");
		System.out.print("\n______________________________________");
		System.out.format("\n%-9s %-14s %-10s", "Friday", "|Comp Sci", "|9:00-10:15"); 
		System.out.format("\n%-9s %-14s %-10s", " ", "|Cooking", "|10:20-11:40"); 
		System.out.format("\n%-9s %-14s %-10s", " ", "|French", "|12:40-1:55"); 
		System.out.format("\n%-9s %-14s %-10s", " ", "|Functions", "|2:00-3:15"); 
		
	}


}
