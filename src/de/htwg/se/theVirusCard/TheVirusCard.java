package de.htwg.se.theVirusCard;

import de.htwg.se.theVirusCard.controller.TheVirusCardController;
import de.htwg.se.theVirusCard.model.Hand;
import de.htwg.se.theVirusCard.tui.TextUI;



public class TheVirusCard {
	public static void main(String[] args) {
		TextUI tui = new TextUI(new TheVirusCardController(new Hand(7)));
		tui.printTUI();
		// continue until the user decides to quit
		boolean quit = false;
		while (!quit) {
		    quit = tui.iterate();
		}
	}

}
