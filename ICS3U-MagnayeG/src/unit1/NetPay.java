package unit1;
/**
 * Date: 10/04/2024
 * Description: Calculates the netpay
 * @author Gabriel Magnaye
 */
public class NetPay {
	/**
	 *This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
	
		//declare the variables
		double netPay;
		int hours = 40;
		double wage = 5.00;
		double insurance = 2.00;
		double tax = 0.22;
		netPay = (hours*wage-insurance) - tax*(hours*wage-insurance);

		//display the netpay
		System.out.println("The net pay is " + netPay);
	}

}
