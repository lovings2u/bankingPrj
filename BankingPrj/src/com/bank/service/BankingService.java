package com.bank.service;

import java.io.File;
import java.util.List;

import com.bank.vo.AccountVo;
import com.bank.vo.CustomerVo;
import com.bank.vo.TransactionVo;

public class BankingService {
	IBankingService bs;

	public BankingService() {
		bs = new BankingServiceImpl();
	}
	public void createDate(File file) {
		bs.createDate(file);
	}

	public int withdraw(TransactionVo tvo) throws Exception{
		return bs.withdraw(tvo);
	}
	public int deposit(TransactionVo tvo) throws Exception {
		return bs.deposit(tvo);
	}
	public double getBalance(TransactionVo tvo) throws Exception {
		return bs.getBalance(tvo);
	}
	public double transfer(TransactionVo tvo, AccountVo avo) throws Exception{
		return bs.transfer(tvo, avo);
	}
	public List<AccountVo> accumulateInterest() {
		return bs.accumulateInterest();
	}
	public List<AccountVo> checkAccounts() {
		return bs.checkAccounts();
	}
	public List<CustomerVo> customerReport() {
		return bs.customerReport(); 
	}
	public double setTransaction(TransactionVo tvo) throws Exception {
		return bs.setTransaction(tvo);
	}
	public List<TransactionVo> getTransaction() {
		return bs.getTransaction();
	}
}

