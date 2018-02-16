package com.mindfire.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindfire.model.Account;
import com.mindfire.model.Bank;
import com.mindfire.model.BankHasCardType;
import com.mindfire.model.Card;
import com.mindfire.model.CardType;
import com.mindfire.model.Customer;
import com.mindfire.repository.AccountRepository;
import com.mindfire.repository.BankHasCardTypeRepository;
import com.mindfire.repository.BankRepository;
import com.mindfire.repository.CardRepository;
import com.mindfire.repository.CardTypeRepository;
import com.mindfire.repository.CustomerRepository;

@Service
public class CardService {
	
	@Autowired
	private CustomerRepository custRepo;
	
	@Autowired
	BankRepository bankRepo;
	
	@Autowired
	CardTypeRepository cardTypeRepo;
	
	@Autowired
	BankHasCardTypeRepository bankHasRepo;
	
	@Autowired
	AccountRepository accountRepo;
	
	@Autowired
	CardRepository cardRepo;
	
	/**
	 * to get the particular bank with given bank id
	 * @param bid
	 * @return Bank
	 */
	public Bank oneBank(int bid)
	{
		Bank b1= bankRepo.findOne(bid);
		return b1;	
	}
	
	/**
	 * to get the list of all the banks in the database
	 * @return Array of Bank
	 */
	public ArrayList<Bank> banks()
	{
		ArrayList<Bank> b1= (ArrayList<Bank>) bankRepo.findAll();
		return b1;	
	}
	
	/**
	 * To get the particular card type with given cardtype Id
	 * @param cid
	 * @return CardType
	 */
	public CardType oneCardTypes(int cid)
	{
		CardType c1=  cardTypeRepo.findOne(cid);
		return c1;	
	}
	
	/**
	 * to get the list of all the cardtypes in the database
	 * @return Array of CardType
	 */
	public ArrayList<CardType> cardTypes()
	{
		ArrayList<CardType> b1= (ArrayList<CardType>) cardTypeRepo.findAll();
		return b1;	
	}
	
	/**
	 * to get the list of all the Bank that has particular
	 * cartype in the database
	 * @return Array of BankHasCardType
	 */
	public ArrayList<BankHasCardType> bankHasCardTypes()
	{
		ArrayList<BankHasCardType> b1= (ArrayList<BankHasCardType>) bankHasRepo.findAll();
		return b1;	
	}
	
	/**
	 * to save a particular customer to the database
	 * @param c
	 */
	public void saveCustomer(Customer c) {
		custRepo.save(c);
	}
	
	/**
	 * To get a particular Customer with a given customer ID
	 * @param custid 
	 * @return Customer
	 */
	public Customer getCustomer(long custid) {
        Customer a=custRepo.findOne(custid);
        return a;
	}
	
	/**
	 * To save the particualar account in the database
	 * @param a
	 */
	public void saveAccount(Account a) {
		accountRepo.save(a);
	}
	
	/**
	 * To get a particular account with a given account NO 
	 * @param accno
	 * @return Account
	 */
	public Account getAccount(long accno) {
        Account a=accountRepo.findOne(accno);
        return a;
	}
	
	/**
	 * To save the card details in card table in databse
	 * @param cc
	 */
	public void saveCard(Card cc) {
		cardRepo.save(cc);
	}
	
	/**
	 * To check the particular card exist in the database 
	 * @param cardno
	 * @return Card 
	 */
	public Card check(String cardno)
	{
		return cardRepo.findOne(cardno);
	}
	
	
	

}
