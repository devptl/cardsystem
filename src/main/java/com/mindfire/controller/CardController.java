package com.mindfire.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindfire.model.Account;
import com.mindfire.model.Bank;
import com.mindfire.model.Card;
import com.mindfire.model.InCard;
import com.mindfire.model.CardType;
import com.mindfire.model.Customer;
import com.mindfire.service.CardService;
import com.mindfire.service.Saving;

@Controller
public class CardController {
	private CardService service;

	@Autowired
	public CardController(CardService service) {
		this.service = service;
	}

	/**
	 * This methord is to take value from the front end store it in card object and
	 * use that as a basee object to store other values
	 * @param cardobj
	 * @param model
	 * @return {@linkplain} show.html
	 */
	@RequestMapping(value = "entry", method = RequestMethod.POST)
	public String entry(@ModelAttribute("card") InCard cardobj, ModelMap model) {

		ArrayList<CardType> cardtypes = new ArrayList<CardType>();

		DataController datacontrol = new DataController(service);

		//gettting the cardtype Id and bank Id to fetch cardtype and bank table records
		int cid = cardobj.getCard_type_id();
		int bid = cardobj.getBank_id();

		CardType cobj = service.oneCardTypes(cid);
		Bank bobj = service.oneBank(bid);
		String msg;
		String bgcolor;

		Saving sv = new Saving(service);
		if (sv.saveFun(cardobj)) {
			//setting the various background color accourding to the bank
			bgcolor = "showFormAndCard(\"" + bobj.getBankColor() + "\")";
			msg = "succesfull insertion";
		} else {
			//if fails then setting the inital display so the new input can b done
			bgcolor = "showForm()";
			msg = "already cardno exist";
		}

		//setting the object to be used for display on card 
		datacontrol.initalil(bgcolor, model, cardtypes, cobj);

		//setting the msg for success or failure of new card insertion
		model.addAttribute("msg", msg);
		model.addAttribute("cardobj", cardobj);
		model.addAttribute("banks", bobj);

		return "show";

	}
	
	/**
	 * This methord is to set the page to take cardno and search in database
	 * @param cardobj
	 * @param model
	 * @return {@link String}showcard.html
	 */
	@RequestMapping(value = "showcardin", method = RequestMethod.POST)
	public String showcardin(@ModelAttribute("card") InCard cardobj, ModelMap model) {

		DataController datacontrol = new DataController(service);
       
		Card c1=new Card();
        Bank bankobj=new Bank();
        CardType cardtypeobj= new CardType();
        Customer customerobj =  new Customer();
        
        String msg="";
		
		datacontrol.initalil1("showForm()", model, cardtypeobj, bankobj, customerobj,c1);
		model.addAttribute("msg", msg);
		
		
		return "showcard";

	}

	/**
	 * This methord is to display the card information according to the user 
	 * entered card no
	 * @param cardobj
	 * @param model
	 * @return {@link showcard.html}
	 */

	@RequestMapping(value = "showcarddetail", method = RequestMethod.POST)
	public String showcard(@ModelAttribute("card") InCard cardobj, ModelMap model) {

		DataController datacontrol = new DataController(service);
        String cardno=cardobj.getCard_no1()+cardobj.getCard_no2()+cardobj.getCard_no3()+cardobj.getCard_no4();
        
        Card c1=new Card();
        Bank bankobj=new Bank();
        Account accountobj= new Account();
        CardType cardtypeobj= new CardType();
        Customer customerobj =  new Customer();
        
        String bgcolor;
        String msg;
        
		if(service.check(cardno)!=null &&  cardobj.getCvv_no()==service.check(cardno).getCvvNo())
		{
			c1=service.check(cardno);
			
			long accountNo=c1.getAccountAccountNo();
			accountobj=service.getAccount((accountNo));
			
			int cardTypeId=c1.getCardTypeCardTypeId();
			cardtypeobj=service.oneCardTypes(cardTypeId);
			
			long custId=accountobj.getCustomerCustId();
			customerobj = service.getCustomer((custId));
			
			int bankId=accountobj.getBankBankId();
			bankobj=service.oneBank(bankId);
			
			bgcolor = "showFormAndCard(\"" + bankobj.getBankColor() + "\")";
			msg = "succesfull search";
		} else {
			bgcolor = "showForm()";
			msg = "card does not exist";
		}
		
		datacontrol.initalil1(bgcolor, model, cardtypeobj, bankobj, customerobj,c1);
		model.addAttribute("msg", msg);
		
		
		return "showcard";

	}

}
