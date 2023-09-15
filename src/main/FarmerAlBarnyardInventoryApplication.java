package main;

import animals.*;

public class FarmerAlBarnyardInventoryApplication {

	public static void main(String[] args) {
		// New solution
		
		Animal[] animals = {new Cow(), new Pig(), new Sheep(),
				new Snorlax(""), new Snorlax("awake"), new Articuno()};
		String[] names = {"Cow", "Pig", "Sheep", "Snorlax", "Borlax", "Articuno"};
		Snorlax Borlax = (Snorlax)animals[4];
		
		int i = 0;
		
		for (Animal a : animals) {
			System.out.println(names[i] + ":");
			a.animalSound();
			a.sleep();
			System.out.println();
			i++;
		}

		System.out.println(Snorlax.maxHP + " " + Borlax.maxHP + " " + Articuno.maxHP);
		Articuno.sheerCold(8);
	}
}