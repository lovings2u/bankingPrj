package com.bank.vo;

import java.util.Arrays;

public class BankVo {
	private CustomerVo[] customers;
	private int numberOfCustomers;
	private String bankId;
	private String bankName;
	
	public BankVo(String bankId, String bankName, int index) {
		this.bankId = bankId;
		this.bankName = bankName;
		this.customers = new CustomerVo[index];
		this.numberOfCustomers = 0;
	}
	
	public void addCustomer(String firstName, String lastName, String customerId) {
		this.customers[numberOfCustomers++] = new CustomerVo(firstName,lastName,customerId,bankId);
	}
	
	public int getNumOfCustomers() {
		return numberOfCustomers;
	}
	
	public CustomerVo getCustomer(int customerIndex){
		return customers[customerIndex];
	}

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "BankVo [customers=" + Arrays.toString(customers) + ", numberOfCustomers=" + numberOfCustomers
				+ ", bankId=" + bankId + ", bankName=" + bankName + "]";
	}
	
}
