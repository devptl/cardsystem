package com.mindfire.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Card {

	@Id
	private String cardNo;
	private int cvvNo;
	private String validFrom;
	private String validThrough;
	private long accountAccountNo;
	private int cardTypeCardTypeId;

	public String getCardNo() {
		return cardNo;
	}

	public int getCvvNo() {
		return cvvNo;
	}

	public String getValidFrom() {
		return validFrom;
	}

	public String getValidThrough() {
		return validThrough;
	}

	public long getAccountAccountNo() {
		return accountAccountNo;
	}

	public int getCardTypeCardTypeId() {
		return cardTypeCardTypeId;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public void setCvvNo(int cvvNo) {
		this.cvvNo = cvvNo;
	}

	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}

	public void setValidThrough(String validThrough) {
		this.validThrough = validThrough;
	}

	public void setAccountAccountNo(long accountAccountNo) {
		this.accountAccountNo = accountAccountNo;
	}

	public void setCardTypeCardTypeId(int cardTypeCardTypeId) {
		this.cardTypeCardTypeId = cardTypeCardTypeId;
	}
	
	

	public Card() {
		validFrom="1234567890";
		validThrough="1234567890";
		cardNo="1234567812345678";
		
		
	}

	public Card(String cardNo, int cvvNo, String validFrom, String validThrough, long accountAccountNo,
			int cardTypeCardTypeId) {

		this.cardNo = cardNo;
		this.cvvNo = cvvNo;
		this.validFrom = validFrom;
		this.validThrough = validThrough;
		this.accountAccountNo = accountAccountNo;
		this.cardTypeCardTypeId = cardTypeCardTypeId;
	}

}
