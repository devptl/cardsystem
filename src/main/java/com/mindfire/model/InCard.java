/**
* Model class for the card object act as the base class for data entry via card.html
*/

package com.mindfire.model;

public class InCard {
	private String bank_name;
	private int bank_id;
	private String first_name;
	private String middle_name;
	private String last_name;
	private String card_no1;
	private String card_no2;
	private String card_no3;
	private String card_no4;
	private int card_type_id;
	private String valid_through;
	private String valid_from;
	private int cvv_no;

	public InCard() {
		first_name = "";
		middle_name = "";
		last_name = "";
		card_no1 = "";
		card_no2 = "";
		card_no3 = "";
		card_no4 = "";
		card_type_id = 0;
		valid_through = "";
		valid_from = "";
		cvv_no = 0;
	}

	
	public int getBank_id() {
		return bank_id;
	}

	public void setBank_id(int bank_id) {
		this.bank_id = bank_id;
	}


	public String getBank_name() {
		return bank_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public String getCard_no1() {
		return card_no1;
	}

	public String getCard_no2() {
		return card_no2;
	}

	public String getCard_no3() {
		return card_no3;
	}

	public String getCard_no4() {
		return card_no4;
	}

	public int getCard_type_id() {
		return card_type_id;
	}

	public void setCard_type_id(int card_type_id) {
		this.card_type_id = card_type_id;
	}

	public String getValid_through() {
		return valid_through;
	}

	public String getValid_from() {
		return valid_from;
	}

	public int getCvv_no() {
		return cvv_no;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public void setCard_no1(String card_no1) {
		this.card_no1 = card_no1;
	}

	public void setCard_no2(String card_no2) {
		this.card_no2 = card_no2;
	}

	public void setCard_no3(String card_no3) {
		this.card_no3 = card_no3;
	}

	public void setCard_no4(String card_no4) {
		this.card_no4 = card_no4;
	}

	public void setValid_through(String valid_through) {
		this.valid_through = valid_through;
	}

	public void setValid_from(String valid_from) {
		this.valid_from = valid_from;
	}

	public void setCvv_no(int cvv_no) {
		this.cvv_no = cvv_no;
	}

}
