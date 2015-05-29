package de.htwg.se.theVirusCard.controller;

import static org.junit.Assert.assertEquals;

import java.awt.List;
import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

import de.htwg.se.theVirusCard.model.Card;
import de.htwg.se.theVirusCard.model.Hand;
public class ControllerTest {
	String newLine = System.getProperty("line.separator");

	private Hand hand1;
	TheVirusCardController controller1;

	@Before
	public void setUp() throws Exception {
		hand1 =new Hand(7);
		controller1 = new TheVirusCardController(hand1);
	}

	@Test
	public void testHand() {
		
		controller1.setValue(7);
		String a = hand1.getHand();
		assertEquals(a, hand1.getHand());
		assertEquals("The Hand " + hand1.toString() + " was successfully set", controller1.getStatus());
		controller1.setValue(9);
		assertEquals(a, hand1.getHand());
		assertEquals("The Hand " + hand1.toString() + " is already set", controller1.getStatus());	
	}
	
	@Test
	public void testString() {
		assertEquals(hand1.getHand(),controller1.toString());
	}


}
