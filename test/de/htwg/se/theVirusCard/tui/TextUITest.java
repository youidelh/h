package de.htwg.se.theVirusCard.tui;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import de.htwg.se.theVirusCard.controller.TheVirusCardController;
import de.htwg.se.theVirusCard.model.Hand;
public class TextUITest {

	private Hand hand1;
	private TheVirusCardController controller1;
	private TextUI tui1;

	@Before
	public void setUp() throws Exception {
		hand1 = new Hand(7);
		controller1 = new TheVirusCardController(hand1);
		tui1 = new TextUI(controller1);
	}

	@Test
	public void testHandleInput() {
		tui1.handleInputOrQuit("001");
		assertEquals(controller1.toString(),hand1.getHand());
		
		assertTrue(tui1.handleInputOrQuit("q"));
	}
}
