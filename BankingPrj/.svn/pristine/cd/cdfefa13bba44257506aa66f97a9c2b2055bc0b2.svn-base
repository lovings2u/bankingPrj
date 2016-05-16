package com.bank.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TransactionVo {
	private String customerId;
	private String accountId;
	private String accountType;
	private String transactionType;
	private AccountVo avo;
	private double amount;
	private Date transactionDate;
	private Date transactionTime;
	
	public TransactionVo() {
	}

	public TransactionVo(String customerId, String accountId, String accountType, String transactionType,
			double amount) {
		this(customerId, accountId, accountType, transactionType);
		this.amount = amount;
	}

	public TransactionVo(String customerId, String accountId, String accountType, String transactionType) {
		super();
		this.customerId = customerId;
		this.accountId = accountId;
		this.accountType = accountType;
		this.transactionType = transactionType;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public AccountVo getAvo() {
		return avo;
	}

	public void setAvo(AccountVo avo) {
		this.avo = avo;
	}

	
	public String getTransactionDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		return sdf.format(transactionDate);
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	

	public String getTransactionTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH-mm-ss");
		return sdf.format(transactionTime);
	}

	public void setTransactionTime(Date transactionTime) {
		this.transactionTime = transactionTime;
	}

	@Override
	public String toString() {
		return "TransactionVo [customerId=" + customerId + ", accountId=" + accountId + ", accountType=" + accountType
				+ ", transactionType=" + transactionType + ", amount=" + amount + "]";
	}
	
		
	
}
