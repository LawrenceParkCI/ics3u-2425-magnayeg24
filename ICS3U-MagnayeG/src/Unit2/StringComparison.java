package Unit2;

import java.util.Scanner;

/**
 * Description: This is a string comparison worksheet
 * Date: 11/11/2024
 * @author Gabriel Magnaye
*/

class StringComparison {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    
    String answer;

    System.out.println("What is the capital of Ontario?");
    answer = in.nextLine();

    if (answer == "Toronto") {
      System.out.println("Correct!");
    } else {
      System.out.println("Sorry, that's incorrect.");
    }
    
    //Run the code. What happens when you type the correct answer? The incorrect answer?
    //The program displays the output as incorrect no matter what you write
    
    /*
      Strings are objects, not primitives and as such are a 
      *reference* data type. These variables hold an address 
      to the value. (Scanner is also a reference data type)

      int, double, char, etc. are all *primitive* data types. 
      These variables hold the actual value.

      Look at the website:
      https://www.javatpoint.com/string-comparison-in-java

      Demonstrate the use of the functions:
        .compareTo()
        .equals()
        .equalsIgnoreCase()
    */
String a ="Hey";
String b ="Hi";

System.out.println(a.compareTo(b));
System.out.println(a.equals(b));
System.out.println(a.equalsIgnoreCase(b));

    //What values does compareTo() return? How can we interpret the value?
// It returns -4, as that is the difference between the second character in each string by the ASCII value.

    //what value does equals() and equalsIgnoreCase() return? They both return the word false
    //What is the difference between these two functions?
// equals() checks if the two strings are equal, or the same word. equalsIgnoreCase() does the same but it ignores the punctuation.
    
    in.close();
  }
}