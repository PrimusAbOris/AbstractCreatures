package animals;

public abstract class Animal {
	/*
	 * Knock knock.
	 * 
	 * Who's there?
	 * 
	 * Cow goes.
	 * 
	 * Cow goes who?
	 * 
	 * No, cow goes moo!
	 */
	public abstract void animalSound();
	
	// All animals sleep the same way, for the purposes of this
	public void sleep() {
		System.out.println("ZzZzZzZz.....");
	}

}
