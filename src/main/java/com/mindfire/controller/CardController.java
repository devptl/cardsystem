package com.mindfire.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindfire.model.Bank;
import com.mindfire.model.InCard;
import com.mindfire.model.CardType;
import com.mindfire.service.CardService;
import com.mindfire.service.Saving;

@Controller
public class CardController {
	CardService service;
	
	@Autowired
	public CardController(CardService service) {
		this.service = service;
	}
	
	/**
	 * This methord is to take value from the front end store it in card object and
	 * use that as a basee object to store other values
	 * 
	 * @param cardobj
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "entry", method = RequestMethod.POST)
	public String entry(@ModelAttribute("card") InCard cardobj, ModelMap model) {

		ArrayList<CardType> cardtypes = new ArrayList<CardType>();
		
		DataController datacontrol = new DataController(service);
		
		int cid=cardobj.getCard_type_id();
		int bid=cardobj.getBank_id();
		
		CardType cobj=service.oneCardTypes(cid);
		Bank bobj=service.oneBank(bid);
		String msg;
		String bgcolor;
		
		Saving sv = new Saving(service);
		if(sv.saveFun(cardobj))
		{
			bgcolor = "showFormAndCard(\"" + bobj.getBankColor() + "\")";
			msg="succesfull insertion";
		}
		else
		{
			bgcolor="showForm()";
		    msg="already cardno exist";
		}
		
		
		datacontrol.initalil(bgcolor, model, cardtypes, cobj);
		
		model.addAttribute("msg", msg);
		model.addAttribute("cardobj", cardobj);
		model.addAttribute("banks", bobj);

		return "show";
				
		
	}


}
