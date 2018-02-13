package com.mindfire.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CardType {

	@Id
	private int cardTypeId;
	private String cardTypeName;
	private String cardTypeImage;

	public String getCardTypeImage() {
		return cardTypeImage;
	}

	public int getCardTypeId() {
		return cardTypeId;
	}

	public String getCardTypeName() {
		return cardTypeName;
	}

	public void setCardTypeId(int cardTypeId) {
		this.cardTypeId = cardTypeId;
	}

	public void setCardTypeName(String cardTypeName) {
		this.cardTypeName = cardTypeName;
	}

	public void setCardTypeImage(String cardTypeImage) {
		this.cardTypeImage = cardTypeImage;
	}

}
