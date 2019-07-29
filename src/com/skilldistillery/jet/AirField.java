package com.skilldistillery.jet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {

	protected List<Jet> jets = new ArrayList<>();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AirField [jets=");
		builder.append(jets);
		builder.append("]");
		return builder.toString();
	}

	
	public AirField() {
		
	}
	public AirField(AirField jets) {
		this.jets = (List<Jet>) jets;
	}

	public ArrayList<Jet> getAirfield() {
		return getAirfield();

	}
// Gets/sets

	// forgot one
	public void setJets(List<Jet> jets) {
		this.jets = jets;
	}

	public List<Jet> getJets() {
		return jets;
	}

	// methods

	public void userAddJet(Scanner sc, Jet jet) {
		int choice = 0;
		System.out.println("What type of jet are you adding?");
		System.out.println("1.) Combat");
		System.out.println("2.) NonCombat");
		System.out.println("3.) Cancel");
		choice = sc.nextInt();

		if (choice == 1) {
			System.out.println("What model is the jet?");
			String model = sc.next();
			System.out.println("What is the jet's max speed?");
			Double speed = sc.nextDouble();
			System.out.println("What is the range of the jet?");
			Integer range = sc.nextInt();
			System.out.println("How much does the jet cost?");
			Integer price = sc.nextInt();
			jet = new FighterJet(model, speed, range, price);
			jets.add(jet);
			System.out.println("The " + jet.getModel() + " has been added to the fleet!");
			return;
		}
		if (choice == 2) {
			System.out.println("What model is the jet?");
			String model = sc.next();
			System.out.println("What is the jet's max speed?");
			Double speed = sc.nextDouble();
			System.out.println("What is the range of the jet?");
			Integer range = sc.nextInt();
			System.out.println("How much does the jet cost?");
			Integer price = sc.nextInt();
			jet = new JetImpl(model, speed, range, price);
			jets.add(jet);
			System.out.println("The " + jet.getModel() + " has been added to the fleet!");
			return;

		}
		if (choice == 3) {
			return;
		}

	}

	public void listFleet() {
		int index = 1;
		for (Jet jet : jets) {
			if (jet != null) {
				System.out.print("" + index + ".)");
				System.out.println(jet.getModel().toString());
				index++;
			} else
				System.out.println("error");
		}
	}

	public void viewFastest() {
		double fastestSpeed = 0;
		int index = 0;
		for (int i = 0; i < jets.size(); i++) {
			if (jets.get(i) != null) {
				if (jets.get(i).getSpeed() > fastestSpeed) {
					fastestSpeed = jets.get(i).getSpeed();
					index = i;
				}
			}
		}
		System.out.println("The fastest Jet in the fleet is " + jets.get(index).getModel() + " it can fly at " + jets.get(index).getSpeed() + " MPH!");
	}

	public void viewFarthest() {
		int farthestRange = 0;
		int index = 0;
		for (int i = 0; i < jets.size(); i++) {
			if (jets.get(i) != null) {
				if (jets.get(i).getRange() > farthestRange) {
					farthestRange = jets.get(i).getRange();
					index = i;
				}
			}
		}
		System.out.println("The farthest flying jet is " + jets.get(index).getModel() + " it can fly " + jets.get(index).getRange() + " miles without refueling!");
	}

	public void loadCargo() {
		for (Jet jet : jets) {
			if (jet != null) {
				if (jet instanceof CargoPlane) {
					jet.load();
					
				}

			}
		}

	}

	public void flyAllJets() {
		for (Jet jet : jets) {
			jet.fly();
		}
	}

	public void jetFight() {
		for (Jet jet : jets) {
			if (jet instanceof Combat) {
				jet.fight();
			}
		}

	}

	public void removeJet(Scanner sc) {
		System.out.println("Which Jet would you like to remove?");
		listFleet();
		int choice = (sc.nextInt() - 1);
		System.out.println(jets.get(choice) + " is being dismantled for parts");
		jets.remove(choice);
	}

	public void addJet(Jet jet) {
		jets.add(jet);
	}

}
