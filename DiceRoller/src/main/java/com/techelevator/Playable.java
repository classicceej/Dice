package com.techelevator;

public interface Playable {

	int getFaceValue();
	boolean isLocked();
	public int roll();
	public void lockDie();
	public void refreshDie();
}

