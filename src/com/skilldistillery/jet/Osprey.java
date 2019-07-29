package com.skilldistillery.jet;

public class Osprey extends Jet implements Combat {

	public Osprey(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fight() {
		System.out.println(this.model + " is fighting by hovering and strafing");
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		
	}

}
