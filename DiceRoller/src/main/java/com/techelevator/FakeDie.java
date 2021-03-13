package com.techelevator;

import java.util.Random;

public class FakeDie extends Die {

	public FakeDie() {
		locked = true;
	}

	private int faceValue;
	private boolean locked;
	//Instance
	
	public void lockDie() {
		locked = true;
	}
	
	public void refreshDie() {
		locked = false;
	}
	
	public int roll() {
		Random r = new Random();
		faceValue = r.nextInt(6);
		faceValue += 1;
		return faceValue;
	}
	
	
	public int getFaceValue(){
		return faceValue;
	}
	
	
	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	}

	public boolean isLocked(){
		return locked;
	}
}