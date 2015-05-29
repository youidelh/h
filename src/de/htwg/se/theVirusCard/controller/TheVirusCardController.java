package de.htwg.se.theVirusCard.controller;

import de.htwg.se.theVirusCard.model.Card;
import de.htwg.se.theVirusCard.model.Hand;
import de.htwg.se.util.observer.Observable;


public class TheVirusCardController extends Observable{
	private String statusMessage = "Welcome to HTWG The Virus Card!";
	private Hand hand;
	
	public TheVirusCardController(Hand hand) {
		this.hand = hand;
	}
	public void setValue(int number) {
		Card card = new Card(number);
		if (hand.isUnSet()) {
			hand.addCard(card);
			setStatusMessage("The Hand " + hand.toString() + " was successfully set");
		} else setStatusMessage("The Hand " + hand.toString() + " is already set");
		notifyObservers();
		
	}
	public String getStatus() {
		return statusMessage;
	}
	private void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	
	public String toString() {	
		return hand.toString();
	}
}
