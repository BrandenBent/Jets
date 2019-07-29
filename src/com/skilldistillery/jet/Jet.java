package com.skilldistillery.jet;

public abstract class Jet {

	// fields
	protected String model;
	protected double speed;
	protected int range;
	protected long price;

	// constructors
	public Jet(String model, double speed, int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	// gets/sets

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getSpeed() {
		return speed;
	}

	// methods

	public void fly() {
		System.out.println(this.getModel() + " is flying at " + this.getSpeed() + " miles per hour!");
		setSpeed(this.speed);
		System.out.println();

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jet [model=");
		builder.append(model);
		builder.append(", speed=");
		builder.append(speed);
		builder.append(", range=");
		builder.append(range);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}

	public void load() {
		System.out.println("test");

	}

	public void unload() {

	}
	
	public void fight() {
		
	}

}
