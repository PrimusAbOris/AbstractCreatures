package main;

import java.io.IOException;
import java.util.Scanner;

import animals.*;

public class FarmerGuyBarnyardInventoryApplication {

	public static void main(String[] args) throws IOException, InterruptedException {		
		Animal[] animals = {new Cow(), new Pig(), new Sheep(),
				new Snorlax(""), new Snorlax("awake"), new Articuno()};
		String[] names = {"Cow", "Pig", "Sheep", "Snorlax", "Borlax", "Articuno"};
		// Snorlax Borlax = (Snorlax)animals[4];    not used yet
		
		System.out.println("The animals currently in your inventory are:");
		for (String n : names) {
			System.out.print(n + " | ");
		}
		System.out.println();
		
		if (!askYN()) {
			System.out.println("Sorry to hear that, but that isn't handled yet.");
			Thread.sleep((Snorlax.maxHP)*4);
			System.out.println();
		}
		
		int i = 0;
		for (Animal a : animals) {
			System.out.println(names[i] + ":");
			a.animalSound();
			a.sleep();
			System.out.println();
			i++;
		}

		System.out.println(Snorlax.maxHP + " " + Snorlax.maxHP + " " + Articuno.maxHP);
		Articuno.sheerCold(8);
	}
	
	public static boolean askYN() throws InterruptedException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Alright? (yes/no): ");
		String input = sc.nextLine().toLowerCase(); // not case sensitive
		sc.close();

		if (input.equals("yes")) return true;
		else if (input.equals("no")) return false;
		else {
			System.out.println("Invalid input. I take it as a yes!");
			Thread.sleep((Snorlax.maxHP)*4);
			return true;
		}

	}
}