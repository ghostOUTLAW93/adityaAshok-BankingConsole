package com.aditya.model;

public class Customer {
	
	//bankAccountNo and password-> always set data as private so that it can't be modified outside the class
	private String bankAccountNo;
	private String password;
	
	//creating parameterised constructor using source tab
	public Customer(String bankAccountNo, String password) {
		this.bankAccountNo = bankAccountNo;
		this.password = password;
	}

	//invoking getters and setters using source tab
	public String getBankAccountNo() {
		return bankAccountNo;
	}

//	public void setBankAccountNo(String bankAccountNo) {
//		this.bankAccountNo = bankAccountNo;
//	}

	public String getPassword() {
		return password;
	}

//	public void setPassword(String password) {
//		this.password = password;
//	}

}
