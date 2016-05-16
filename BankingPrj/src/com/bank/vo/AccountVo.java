package com.bank.vo;

public class AccountVo {
	protected String accountId;
	protected String accountType;
	protected String customerId;
	protected double balance;
	protected double interestRate;
	private double overdraftAmount;
	private double overdraftProtect;
	
	public AccountVo() {
	}
	
	
	public AccountVo(String customerId, String accountId, String accountType, double amount) {
		this.customerId = customerId;
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = amount;
	}
	//savings Account constructor
	public AccountVo(String customerId, String accountId, String accountType, double amount, double interestRate) {
		this(customerId, accountId, accountType, amount);
		this.interestRate = interestRate;
	}
	
	//checking account constructor
	public AccountVo(String customerId, String accountId, String accountType, double amount, double overdraftAmount, double overdraftProtect) {
		this(customerId, accountId, accountType, amount);
		this.overdraftAmount = overdraftAmount;
		this.overdraftProtect = overdraftProtect;
	}
	
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountId() {
		return this.accountId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public double getOverdraftAmount() {
		return overdraftAmount;
	}

	public void setOverdraftAmount(double overdraftAmount) {
		this.overdraftAmount = overdraftAmount;
	}

	public double getOverdraftProtect() {
		return overdraftProtect;
	}

	public void setOverdraftProtect(double overdraftProtect) {
		this.overdraftProtect = overdraftProtect;
	}

	@Override
	public String toString() {
		return "AccountVo [accountId=" + accountId + ", accountType=" + accountType + ", customerId=" + customerId
				+ ", balance=" + balance + ", interestRate=" + interestRate + "]";
	}
	
}
