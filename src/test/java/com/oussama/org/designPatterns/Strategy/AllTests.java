package com.oussama.org.designPatterns.Strategy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

public class AllTests {

	@Test
	public void PaypalCardTest() {
		CardOperator card = new PaypalCard();
		assertEquals("Transaction Successful By PaypalCard", card.Transaction());
	}


	@Test
	public void MasterCardTest() {
		CardOperator card = new MasterCard();
		assertEquals("Transaction Successful By MasterCard", card.Transaction());
	}


}


 
	