package com.skilldistillery.jet;

public class JetImpl extends Jet implements NonCombat {

	public JetImpl(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		System.out.println(this.getModel() + " is flying at " + this.getSpeed() + " miles per hour!");
	}

	@Override
	public void load() {
		
	}

	@Override
	public void unload() {
		
	}
	
}
