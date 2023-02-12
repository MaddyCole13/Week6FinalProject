package warCardGame.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import warCardGame.Card;

class WarTest {

	@Test
	void cardTest01() {
		assertEquals ("Ace", Card.calculateValue(14)); 
	}

}
