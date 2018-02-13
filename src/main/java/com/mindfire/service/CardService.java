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
	
	
	public Bank oneBank(int bid)
	{
		Bank b1= bankRepo.findOne(bid);
		return b1;	
	}
	
	public ArrayList<Bank> banks()
	{
		ArrayList<Bank> b1= (ArrayList<Bank>) bankRepo.findAll();
		return b1;	
	}
	
	public CardType oneCardTypes(int cid)
	{
		CardType c1=  cardTypeRepo.findOne(cid);
		return c1;	
	}
	
	public ArrayList<CardType> cardTypes()
	{
		ArrayList<CardType> b1= (ArrayList<CardType>) cardTypeRepo.findAll();
		return b1;	
	}
	
	public ArrayList<BankHasCardType> bankHasCardTypes()
	{
		ArrayList<BankHasCardType> b1= (ArrayList<BankHasCardType>) bankHasRepo.findAll();
		return b1;	
	}
	
	public void saveCustomer(Customer c) {
		custRepo.save(c);
	}
	
	public void saveAccount(Account a) {
		accountRepo.save(a);
	}
	
	public void saveCard(Card cc) {
		cardRepo.save(cc);
	}
	
	public Card check(String cardno)
	{
		return cardRepo.findOne(cardno);
	}
	
	
	

}
