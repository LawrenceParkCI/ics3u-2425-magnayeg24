package Unit2;
/**
Description: This is a while loop worksheet
Date: 11/21/2024
@author Gabriel Magnaye
*/
import java.util.Scanner;

public class While {
 public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   System.out.println("What is your favorite word?");
   String name = in.nextLine();
   //Why do you think I coded it this way?
   //It doesn't change the functionality.
   int numPeople = 20;

   while (numPeople > 0) {

     //Why do you think the variable is declared here?
     System.out.println(name);

     numPeople = numPeople - 1;
   }
   

   in.close();
   //Run the code Using the debugger. 
   //Explain the code in your own words
   //The program asks the user how many people they are planning on seeing. It stores that value into a variable. It then asks for the name of each person while subtracting 1 each time. The program ends when the variable is equal to zero.

   //What code is repeated?
   //"What is this person's name?"
   
   //When does it decide whether to repeat or not?
   //It repeats whenever the variable numPeople is still greater than 1.
   
   //What is the condition for repeating?
   //The variable numPeople is greater than 1.


   //What is the difference between a while loop and a do-while loop?
   //The do-while loop checks the condition at the end of the loop while the while loop checks it at the start of the loop.

   //Create a while loop that asks for a word, 
   //and prints it out 20 times.
 }
}