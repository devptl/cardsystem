package com.mindfire.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bank {

	@Id
	@GeneratedValue
	private int bankId;

	private String bankName;
	private String ifscCode;
	private String bankImage;
	private String bankColor;

	public String getBankImage() {
		return bankImage;
	}

	public String getBankColor() {
		return bankColor;
	}

	public int getBankId() {
		return bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public void setBankImage(String bankImage) {
		this.bankImage = bankImage;
	}

	public void setBankColor(String bankColor) {
		this.bankColor = bankColor;
	}

	public Bank(String bankName, String ifscCode) {
		this.bankName = bankName;
		this.ifscCode = ifscCode;
	}

	public Bank() {

	}

	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankName=" + bankName + ", ifscCode=" + ifscCode + "]";
	}

}
