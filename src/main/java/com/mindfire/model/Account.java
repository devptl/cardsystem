package com.mindfire.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	
    @Id
	private long accountNo;
	private float balance;
	private int bankBankId;
	private long customerCustId;
	
	public long getAccountNo() {
		return accountNo;
	}
	public float getBalance() {
		return balance;
	}
	public int getBankBankId() {
		return bankBankId;
	}
	public long getCustomerCustId() {
		return customerCustId;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public void setBankBankId(int bankBankId) {
		this.bankBankId = bankBankId;
	}
	public void setCustomerCustId(long customerCustId) {
		this.customerCustId = customerCustId;
	}
	
	
	public Account() {
		
	}
	
	public Account(long accountNo, float balance, int bankBankId, long customerCustId) {
	
		this.accountNo = accountNo;
		this.balance = balance;
		this.bankBankId = bankBankId;
		this.customerCustId = customerCustId;
	}
	
	
	
}
