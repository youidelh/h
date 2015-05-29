package de.htwg.se.theVirusCard.model;

public class Card {
	private int number;
	
	
	public Card(int numb){
		number = numb;
	}
	
	public int getCard(){
		return number;
	}
	
	
	public String toString() {	
		
		return getCard()+"";
	}

}
