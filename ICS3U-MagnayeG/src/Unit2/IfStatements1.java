package Unit2;
/**
 * Description: This is an if statements worksheet
 * Date: 11/05/2024
 * @author Gabriel Magnaye
 */

public class IfStatements1 {
	public static void main(String[] args) {
		int firstNum = 10;
		int secondNum = 30;

		System.out.println("Part 1: If");
		System.out.println("----------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGLUL");
		}    

		//What prints out? Why?
		//Nothing, because firstNum is not bigger than secondNum

		System.out.println("\nPart 2: If, Else");
		System.out.println("----------------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else {
			System.out.println("XQCL");
		}

		//What prints out? Why?
		//XQCL because firstNum is not bigger than secondNum, making the else statement true


		System.out.println("\nPart 3: If, Else if, Else");
		System.out.println("-------------------------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else if (firstNum % 2 == 0 && secondNum % 3 == 0){
			System.out.println("sykSHY");
		} else {
			System.out.println("XQCL");
		}

		//What prints out? Why?
		//sykSHY because firstNum isn't bigger than secondNum, but the condition for if else statement is fulfilled

		System.out.println("\nPart 4: What's the difference?");
		System.out.println("------------------------------");
		System.out.println(1);
		if (firstNum < secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else if (firstNum % 2 == 0 && secondNum % 3 == 0){
			System.out.println("sykSHY");
		} else {
			System.out.println("XQCL");
		}

		System.out.println(2);
		if (firstNum < secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		}

		if (firstNum % 2 == 0 && secondNum % 3 == 0){
			System.out.println("sykSHY");
		}

		if (!(firstNum < secondNum)) {
			System.out.println("XQCL");
		}

		//What prints out? Why?
		//1, KEKW, OMEGALUL, 2, KEKW, OMEGALUL and sykSHY all print out because in the first one, the condition is fulfilled in the if else statement immediately skipping the rest. However, in the second one, they are all different if statements, so they are all able to be fulfilled.
		//What is the difference between the first and second part?
		//The difference is tha in the first, it was all apart of one big if else statement, but in the second, they were all separate if statements
	}
}
