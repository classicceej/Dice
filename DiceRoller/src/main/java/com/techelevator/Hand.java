package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Hand {

	private Map<String, Playable> hand;
	private final String[] DICE_KEYS = new String[] { "A", "B", "C", "D", "E" };

	public Hand() {
		hand = new TreeMap<String, Playable>();
		for (int i = 0; i < 5; i++) {
			Die newDie = new Die();
			newDie.roll();
			String key = DICE_KEYS[i];
			hand.put(key, newDie);
		}

	}

	public void refreshHand() {
		for (int i = 0; i < 5; i++) {
			String key = DICE_KEYS[i];
			hand.get(key).refreshDie();
			;
		}
	}


	public Map<String, Playable> getHand() {
		return hand;
	}

}
