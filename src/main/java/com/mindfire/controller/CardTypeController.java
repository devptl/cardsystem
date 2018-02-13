package com.mindfire.controller;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindfire.model.Bank;
import com.mindfire.model.BankHasCardType;
import com.mindfire.model.CardType;
import com.mindfire.service.CardService;

@Controller
public class CardTypeController {
	
	CardService service;
	
	@Autowired
	public CardTypeController(CardService service) {
		this.service = service;
	}

	@PersistenceContext
	EntityManager entityManager;

	
	
	/**
	 * this function is to display the bank supporting cards select the particular
	 * bank and the card will be shown to you
	 * 
	 * @param bankhascardtypeobj
	 * @param model
	 * @return {@link String}
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "cardtypes", method = RequestMethod.POST)
	public String cardtypes(@ModelAttribute("bankhascardtype") BankHasCardType bankhascardtypeobj, ModelMap model) {

		ArrayList<CardType> s1 = new ArrayList<CardType>();
		int bid = bankhascardtypeobj.getBankBankId();
		Bank bankobj = service.oneBank(bid);
		CardType ctypeobj = new CardType();

		// To get the card type for a particular bank id
		// Native SQL Query
		String queryString = "SELECT ct.card_type_id, ct.card_type_name,ct.card_type_image "
				+ "FROM bank b, bank_has_card_type bct, card_type ct " + "WHERE b.bank_id = bct.bank_bank_id "
				+ "AND bct.card_type_card_type_id = ct.card_type_id " + "AND b.bank_id = " + bid; // Bank ID
		// Generate Query
		Query query = entityManager.createNativeQuery(queryString, CardType.class);
		// Map result set to list of Objects
		s1 = (ArrayList<CardType>) query.getResultList();
		DataController datacontrol = new DataController(service);

		datacontrol.initalil("showBankAndForm()", model, s1, ctypeobj);
		model.addAttribute("banks", bankobj);
		return "card";
	}

}
