package unit1;
/*
 * Description: This program prints my information
 * Date: 09/20/2024
 * @author Gabriel Magnaye
 */

public class Bingo {

	public static void main(String[] args) {
		
		//Rules
		System.out.println("Bingo Card");
		System.out.println(" ");
		System.out.println("     1. The caller pulls a random numbered bingo ball from a machine.");
		System.out.println("     2. The caller announces the number on the ball while the players attempt to locate it on their card.");
		System.out.println("     3. If the player has that number on their card, they will mark it off.");
		System.out.println("     4. If a player has made a line out of five marked off numbers, they will say \"Bingo\".");
		System.out.println("     5. The first player to do so wins the game.");
		
		//Bingo Card
		System.out.println("\n\nBingo Card example:\n");
		System.out.println("\t_______________________________");
		System.out.format("\t%-5s %-5s %-5s %-5s %-5s", "|  B", "|  I", "|  N", "|  G","|  O  |");
		System.out.format("\n\t%-5s %-5s %-5s %-5s %-5s", "|  1", "|  19", "|  37", "|  54", "|  69 |");
		System.out.format("\n\t%-5s %-5s %-5s %-5s %-5s", "|  6", "|  27", "|  41", "|  60", "|  72 |");
		System.out.format("\n\t%-5s %-5s %-5s %-5s %-5s", "|  2", "|  16", "|Free", "|  59", "|  74 |");
		System.out.format("\n\t%-5s %-5s %-5s %-5s %-5s", "|  14", "|  30", "|  31", "|  49", "|  63 |");
		System.out.format("\n\t%-5s %-5s %-5s %-5s %-5s", "|  11", "|  23", "|  45", "|  51", "|  70 |");
		System.out.println("\n\t|_____|_____|_____|_____|_____|");
}

}