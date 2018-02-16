package com.mindfire.testing;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mindfire.model.CardType;
import com.mindfire.service.CardService;

public class Testing {

	
	private CardService service;
	
	@Autowired
	public Testing(CardService service) {
	  this.service=service;
	}
	
	
	@Test
	public void test() {
		
		CardType c = service.oneCardTypes(201);
		int cid = c.getCardTypeId();
		
		assertEquals(201, cid);
	}

}
