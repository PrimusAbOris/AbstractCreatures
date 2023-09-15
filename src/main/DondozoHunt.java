package main;

import java.util.Scanner;

import animals.Dondozo;

public class DondozoHunt {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("How many iterations?");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Integer iter = Integer.parseInt(input);
		int shinyMod = 1;

		System.out.println("The chance is currently " + shinyMod + "/4096.\n"
					+ "Enter a new numerator.");
		String shinyModInput = scanner.nextLine();
		shinyMod = Integer.parseInt(shinyModInput);
		scanner.close();
		int total = 0;
		
		for (int i = 1; i <= iter; i++) {
			System.out.println("Dondozo " + i + " out of " + iter + " encountered at a "
					+ "shiny rate of " + shinyMod + "/4096.");
			Dondozo dondozo = new Dondozo("",shinyMod);
			// in this order, so the shiny message is last before pausing
			if (dondozo.shiny) {
				total++;
				Thread.sleep(504);
				dondozo.animalSound();
				Thread.sleep(504*2);
				System.out.println("Continuing.");
				Thread.sleep(504);
			}
		}
		
		System.out.println("Total fishing haul yielded " + total + " shiny Dondozo.\n"
				+ "Thank you for playing!");
	}

}
