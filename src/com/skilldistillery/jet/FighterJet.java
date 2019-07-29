package com.skilldistillery.jet;

public class FighterJet extends Jet implements Combat {
	
	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public void fight() {
		System.out.println(this.model + " is dogfighting high in the sky");
	}

	@Override
	public void load() {
		
	}

}
