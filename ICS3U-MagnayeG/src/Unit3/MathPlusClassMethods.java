package Unit3;

/**
Description: This is a methods worksheet
Date: 12/17/2024
@author Gabriel Magnaye
 */

public class MathPlusClassMethods {

	public static void main(String[] args) {	       

	}
	//Distance Method

	/**
	 * This method calculates the distance between two points
	 * 
	 * @param x1 The x-coordinate of the first point.
	 * @param y1 The y-coordinate of the first point.
	 * @param x2 The x-coordinate of the second point.
	 * @param y2 The y-coordinate of the second point.
	 * @return The distance between two points
	 */


	public static double distance(int x1, int y1, int x2, int y2) {
		// Calculate the difference in x and y coordinates
		int dx = x2 - x1;
		int dy = y2 - y1;

		// Apply the distance formula
		return Math.sqrt(dx * dx + dy * dy);

	}

	//Hypotenuse method

	/**
	 * This method calculates the distance between two points using the pythagorean theorem
	 * 
	 * @param a The vertical distance
	 * @param b The Horizontal distance
	 * @return The distance between two points
	 */

	public static double hypotenuse(double a, double b) {

		return Math.sqrt(a * a + b * b);
	}

	//numOfFactors method

	/**
	 * This method calculates the number of factors in an integer
	 * @param num The number of factors
	 * @return The number of factors
	 */


	public static int numOfFactors(int num) {
		int divide = 0;
		int factors = 0;

		for (int i = 0; i < num; i++) {


			divide += 1;
			if (num % divide == 0) {
				factors += 1;
			}
		}

		return num;
	}
	//isPrime

	/**
	 * This method calculate whether or not a given integer is a prime number
	 * @param num Used to calculate whether or not the number is a prime
	 * @param prime Whether or not the the number is a prime
	 * @return If the value is a prime number or not
	 */

	public static boolean isPrime(int num) {

		boolean prime;

		if(numOfFactors(num) == 2) {
			prime = true;
		}
		else {
			prime = false;

		}

		return prime;
	}

}
