package unit1;
/**
 * Date: 10/01/2024
 * Description: This is a math worksheet
 * @author Gabriel Magnaye
 */
public class MathOperators {
	/**
	 *This is the entry point to the program
	 * @param args unused
	 */
	public static void main (String [] args) {
		/*
         Pre: Kind of Math, but not really
         What do you notice is happening?
		 */

		//      System.out.println("Butter" + "fly");
		System.out.println("Butter" + "fly");
		//      System.out.println("1 + 2 + 3 + 4 + 5");
		System.out.println("1 + 2 + 3 + 4 +5");
		//      System.out.println(1 + 2 + 3 + 4 + 5);
		System.out.println(1 + 2 + 3 + 4 +5);
		//      System.out.println(1 + 2 + "3 + 4 + 5");
		System.out.println(1 + 2 + "3 + 4 + 5");
		//      System.out.println("1 + 2 + 3" + 4 + 5);
		System.out.println("1 + 2 + 3" + 4 + 5);

		//Why do you think the last two outputs act so differently?
		// The last two outputs act so differently due to the way they are ordered.

		//Summary: What are two possible roles of the + operator?
		// The + operator can either add variables or add a word to a sentence.

		/*
         Part 1 
         Figure out what is the meaning of each operator. Use print statements
         to verify your answer and explain.
		 */

		// + means: add, find the sum of two variables

		// - means: subtract, find the difference of two variables

		// * means: multiply, find the product of two variables

		// / means: divide, find the quotient of two variables



		//Print the following expression: (3 + 2) * 5
		System.out.println((3 + 2) * 5);
		//Print the following expression: 3 + 2 * 5
		System.out.println(3 + 2 * 5);
		//Was this expected? Why or why not?
		// This was expected as the equations were solved when displayed in the console.
		/*
         Part 2 - Calculate Using Operators
         Print out, using one println statement, what 45 degrees Celsius is in Fahrenheit

         Print out, using a print and a println statement, what 900 Fahrenheit is in Celsius
		 */     
System.out.println("45 degrees in Celsius is " + (45*9/5+32) + " degrees in Farhrenheit");
System.out.println("900 degrees in Farhrenheit is " + ((900-32)*5/9) + " degrees in Celsius");
		/*
         Part 3
         Figure out what is the meaning of % as a math operator. Use print statements
         to check your answer.
		 */

		//I think % means: the remainder of an division equation, also known as the moduler.
System.out.println(19%5);

	}
}