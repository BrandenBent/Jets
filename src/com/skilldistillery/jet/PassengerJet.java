package com.skilldistillery.jet;

public class PassengerJet extends Jet implements NonCombat {

	public PassengerJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void load() {
		System.out.println("Loading up all the passengers");
	}

	@Override
	public void unload() {
		System.out.println("Passengers are departing");
	}

}
