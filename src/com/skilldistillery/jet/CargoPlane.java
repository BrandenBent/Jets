package com.skilldistillery.jet;

public class CargoPlane extends Jet implements NonCombat{
	
	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		
	}

	@Override
	public void load() {
		System.out.println("Cargo is being loaded into the " + this.model);
	}

	@Override
	public void unload() {
		System.out.println("Cargo is being unloaded from the " + this.model);

	}
//	public void loadCargo() {
//		System.out.println("testing");
//	}
//	
}



