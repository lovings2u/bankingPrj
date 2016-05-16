package com.bank.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.bank.service.BankingService;
import com.bank.view.BankView;
import com.bank.vo.AccountVo;
import com.bank.vo.BankVo;
import com.bank.vo.CustomerVo;
import com.bank.vo.TransactionVo;

public class BankingController {
	private Scanner sc;
	private CustomerVo customer;
	private AccountVo account;
	private BankVo bank;
	private TransactionVo tvo;
	private BankView bv;
	private BankingService bs;
	private List<AccountVo> list;
	private List<CustomerVo> report;

	public BankingController() {
		bs = new BankingService();
		bv = new BankView();
	}

	public void createData(File file) {
		try {
			bs.createDate(file);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public void deposit(String customer, String accountType, String accountId, double amount) {
		tvo = new TransactionVo(customer, accountId, accountType, "Deposit", amount);
		tvo.setAvo(new AccountVo(customer, accountId, accountType, amount));
		try {
			int result = bs.deposit(tvo);
			setTransaction(tvo);
			bv.viewResult(result, tvo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void withdraw(String customer, String accountType, String accountId, double amount) {
		tvo = new TransactionVo(customer, accountId, accountType, "Withdraw", amount);
		try {
			int result = bs.withdraw(tvo);
			setTransaction(tvo);
			bv.viewResult(result, tvo);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	public void getBalance(String customer, String accountType, String accountId) {
		tvo = new TransactionVo(customer, accountId, accountType, "Get Balance");
		try {
			double result = bs.getBalance(tvo);
			setTransaction(tvo);
			bv.viewResult(result, tvo);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public void transfer(String customer, String accountType, String accountId, double amount, String customer2,
			String accountType2, String accountId2) {
		tvo = new TransactionVo(customer, accountId, accountType, "Transfer", amount);
		AccountVo avo = new AccountVo(customer2, accountId2, accountType2, amount);
		try {
			int result = (int) bs.transfer(tvo, avo);
			setTransaction(tvo);
			bv.viewResult(result, tvo);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public void accumulateInterest() {
		try {
			list = (ArrayList<AccountVo>) bs.accumulateInterest();
			bv.checkInterest(list);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
	public void checkAccounts() {
		try {
			list = (ArrayList<AccountVo>) bs.checkAccounts();
			bv.checkAccounts(list);
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public void setTransaction(TransactionVo tvo) {
		try {
			bs.setTransaction(tvo);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	public void getTransaction() {
		try {
			List<TransactionVo> list = bs.getTransaction();
			bv.viewTransactionList(list);
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
	public void customerReport() {
		try {
			report = bs.customerReport();
			bv.viewCustomerReport(report);
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
