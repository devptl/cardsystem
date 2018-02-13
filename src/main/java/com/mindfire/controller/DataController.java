/**
 * The controller class for getting customer from database
 */

package com.mindfire.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mindfire.model.Bank;
import com.mindfire.model.BankHasCardType;
import com.mindfire.model.InCard;
import com.mindfire.model.CardType;
import com.mindfire.service.CardService;
import com.mindfire.service.Display;

@Controller
public class DataController {

	CardService service;

	@Autowired
	public DataController(CardService service) {
		this.service = service;
	}
	
	@GetMapping("/api/bankhascardtypes")
	@ResponseBody
	public ArrayList<BankHasCardType> bankHasCardTypes() {
		return service.bankHasCardTypes();
	}

	/**
	 * function to initialise the components
	 * 
	 * @param displayvalue
	 * @param model
	 * @param bank object
	 * @param cardtype list
	 * @param cardtype
	 */
	public void initalil(String displayvalue, ModelMap model, ArrayList<CardType> cardtypesobj, CardType ctype) {
		// initialising card object
		model.put("card", new InCard());
		InCard c1 = new InCard();
		model.addAttribute("cardobj", c1);

		// initialising the display for home screen
		Display d1 = new Display();
		d1.setBody_display(displayvalue);
		model.addAttribute("display", d1);

		// intialise particular bank obj

		// initialise the bank list for the top
		ArrayList<Bank> bankList = service.banks();
		model.addAttribute("banksobj", bankList);
		model.addAttribute("cardtypeobj", ctype);
		model.addAttribute("cardtypesobj", cardtypesobj);

	}

}
