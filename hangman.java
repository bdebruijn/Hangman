package opdracht;

import java.util.Scanner;

public class hangman {
	public static void main(String[] args) {

		System.out.println("Type een letter in: ");
		Scanner scanner = new Scanner(System.in);

		String woord = scanner.nextLine();

		switch (woord) {
		case "D":
			System.out.println("D.");
			break;
		case "E":
			System.out.println("E.");
			break;

		default:
			System.out.println("Got something else.");
			
			

		}
		scanner.nextLine();

	}

	/*
	 * int value = 0; Scanner scanner = new Scanner(System.in);
	 * 
	 * while (value != 5) { System.out.println("Enter the number 5: ");
	 * 
	 * if (scanner.hasNextInt()) { value = scanner.nextInt(); } else {
	 * scanner.nextLine(); } }
	 * 
	 * System.out.println("Got it!");
	 * 
	 * }
	 */

}
