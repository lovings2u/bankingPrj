package com.bank.vo;

import java.util.ArrayList;
import java.util.List;

public class CustomerVo {
	private String customerId;
	private String firstName;
	private String lastName;
	private String bankId;
	private List<AccountVo> accounts;
	private int numberOfAccounts;
	
	public CustomerVo() {
	}
	public CustomerVo(String f, String l, String cusId, String bank) {
		firstName = f;
		lastName = l;
		customerId = cusId;
		bankId = bank;
		accounts = new ArrayList<>();
		numberOfAccounts = 0;
	}
	public AccountVo getAccount(int index) {
		return accounts.get(index);
	}
	public void addAccount(AccountVo account) {
		int i = numberOfAccounts;
		if(account.getAccountType().equals("S")){
			if(i <= 10) {
				accounts.add(account);
				numberOfAccounts++;
			} else { 
				System.out.println("Too many Accounts (" + i + ")");
			}
		} else {
			if(i <= 10) {
				accounts.add(account);
				numberOfAccounts++;
			} else { 
				System.out.println("Too many Accounts (" + i + ")");
			}
		}
		
	}

	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public void setNumberOfAccounts(int numberOfAccounts) {
		this.numberOfAccounts = numberOfAccounts;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBankId() {
		return bankId;
	}
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
	public List<AccountVo> getAccounts() {
		return accounts;
	}
	public void setAccounts(ArrayList<AccountVo> accounts) {
		this.accounts = accounts;
	}
	@Override
	public String toString() {
		return "CustomerVo [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", bankId=" + bankId + ", accounts=" + accounts + ", numberOfAccounts=" + numberOfAccounts + "]";
	}
	
	
	
	

}
