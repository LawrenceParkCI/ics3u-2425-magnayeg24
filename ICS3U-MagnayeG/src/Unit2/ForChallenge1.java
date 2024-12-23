package Unit2;

import java.util.Scanner;

/**
Description: This is a for challenge worksheet
Date: 12/23/2024
@author Gabriel Magnaye
*/

public class ForChallenge1 {
  public static void main(String[] args) {
    /*
      Create a program that asks for the starting number, the ending number, and how much you should count by. Then print out the numbers using a for loop.  You should be able to count by decimals.
      ie.

      Starting Num: 
        0
      Ending Num: 
        1
      Count by: 
        0.1
      Result: 
        0 0.1 0.2 0.3 0.4 0.5 0.6 0.7 0.8 0.9 1.0
    */
	  
	  // Scanner
      Scanner in = new Scanner(System.in);

      // Collecting user input
      System.out.print("Starting Num: ");
      double start = in.nextDouble();
      
      System.out.print("Ending Num: ");
      double end = in.nextDouble();
      
      System.out.print("Count by: ");
      double step = in.nextDouble();

      //Loop
      for (double current = start; current <= end; current += step) {
          System.out.printf("%.1f ", current);
      }
      in.close();
  }
}