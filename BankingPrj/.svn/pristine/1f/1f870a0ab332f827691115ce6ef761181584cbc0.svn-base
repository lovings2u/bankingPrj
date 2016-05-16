package com.bank.entity;

import java.util.List;

import com.bank.vo.AccountVo;
import com.bank.vo.BankVo;
import com.bank.vo.CustomerVo;
import com.bank.vo.TransactionVo;

public class BankingEntity {
	IBankingEntity be;
	
	public BankingEntity() {
		be = new BankingEntityImpl();
	}
	
	public void createDate(BankVo bvo) {
		be.createDate(bvo);
	}
	public int withdraw(AccountVo cvo) {
		int result = be.withdraw(cvo);
		return result;
	}
	public int deposit(AccountVo avo) {
		int result = be.deposit(avo);
		return result;
	}
	public double getBalance(TransactionVo tvo){
		double result = be.getBalance(tvo);
		return result;
	}
	public double setTransaction(TransactionVo tvo) {
		int result = (int) be.setTransaction(tvo);
		return result;
	}
	public int transfer(TransactionVo tvo, AccountVo avo) {
		int result = (int) be.transfer(tvo, avo);
		return result;
	}
	public List<TransactionVo> getTransaction() {
		return be.getTransactionVo();
	}
	public AccountVo getAccount(String accountId) {
		return be.getAccount(accountId);
	}
	public List<AccountVo> accumulateInterest() {
		return be.accumulateInterest();
	}
	public List<AccountVo> checkAccounts() {
		return be.checkAccounts();
	}
	public List<CustomerVo> customerReport(){
		return be.customerReport();
	}
}
