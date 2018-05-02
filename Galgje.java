package opdracht;

import java.util.Scanner;

public class Galgje {
	public static void main(String[] args) {

		System.out.println("Voer een letter in: ");

		Spelen spel = new Spelen();
		spel.galgjespel();

	}

}

class Spelen {
	boolean doorspelen = true;

	public void galgjespel(){

		while (doorspelen) {
			Scanner input = new Scanner(System.in);
			String woord = input.nextLine();

			String een = "b";
			String twee = "l";
			String drie = "o";
			String vier = "k";

			if (woord.equals(een)) {
				System.out.println("Juiste letter B...");
				System.out.println("Voer nog een letter in");
				input.nextLine();

			}  if (woord.equals(twee)){
				System.out.println("Juister letter .l..");
				System.out.println("Voer nog een letter in");
				input.nextLine();

			}  if (woord.equals(drie)){
				System.out.println("Juister letter ..o.");
				System.out.println("Voer nog een letter in");
				input.nextLine();

			}  if (woord.equals(vier)){
				System.out.println("Juister letter ...K");
				System.out.println("Voer nog een letter in");
				input.nextLine();

			}
		
		
		}
	}
}
