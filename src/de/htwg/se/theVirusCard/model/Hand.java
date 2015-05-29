package de.htwg.se.theVirusCard.model;

import java.awt.List;
import java.util.LinkedList;
import java.util.Random;

public class Hand {
	private LinkedList<Card> hand;
	private int countOfCards;
	private int maxCountOfCards;
	
	public Hand(int size) throws IllegalArgumentException{
		if (size <= 5) throw new IllegalArgumentException("Count of Cards must be 5 or higher");
		hand = new LinkedList<Card>();
		for(int i =0; i<size ; i++){
			Random r = new Random();
			int randomInt = r.nextInt(100) + 1;
			while(hand.contains(randomInt) || randomInt == 96){
				randomInt = r.nextInt(100) + 1;
			}
			Card c = new Card(randomInt);
			hand.add(c);
		}
		maxCountOfCards = size;
		countOfCards = 0;
	}
	
	public void addCard(Card c) {
		if (countOfCards <= maxCountOfCards){
			hand.add(c);
			countOfCards++;
		}
		else {
			//TODO: Throw Exception: zu viel Karten
		}
	}
	public String getHand(){
		return toString();
		
	}
	public void removeCard(Card c){
		hand.remove(c);
		countOfCards--;
	}
	
	public boolean isUnSet() {
		return !isSet();
	}

	public boolean isSet() {
		return countOfCards == 0 ? false : true;
	}

	public String toString() {	
		return hand.toString();
	}
	
}
