package com.techelevator;

import java.util.Scanner;

public class TavernDice {

	public static void main(String[] args) {


		//SET PLAYERS AND PLAYER NAME
		//SET PLAYERS AND PLAYER NAME
		//SET PLAYERS AND PLAYER NAME
		//SET PLAYERS AND PLAYER NAME
		Scanner scanner = new Scanner(System.in);

		System.out.println("What's your name, kid?");

		String name = scanner.nextLine();
		Player p1 = new Player(1, name);

		
		//RULES
		//RULES
		//RULES
		//RULES
		System.out.println("\nHey ya, " + name + "! Ever play 3s before?\t Y/N");

		String response = scanner.nextLine();

		if (response.toUpperCase().contentEquals("N")) {
			System.out.println(
					"\nThe rules are simple:\n\n\tRoll five dice\n\tKeep one or more die\n\tReroll the remaining until you're out of dice\n\t3s are worth 0 and the lowest score wins\n");
		} else {
			System.out.print("\nAlright, hotshot. ");
		}

		//ENTER GAME PHASE
		//ENTER GAME PHASE
		//ENTER GAME PHASE
		//ENTER GAME PHASE
		Boolean cont = true;
		while (cont = true) {

			System.out.println("Let's roll those bones!\n");

			p1.getPlayerHand().refreshHand();

			p1.result();

			System.out.println("\n\nWhat're you keeping, " + name + "?");
			System.out.println("Pick dice by entering the letter associated with the roll");

			String response1 = scanner.nextLine();
			System.out.println();

			if (response1.toUpperCase().contains("A")) {
				p1.getPlayerHand().getHand().get("A").lockDie();
			} else {
				p1.getPlayerHand().getHand().get("A").roll();
			}
			if (response1.toUpperCase().contains("B")) {
				p1.getPlayerHand().getHand().get("B").lockDie();
			} else {
				p1.getPlayerHand().getHand().get("B").roll();
			}
			if (response1.toUpperCase().contains("C")) {
				p1.getPlayerHand().getHand().get("C").lockDie();
			} else {
				p1.getPlayerHand().getHand().get("C").roll();
			}
			if (response1.toUpperCase().contains("D")) {
				p1.getPlayerHand().getHand().get("D").lockDie();
			} else {
				p1.getPlayerHand().getHand().get("D").roll();
			}
			if (response1.toUpperCase().contains("E")) {
				p1.getPlayerHand().getHand().get("E").lockDie();
			} else {
				p1.getPlayerHand().getHand().get("E").roll();
			}

			p1.result();

			if (p1.getPlayerHand().getHand().get("A").isLocked() && p1.getPlayerHand().getHand().get("B").isLocked()
					&& p1.getPlayerHand().getHand().get("C").isLocked()
					&& p1.getPlayerHand().getHand().get("D").isLocked()
					&& p1.getPlayerHand().getHand().get("E").isLocked()) {
			} else {
				System.out.println("\n\nWhat're you keeping, " + name + "?");

				String response2 = scanner.nextLine();
				System.out.println();

				if (response2.toUpperCase().contains("A")) {
					p1.getPlayerHand().getHand().get("A").lockDie();
				} else if (!p1.getPlayerHand().getHand().get("A").isLocked()) {
					p1.getPlayerHand().getHand().get("A").roll();
				}
				if (response2.toUpperCase().contains("B")) {
					p1.getPlayerHand().getHand().get("B").lockDie();
				} else if (!p1.getPlayerHand().getHand().get("B").isLocked()) {
					p1.getPlayerHand().getHand().get("B").roll();
				}
				if (response2.toUpperCase().contains("C")) {
					p1.getPlayerHand().getHand().get("C").lockDie();
				} else if (!p1.getPlayerHand().getHand().get("C").isLocked()) {
					p1.getPlayerHand().getHand().get("C").roll();
				}
				if (response2.toUpperCase().contains("D")) {
					p1.getPlayerHand().getHand().get("D").lockDie();
				} else if (!p1.getPlayerHand().getHand().get("D").isLocked()) {
					p1.getPlayerHand().getHand().get("D").roll();
				}
				if (response2.toUpperCase().contains("E")) {
					p1.getPlayerHand().getHand().get("E").lockDie();
				} else if (!p1.getPlayerHand().getHand().get("E").isLocked()) {
					p1.getPlayerHand().getHand().get("E").roll();
				}

				p1.result();

			}

			if (p1.getPlayerHand().getHand().get("A").isLocked() && p1.getPlayerHand().getHand().get("B").isLocked()
					&& p1.getPlayerHand().getHand().get("C").isLocked()
					&& p1.getPlayerHand().getHand().get("D").isLocked()
					&& p1.getPlayerHand().getHand().get("E").isLocked()) {
			} else {
				System.out.println("\n\nWhat're you keeping, " + name + "?");

				String response3 = scanner.nextLine();
				System.out.println();

				if (response3.toUpperCase().contains("A")) {
					p1.getPlayerHand().getHand().get("A").lockDie();
				} else if (!p1.getPlayerHand().getHand().get("A").isLocked()) {
					p1.getPlayerHand().getHand().get("A").roll();
				}
				if (response3.toUpperCase().contains("B")) {
					p1.getPlayerHand().getHand().get("B").lockDie();
				} else if (!p1.getPlayerHand().getHand().get("B").isLocked()) {
					p1.getPlayerHand().getHand().get("B").roll();
				}
				if (response3.toUpperCase().contains("C")) {
					p1.getPlayerHand().getHand().get("C").lockDie();
				} else if (!p1.getPlayerHand().getHand().get("C").isLocked()) {
					p1.getPlayerHand().getHand().get("C").roll();
				}
				if (response3.toUpperCase().contains("D")) {
					p1.getPlayerHand().getHand().get("D").lockDie();
				} else if (!p1.getPlayerHand().getHand().get("D").isLocked()) {
					p1.getPlayerHand().getHand().get("D").roll();
				}
				if (response3.toUpperCase().contains("E")) {
					p1.getPlayerHand().getHand().get("E").lockDie();
				} else if (!p1.getPlayerHand().getHand().get("E").isLocked()) {
					p1.getPlayerHand().getHand().get("E").roll();
				}

				p1.result();
			}

			if (p1.getPlayerHand().getHand().get("A").isLocked() && p1.getPlayerHand().getHand().get("B").isLocked()
					&& p1.getPlayerHand().getHand().get("C").isLocked()
					&& p1.getPlayerHand().getHand().get("D").isLocked()
					&& p1.getPlayerHand().getHand().get("E").isLocked()) {
			} else {
				System.out.println("\n\nWhat're you keeping, " + name + "?");

				String response4 = scanner.nextLine();
				System.out.println();

				if (response4.toUpperCase().contains("A")) {
					p1.getPlayerHand().getHand().get("A").lockDie();
				} else if (!p1.getPlayerHand().getHand().get("A").isLocked()) {
					p1.getPlayerHand().getHand().get("A").roll();
				}
				if (response4.toUpperCase().contains("B")) {
					p1.getPlayerHand().getHand().get("B").lockDie();
				} else if (!p1.getPlayerHand().getHand().get("B").isLocked()) {
					p1.getPlayerHand().getHand().get("B").roll();
				}
				if (response4.toUpperCase().contains("C")) {
					p1.getPlayerHand().getHand().get("C").lockDie();
				} else if (!p1.getPlayerHand().getHand().get("C").isLocked()) {
					p1.getPlayerHand().getHand().get("C").roll();
				}
				if (response4.toUpperCase().contains("D")) {
					p1.getPlayerHand().getHand().get("D").lockDie();
				} else if (!p1.getPlayerHand().getHand().get("D").isLocked()) {
					p1.getPlayerHand().getHand().get("D").roll();
				}
				if (response4.toUpperCase().contains("E")) {
					p1.getPlayerHand().getHand().get("E").lockDie();
				} else if (!p1.getPlayerHand().getHand().get("E").isLocked()) {
					p1.getPlayerHand().getHand().get("E").roll();
				}

				p1.result();
			}

			if (p1.getPlayerHand().getHand().get("A").isLocked() && p1.getPlayerHand().getHand().get("B").isLocked()
					&& p1.getPlayerHand().getHand().get("C").isLocked()
					&& p1.getPlayerHand().getHand().get("D").isLocked()
					&& p1.getPlayerHand().getHand().get("E").isLocked()) {
			} else {
				System.out.println("\n\nWhat're you keeping, " + name + "?");

				String response5 = scanner.nextLine();
				System.out.println();

				if (response5.toUpperCase().contains("A")) {
					p1.getPlayerHand().getHand().get("A").lockDie();
				} else if (!p1.getPlayerHand().getHand().get("A").isLocked()) {
					p1.getPlayerHand().getHand().get("A").roll();
				}
				if (response5.toUpperCase().contains("B")) {
					p1.getPlayerHand().getHand().get("B").lockDie();
				} else if (!p1.getPlayerHand().getHand().get("B").isLocked()) {
					p1.getPlayerHand().getHand().get("B").roll();
				}
				if (response5.toUpperCase().contains("C")) {
					p1.getPlayerHand().getHand().get("C").lockDie();
				} else if (!p1.getPlayerHand().getHand().get("C").isLocked()) {
					p1.getPlayerHand().getHand().get("C").roll();
				}
				if (response5.toUpperCase().contains("D")) {
					p1.getPlayerHand().getHand().get("D").lockDie();
				} else if (!p1.getPlayerHand().getHand().get("D").isLocked()) {
					p1.getPlayerHand().getHand().get("D").roll();
				}
				if (response5.toUpperCase().contains("E")) {
					p1.getPlayerHand().getHand().get("E").lockDie();
				} else if (!p1.getPlayerHand().getHand().get("E").isLocked()) {
					p1.getPlayerHand().getHand().get("E").roll();
				}

			}

			
			// ACTION PHASE
			// ACTION PHASE
			// ACTION PHASE
			// ACTION PHASE
			System.out.println("\nPssst, wanna cheat? Y/N");
			String fudge1 = scanner.nextLine();

			if (fudge1.toUpperCase().contains("Y")) {
				p1.fudge();
			} else {
				System.out.println("Okay, goodie goodie...");
			}
			
			
			
			//RESULTS PHASE
			//RESULTS PHASE
			//RESULTS PHASE
			//RESULTS PHASE
			System.out.println("\n\nTHE RESULTS ARE IN!\n\n" + p1.getPlayerHand().getHand().get("A").getFaceValue()
					+ " + " + p1.getPlayerHand().getHand().get("B").getFaceValue() + " + "
					+ p1.getPlayerHand().getHand().get("C").getFaceValue() + " + "
					+ p1.getPlayerHand().getHand().get("D").getFaceValue() + " + "
					+ p1.getPlayerHand().getHand().get("E").getFaceValue() + "\n\nYour final score is: "
					+ p1.total());

			if (p1.total() == 0) {
				System.out.println("\nOkay you fucking cheated");
			} else if (p1.total() > 0 && p1.total() <= 5) {
				System.out.println("\nDamn, " + name
						+ "!\nYou were all like \"clickity-clackity-clickity-clackity\" and everybody was like \"Whaaaaat?\"");
			} else if (p1.total() > 5 && p1.total() <= 8) {
				System.out.println("\nNot too shabby " + name);
			} else if (p1.total() > 8 && p1.total() <= 12) {
				System.out.println("\nWanna play for money?");
			} else {
				System.out
						.println("\nThe sum total of idiots in this world is equal to it's population plus one because "
								+ name.toUpperCase() + " COUNTS TWICE!");
			}

			System.out.println();

			System.out.println("Would you like to play again?  Y/N \n");

			String reset = scanner.nextLine();

			if (reset.toUpperCase().contains("Y")) {
				System.out.println();
			} else {
				cont = false;
				break;
			}

		}
		System.out.println("Toodles, " + name + "!");
	}
}
