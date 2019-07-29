package com.skilldistillery.jet;

public class InvisibleJet extends Jet implements Combat {

	public InvisibleJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		
		
	}

	@Override
	public void fight() {
		System.out.println(this.model + " is fighting high up in the air, very very stealthily");
	}

	@Override
	public void load() {
		
	}

}
