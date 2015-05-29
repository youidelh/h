package de.htwg.se.theVirusCard.tui;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import de.htwg.se.theVirusCard.controller.TheVirusCardController;
import de.htwg.se.util.observer.IObserver;

public class TextUI implements IObserver {
	private TheVirusCardController controller;
	Scanner scanner;


	@Override
	public void update() {
		printTUI();
	}

	public void printTUI() {
		System.out.println(controller.getStatus());
		System.out.println(controller.toString());
		System.out.println("Please enter a command( q - quit):");

	}
	public TextUI(TheVirusCardController controller){
		this.controller = controller;
		controller.addObserver(this);
		scanner = new Scanner (System.in);
	}
	public boolean iterate() {
		return handleInputOrQuit(scanner.next());
	}
	public boolean handleInputOrQuit(String line) {	
		boolean quit=false;
		if (line.equalsIgnoreCase("q")) {
			quit=true;
		}		
		return quit;
	}
}
