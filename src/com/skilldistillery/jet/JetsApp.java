package com.skilldistillery.jet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class JetsApp {
//	AirField airfield;
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		JetsApp app = new JetsApp();
		AirField jets = new AirField();
		jets = makeJets(jets);
		app.run(jets);

	}

	private static AirField makeJets(AirField jets) {
		try (BufferedReader br = new BufferedReader(new FileReader("Jets.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] catchWord = line.split(", ");
				String model = catchWord[0].trim();
				if (catchWord[0].contains("Combat F")) {
					double speed = Double.parseDouble(catchWord[1]);
					int range = Integer.parseInt(catchWord[2]);
					int price = Integer.parseInt(catchWord[3]);
					Jet jet = new FighterJet(model, speed, range, price);
					jets.addJet(jet);
				}
				if (catchWord[0].contains("Invisible")) {
					double speed = Double.parseDouble(catchWord[1]);
					int range = Integer.parseInt(catchWord[2]);
					int price = Integer.parseInt(catchWord[3]);
					Jet jet = new InvisibleJet(model, speed, range, price);
					jets.addJet(jet);
				}if (catchWord[0].contains("Osprey")) {
					double speed = Double.parseDouble(catchWord[1]);
					int range = Integer.parseInt(catchWord[2]);
					int price = Integer.parseInt(catchWord[3]);
					Jet jet = new Osprey(model, speed, range, price);
					jets.addJet(jet);
				}
				if (catchWord[0].contains("Cargo")) {
					double speed = Double.parseDouble(catchWord[1]);
					int range = Integer.parseInt(catchWord[2]);
					int price = Integer.parseInt(catchWord[3]);
					Jet jet = new CargoPlane(model, speed, range, price);
					jets.addJet(jet);
				} else if ((!catchWord[0].contains("Combat") && (!catchWord[0].contains("Cargo")))) {
					double speed = Double.parseDouble(catchWord[1]);
					int range = Integer.parseInt(catchWord[2]);
					int price = Integer.parseInt(catchWord[3]);
					Jet jet = new JetImpl(model, speed, range, price);
					jets.addJet(jet);
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		return jets;
	}

	private void run(AirField jets) {
		displayUserMenu(sc, jets);
	}

	public void displayUserMenu(Scanner sc, AirField airfield) {
		System.out.println("Welcome to the Airstrip, choose an option to interact with the jets:");
		System.out.println("1.) List Fleet");
		System.out.println("2.) Fly ALL Jets");
		System.out.println("3.) View Fastest Jet");
		System.out.println("4.) View Jet With Longest Range");
		System.out.println("5.) Load the cargo jet");
		System.out.println("6.) Dogfight!");
		System.out.println("7.) Add A Jet To The Fleet");
		System.out.println("8.) Remove A Jet From The Fleet");
		System.out.println("9.) Leave The Airstrip");
		char choice = sc.next().charAt(0);

		while (choice != 9) {
			if (choice == '1') {
				System.out.println("These are all the jets in the airfield at the moment: \n");
				airfield.listFleet();
				System.out.println();
				displayUserMenu(sc, airfield);
			}

			if (choice == '2') {
				System.out.println();
				airfield.flyAllJets();
				System.out.println();
				displayUserMenu(sc, airfield);
			}

			if (choice == '3') {
				System.out.println();
				airfield.viewFastest();
				System.out.println();
				displayUserMenu(sc, airfield);
			}

			if (choice == '4') {
				airfield.viewFarthest();
				System.out.println();
				displayUserMenu(sc, airfield);
			}

			if (choice == '5') {
				System.out.println();
				airfield.loadCargo();
				System.out.println();
				displayUserMenu(sc, airfield);

			}

			if (choice == '6') {

				airfield.jetFight();
				System.out.println();
				displayUserMenu(sc, airfield);

			}

			if (choice == '7') {
				airfield.userAddJet(sc, null);
				System.out.println();
				displayUserMenu(sc, airfield);

			}

			if (choice == '8') {
				airfield.removeJet(sc);
				System.out.println();
				displayUserMenu(sc, airfield);
			}
			if (choice == '9') {
				break;
			}
		}

	}

}
