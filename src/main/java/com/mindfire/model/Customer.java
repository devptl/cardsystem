/**
 *Class to store customer details corresponding to the customer in database
 */

package com.mindfire.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Customer {
	
	@Id
	private long custId;
	private String firstName;
	private String middleName;
	private String lastName;
	public long getCustId() {
		return custId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public Customer() {
	
	}
	
	public Customer(long custId, String firstName, String middleName, String lastName) {
		
		this.custId = custId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	
	
	
	
}
