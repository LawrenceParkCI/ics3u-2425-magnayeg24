package unit1;

/**
* Description: This is a casting worksheet
* Date: 10/15/2024
* @author Gabriel Magnaye
*/
public class Casting3 {
  
  /**
   * This is the entry point to the program.
   * @param args unused
   */
 public static void main(String[] args) {
    /* 
    * Strings and Back Again
    */
    //Recall:
    System.out.println("Part 1");
    System.out.println("1 + 2 + 3" + 4 + 5);
    //why did it print out this way?
    //It was never specified that it should be a mathematical equation
    
    //Demonstrate casting a double value to a String in this way
    System.out.println("1 + 2 + 3" + 4.5 + 5.5);
    
    //Demonstrate casting a boolean value to a String in this way
    System.out.println("1 + 2 + 3" + true + false);
    
    //Demonstrate casting a char value to a String in this way
    System.out.println("1 + 2 + 3" + 'a' + 'b');

    System.out.println("Part 2");
    //In order to change a String into an integer, we need another set of code

    String strNum = "-5";
    int myNum = Integer.parseInt(strNum);

    System.out.println(strNum + " x 2 = " + (myNum + myNum));

    /*Change strNum to the following values, and see if they work:
     * "25.2"
     * "23c"
     * "2 3"
     * "Lol23"
     * "-5"
    */
    //What can you say about how we can use the function, Integer.parseInt()?
    //The function is used to cast the variable as an integer. The program will fail if the variable is not an integer

    // What do you think the code to change a String to double would look like?
    //Similarly, test out the code and write down what instructions
    double myNum2 = Double.parseDouble(strNum);
    System.out.println(myNum2);
    //When do you think it might be necessary to change a string value into an integer value/double value?
    //Changing a string into an integer or double could be helpful for calculations in coding
  }
}