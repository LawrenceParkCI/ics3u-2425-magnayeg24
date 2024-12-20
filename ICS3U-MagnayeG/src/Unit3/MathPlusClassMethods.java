package Unit3;

import java.util.ArrayList;

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

	//Int sum

	/**
	 * This method calculate the sum of all the numbers in an array
	 * @param sum The sum of all values in an array
	 * @param ar1 The array that holds the values we are calculating
	 * @return The sum of all the values
	 */

	public static int sum(int[] ar1){


		int sum = 0;

		for(int i = 0;i<ar1.length;i++) {
			sum += ar1[i];
		}

		return sum;
	}
	//Double sum

	/**
	 * This method calculate the sum of all the numbers in an array
	 * @param sum2 The sum of all the values
	 * @param ar2  The array that holds all the values
	 * @return The sum of all the values
	 */

	public static double sum2(double[] ar2){


		double sum2 = 0;

		for(int I = 0;I<ar2.length;I++) {
			sum2 += ar2[I];
		}

		return sum2;
	}
	// int min

	/**
	 * This method finds the index of the smallest value in an array
	 * @param min The index of the smallest value 
	 * @return The index of the smallest value
	 */

	public static int min(int[] ar1) {

		int min = 0;

		for (int i = 1; i < ar1.length; i++) {
			if (ar1[i] < ar1[min]) {
				min = i;
			}
		}

		return min;
	}


	// double min

	/**
	 * This method finds the index of the smallest value in an array
	 * @param min The index of the smallest value 
	 * @return The index of the smallest value
	 */

	public static int min(double[] ar2) {

		int min = 0;

		for (int i = 1; i < ar2.length; i++) {
			if (ar2[i] < ar2[min]) {
				min = i;

			}
		}
		return min;
	}
	// int max

	/**
	 * This method finds the index of the largest value in an array
	 * @param max The index of the largest value 
	 * @return The index of the largest value
	 */


	public static int max(int[] ar1) {

		int max = 0;

		for (int i = 1; i < ar1.length; i++) {
			if (ar1[i] > ar1[max]) {
				max = i;
			}
		}

		return max;

	}	
	// double max

	/**
	 * This method finds the index of the largest value in an array
	 * @param max The index of the largest value 
	 * @return The index of the largest value
	 */


	public static int max(double[] ar1) {

		int max = 0;

		for (int i = 1; i < ar1.length; i++) {
			if (ar1[i] > ar1[max]) {
				max = i;
			}
		}

		return max;
	} 
	// Int bigDifference

		/**
		 * This method finds the range of values in an array
		 * @param max Largest value in an array
		 * @param min Smallest value in an array
		 * @return Difference between the largest and smallest value
		 */
	
	public static int bigDifference(int[] ar1) {
	
	int dif = max(ar1) - min(ar1);
	
	return dif; }
	
	// Double bigDifference

			/**
			 * This method finds the range of values in an array
			 * @param max Largest value in an array
			 * @param min Smallest value in an array
			 * @return Difference between the largest and smallest value
			 */
		
		public static double bigDifference(double[] ar2) {
		
		int dif = max(ar2) - min(ar2);
		
		return dif; }

	//factors

	/**
	 * This method finds the factors of a number and returns it in an array
	 * @param factorList  An array containing every factor for a number
	 * @param c  Counter variable
	 * @param n  Number used for calculating factors
	 * @param i  Counter variable
	 * @return An array containing every factor of a number
	 */

	public static int[] factors(int n) {

		int[] factorList = new int[numOfFactors(n)];

		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) { 
				factorList[c] = i;
				c++;

			}
		}

		return factorList;  


	}
}


