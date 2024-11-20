package Unit2;
/**
 * Description: This is a rolling dice worksheet
 * Date: 11/19/2024
 * @author Gabriel Magnaye
 */
public class DoubleDiceContest {

	public static void main(String[] args) {
		/*
		 * Write code that simulates rolling two dice for the user and then two dice for the computer. 
		 * The program should output the total of the two dice for both the user and the computer, 
		 * then announce who won: the computer, the user, or say it was a tie.
		 */
		
		
		// Declaring Variables
		 int hum1 = (int)(Math.random()*6) + 1;
		 int hum2 = (int)(Math.random()*6) + 1;
		 int hum3;
		 hum3 = hum1 + hum2;
		 
		 int com1 = (int)(Math.random()*6) + 1;
		 int com2 = (int)(Math.random()*6) + 1;
		 int com3;
		 com3 = com1 + com2;
		 
		 //Calculating user dice roll
		 
		 System.out.println("Your first dice roll is " + hum1);
		 System.out.println("Your second dice roll is " + hum2);
		 System.out.println("Your total is " + hum3);
		 
		 //Calculating computer dice roll
		 
		 System.out.println("The computers first roll is " + com1);
		 System.out.println("The computers first roll is " + com2);
		 System.out.println("The computer's total is " + com3);
		 
		 //Displaying results
		 
		 if (hum3 > com3) {
			 System.out.println("You have won :)");
			 
		 }
			 
		 if (com3 > hum3) {
			 System.out.println("You have lost :(");
			
		 }
			 
		 if (hum3 == com3) {
			 System.out.println("It's a tie!");
		 }
	

	}

}
