package unit1;

/**
 * Description: This is a casting worksheet
 * Date: 10/10/2024
 * @author Gabriel Magnaye
 */
public class Casting2 {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
    Char and int
		 */
		char myChar = 'a';
		System.out.println(myChar);
		System.out.println(myChar + 1);

		char myChar2 = (char) (myChar + 1);

		System.out.println(myChar2);

		//Explain what is happening in the code. Where is there explicit casting, where is there implicit casting?
		//The code outputs 98 as the character a has a value stored as 97. Through implicit casting, myChar is converted into the value 97, when it's value is increased by 1. Through explicit casting, myChar2 is kept as a character rather than an integer.
		
		
		//Why do you think this happens?
		//This happens because the ascii value of a is 97, then you add one to that with implicit casting
		
		//Investigate what is ASCII. What is it?
		//It is the number value of each letter and character
		
		//Can you find the number value for 'a'? Does it match with your findings above?
        //The value of a is 97, this matches my findings above
		
		//create a new character myCharCap, and transform myChar into a capital 'A' and print it
		char myCharCap = (char)(myChar - 32);
		System.out.println(myCharCap);



	}
}