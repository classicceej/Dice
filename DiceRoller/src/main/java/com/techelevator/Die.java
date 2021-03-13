package com.techelevator;
import java.util.Random;


public class Die implements Playable{
	private int faceValue;
	private boolean locked;
	//Instance
	
	public Die() {
		faceValue = 1;
		locked = false;
	}  // Constructor
	
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
	
	public boolean isLocked(){
		return locked;
	}
}

