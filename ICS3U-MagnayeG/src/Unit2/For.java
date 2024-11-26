package Unit2;

/**
Description: This is a for loops worksheet
Date: 11/24/2024
@author Gabriel Magnaye
*/

public class For {
  public static void main(String[] args) {
    
    /*
    A for loop is also usually considered a counting loop. It typically has three parts.

    //this entire line is called the *header*
    for (int i = 0; i < 10; i++) { 
      <code body>
    }

    (int i = 0) - the initializer: declaring and initializing a variable to help count; the variable is typically called a counter or incrementer;
      -its scope is only within the loop

    (i < 10) - the test expression: determining whether we should repeat the code or not

    (i++) - the increment: at the end of a run through the body of the code, how should the counter change?
      recall - what is the meaning of i++? Can we write it a different way?
      //i++ adds 1 to the value of i. It can also be written as i = i + 1;.

    (body) - the code that is to be repeated
    */
    System.out.println("Counting up");
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }
    System.out.println("\n");

    System.out.println("Counting from 10 to 20");
    for (int i = 10; i <= 20; i++) {
        System.out.println(i);
    }
    System.out.println("\n");

    System.out.println("Counting from 10 to 0");
    for (int i = 10; i >= 0; i--) {
        System.out.println(i);
    }
    System.out.println("\n");

    System.out.println("Counting from 10 to 30 by 2s");
    for (int i = 10; i <= 30; i += 2) {
        System.out.println(i);
    }
    System.out.println("\n");


  }
}