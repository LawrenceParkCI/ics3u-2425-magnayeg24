package unit1;

/**
 * Description: This is a receipt printing program
 * Date: 
 * @author Gabriel Magnaye
 */

//Import for scanner
import java.util.Scanner;

//Import for date and time
import java.time.format.DateTimeFormatter;
import java.text.NumberFormat;
import java.time.LocalDateTime;

public class FinalAssignment {
	
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	
	public static void main(String[] args) {
		
		//Declaring all the variables
		String item1;
		double cost1;
		int quantity1;
		String item2;
		double cost2;
		int quantity2;
		double item1Price;
		double item2Price;
		double subtotal;
		double salesTax;
		double finalCost;
		
		//Formatting the date and time output
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();
			
		//Collecting user input
		
		System.out.println("|| $$$ \\\\\\ ========== \"|Gabe's Grocery|\" ========== /// $$$ ||");
		Scanner sc = new Scanner(System.in);
			System.out.println("\nWhat would you like to buy?" );
			item1 = sc.nextLine();
			System.out.println("How much does one cost?");
			cost1 = sc.nextDouble();
			System.out.println("How many would you like to buy?");
			quantity1 = sc.nextInt();
			
			System.out.println("\nWhat else would you like to buy?");
			sc.nextLine();
			item2 = sc.nextLine();
			System.out.println("How much does one cost?");
			cost2 = sc.nextDouble();
			System.out.println("How many would you like to buy");
			quantity2 = sc.nextInt();
			System.out.println("Thank you!");
		sc.close();
		
		//Calculating the final price for all the purchased items
			item1Price = cost1 * quantity1;
			item2Price = cost2 * quantity2;
			subtotal = item1Price + item2Price;
			salesTax = subtotal * 0.13;
			finalCost = subtotal + salesTax;
			
		//Formatting commands
			NumberFormat money = NumberFormat.getCurrencyInstance();
			int rndInt = (int) Math.round(finalCost);
			double rndFC =  Math.round(finalCost*20.0)/20.0;
			
		//Printing out the receipt
			
			System.out.println("Here is your receipt:\n");
			System.out.format("%-30s", "  ========== \\\"|Gabe's Grocery|\\\" ==========\n");
			System.out.println("\t\t"+dtf.format(now));
			System.out.println(" ");
			System.out.format("%-10s %-10s %-10s %-10s","|Item", "|Price", "|Quantity", "|Cost      |"); 
			System.out.println("\n=============================================");
			System.out.format("|%-10s|%10s|%10s|%10s|",item1,money.format(cost1),quantity1,money.format(item1Price));
			System.out.println("\n=============================================");
			System.out.format("|%-10s|%10s|%10s|%10s|",item2,money.format(cost2),quantity2,money.format(item2Price));
			System.out.println("\n=============================================");
			System.out.format("%36s %8s", "Subtotal:", money.format(subtotal));
			System.out.format("\n%36s %8s", "Sales Tax:", money.format(salesTax));
			System.out.format("\n%36s %8s", "Total:", money.format(finalCost));
			System.out.format("\n%36s %8s", "Total:", money.format(finalCost));
			System.out.format("\n%36s %8s", "Rounded to the nearest dollar:", money.format(rndInt));
			System.out.format("\n%36s %8s", "Rounded to the nearest 5 cents:", money.format(rndFC));
			
	}

}
