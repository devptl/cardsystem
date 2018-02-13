package com.mindfire.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankHasCardType {

	@Id
	private int bankBankId;
	private int cardTypeCardTypeId;

	public int getBankBankId() {
		return bankBankId;
	}

	public int getCardTypeCardTypeId() {
		return cardTypeCardTypeId;
	}

	public void setBankBankId(int bankBankId) {
		this.bankBankId = bankBankId;
	}

	public void setCardTypeCardTypeId(int cardTypeCardTypeId) {
		this.cardTypeCardTypeId = cardTypeCardTypeId;
	}

}
