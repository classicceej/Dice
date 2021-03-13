package com.techelevator;

import java.util.Scanner;

public class Player {
	private String name;
	private int playerNumber;
	private Integer sleight = 0;
	private Integer perception = 0;
	private Hand playerHand = new Hand();
	private D20 p20 = new D20();

	public Player(int playerNumber, String name) {
		this.playerNumber = playerNumber;
		this.name = name;
	}

	public void fudge() {
		Scanner fudger = new Scanner(System.in);
		System.out.println("Which Die are you changing? \n");
		String key = fudger.nextLine();
		System.out.println("What are you changing it's value to? ");
		String fake = fudger.nextLine();
		int i = Integer.parseInt(fake);
		FakeDie f = new FakeDie();
		f.setFaceValue(i);
		f.isLocked();
		getPlayerHand().getHand().put(key, f);

	}

	public void result() {
		String output = " ";
		for (String d : playerHand.getHand().keySet()) {
			output += playerHand.getHand().get(d).getFaceValue() + "\t ";
		}
		System.out.println(output);
		System.out.print("[A] \t");
		System.out.print("[B] \t");
		System.out.print("[C] \t");
		System.out.print("[D] \t");
		System.out.print("[E] \n");
	}
	
	
	public void swap() {
		
	}
	
	public void watch() {
		
	}
	
	public int total() {
		int total = 0;
		for (String d : playerHand.getHand().keySet()) {
			if (playerHand.getHand().get(d).getFaceValue() != 3) {
				total += playerHand.getHand().get(d).getFaceValue();
			}
		}
		return total;
	}


	public String getName() {
		return name;
	}

	public Integer getSleight() {
		return sleight;
	}

	public Integer getPerception() {
		return perception;
	}

	public Hand getPlayerHand() {
		return playerHand;
	}

	public int getPlayerNumber() {
		// TODO Auto-generated method stub
		return playerNumber;
	}

}
