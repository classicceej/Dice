package com.techelevator;

import java.util.Random;

public class D20 extends Mold {

	public int faceValue;

	public D20() {
		// TODO Auto-generated constructor stub
	}

	public int roll() {
		Random r = new Random();
		faceValue = r.nextInt(20);
		faceValue += 1;
		return faceValue;
	}

	public int getFaceValue() {
		return faceValue;
	}

}
