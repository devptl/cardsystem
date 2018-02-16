package com.mindfire.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mindfire.model.Account;
import com.mindfire.model.Card;
import com.mindfire.model.Customer;
import com.mindfire.model.InCard;

public class Saving {
	CardService service;

	@Autowired
	public Saving(CardService service) {
		this.service = service;
	}

	/**
	 * To get the value from the card controller
	 * use it to save the data in database in a particular order
	 * first to save data in customer table 
	 * then to the account table
	 * then to the card table 
	 * so that no foreign key mismatching is their  
	 * @param c1
	 * @return success or failure of insertion
	 */
	public boolean saveFun(InCard c1) {
		String cardno = c1.getCard_no1() + c1.getCard_no2() + c1.getCard_no3() + c1.getCard_no4();

		if (service.check(cardno) == null) {
			//generating the customer id to be saved
			long custid = Integer.parseInt((c1.getCard_no1() + c1.getCard_no2()));
			Customer c = new Customer(custid, c1.getFirst_name(), c1.getMiddle_name(), c1.getLast_name());
			
			//creating customer table record
			service.saveCustomer(c);

			//generating the account no
			long accountno = Integer.parseInt((c1.getCard_no2() + c1.getCard_no3()));
			Account a = new Account(accountno, 0, c1.getBank_id(), custid);
			
			//creaing account table record
			service.saveAccount(a);

			//creatig an object of card 
			Card cc = new Card(cardno, c1.getCvv_no(), c1.getValid_from(), c1.getValid_through(), accountno,
					c1.getCard_type_id());
			
			//creating a card table record
			service.saveCard(cc);

			return true;
		} else {
			return false;

		}
		
	}
	

}
