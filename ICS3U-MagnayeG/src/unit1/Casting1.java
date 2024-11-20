package unit1;

import java.util.Scanner;

/**
 * Description:This is a casting worksheet
 * Date: 10/10/2024
 * @author Gabriel Magnaye
 */
public class Casting1 {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
		 *Casting* means to change data from one type to another.

    Implicit casting - changing of data types without specifically writing extra code

    Explicit casting - changing of data types by specifically writing extra code
		 */

		System.out.println("Part 1");

		int intNum;
		intNum = 10;

		double doubleNum;

		//implicit casting
		doubleNum = intNum;

		//What type of data is printed here? Why?
		//A double is being printed as the variable is saved as a double
		System.out.println(doubleNum);

		//can you explain what is happening in this code?
		//it is updating the value of doubleNum to doubleNum + 2.2
		doubleNum = doubleNum + 2.2;

		//explicit casting
		intNum = (int) doubleNum;

		//What type of data is printed here? Why?
		System.out.println(intNum);
		//An integer is being printed as an integer because the variable is saved as an integer
		/*
    Demonstrate casting between each of the data type. Write down whether it is explicit or implicit
      int to double = implicit
      double to int = explicit
      int to long = implicit
      long to int = explicit

    Why do you think these are implicit/explicit? (Hint: Think about the size of each data and the type of data)
		 */
		 //A smaller data type turning into a larger one is implicit as it changes by default
		 //A larger data type turning into a smaller one is explicit as the code must be changed to execute the change

		System.out.println("Part 2");

		//understanding what you can do with casting, can you round the following variable to the nearest 10th?
		double myNum;

		Scanner in = new Scanner(System.in);
		System.out.println("Give me decimal number up to the hundredth");
		myNum = in.nextDouble();
		myNum = myNum*10;
		myNum = (int)myNum;
		myNum = myNum/10;
		
		//code

		System.out.print("Rounding down to the nearest tenth, it is: " + myNum);

	}
}