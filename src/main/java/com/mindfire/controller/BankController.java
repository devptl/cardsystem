package com.mindfire.controller;

import java.util.ArrayList;

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
public class BankController {
	CardService service;
	
	@Autowired
	public BankController(CardService service) {
		this.service = service;
	}
	
	@RequestMapping(value = "banks", method = RequestMethod.POST)
	public String banks(@ModelAttribute("bankhascardtype") BankHasCardType bankhascardtypeobj, ModelMap model) {

		ArrayList<CardType> s1 = new ArrayList<CardType>();
		CardType ctypeobj = new CardType();
		Bank bankobj = new Bank();
		s1 = service.cardTypes();
		DataController datacontrol = new DataController(service);
		
		datacontrol.initalil("showBank()", model, s1, ctypeobj);
		model.addAttribute("banks", bankobj);
		return "card";
	}

}
