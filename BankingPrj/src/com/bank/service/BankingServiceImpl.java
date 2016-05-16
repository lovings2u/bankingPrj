package com.bank.service;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import com.bank.entity.BankingEntity;
import com.bank.exception.OverdraftAmountException;
import com.bank.exception.SavingsAccountWithdrawException;
import com.bank.exception.TransferWithoutBalanceException;
import com.bank.vo.AccountVo;
import com.bank.vo.BankVo;
import com.bank.vo.CustomerVo;
import com.bank.vo.TransactionVo;

public class BankingServiceImpl implements IBankingService {
	private Scanner sc;
	private BankVo bvo;
	private CustomerVo cvo;
	private AccountVo avo;
	private BankingEntity be;

	public BankingServiceImpl() {
		be = new BankingEntity();
	}

	@Override
	public void createDate(File file) {
		try {
			sc = new Scanner(file); // file read

			String bankId = sc.next(); // get bank information
			String bankName = sc.next();
			int customerCount = sc.nextInt();

			bvo = new BankVo(bankId, bankName, customerCount); // create bank
																// value object
			int index = 0;
			String customerId = null;
			String firstName = null;
			String lastName = null;
			while (sc.hasNext()) {
				try {
					customerId = sc.next();
					firstName = sc.next();
					lastName = sc.next();
				} catch (Exception e) {
					continue;
				}
				bvo.addCustomer(firstName, lastName, customerId);
				int numberOfAccount = sc.nextInt();
				for (int i = 0; i < numberOfAccount; i++) {
					String accountId = sc.next();
					String accountType = sc.next();
					double initBalance = sc.nextDouble();
					double interestRate = sc.nextDouble();

					cvo = bvo.getCustomer(index);
					if (accountType.equals("S")) {
						AccountVo savingsAccount = new AccountVo(customerId, accountId, accountType, initBalance,
								interestRate);
						savingsAccount.setAccountId(accountId);
						savingsAccount.setAccountType("S");
						savingsAccount.setCustomerId(customerId);
						cvo.addAccount(savingsAccount);

					} else if (accountType.equals("C")) {
						double overdraftProtect = sc.nextDouble();
						AccountVo checkingAccount = new AccountVo(customerId, accountId, accountType, initBalance, 0.0,
								overdraftProtect);
						checkingAccount.setAccountId(accountId);
						checkingAccount.setAccountType("C");
						checkingAccount.setCustomerId(customerId);
						cvo.addAccount(checkingAccount);

					}
				}
				index++;
			}
			be.createDate(bvo);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public int deposit(TransactionVo tvo) {
		avo = tvo.getAvo();
		avo.setBalance(tvo.getAmount());
		avo.setAccountId(tvo.getAccountId());
		avo.setAccountType(tvo.getAccountType());
		avo.setCustomerId(tvo.getCustomerId());
		int result = be.deposit(avo);
		return result;
	}

	@Override
	public int withdraw(TransactionVo tvo) throws Exception {
		String accountType = tvo.getAccountType();
		switch (accountType) {
		case "S":
			throw new SavingsAccountWithdrawException("SavingsAccount cannot be withdrawn");
		case "C":
			avo = be.getAccount(tvo.getAccountId());
			cvo.addAccount(avo);
			double balance = avo.getBalance();
			double overAmount = avo.getOverdraftAmount();
			double protect = avo.getOverdraftProtect();
			double withdrawAmt = tvo.getAmount();
			if (balance >= withdrawAmt) {
				avo.setBalance(balance - withdrawAmt);
			} else {
				if (protect - overAmount >= withdrawAmt) {
					avo.setOverdraftAmount((overAmount + withdrawAmt));
				} else {
					throw new OverdraftAmountException("Overdraft Too many!", (protect - overAmount) - withdrawAmt);
				}
			}
		}
		avo.setAccountId(tvo.getAccountId());
		avo.setAccountType(tvo.getAccountType());
		avo.setCustomerId(tvo.getCustomerId());
		int result = be.withdraw(avo);
		return result;
	}

	@Override
	public int transfer(TransactionVo tvo, AccountVo avo) throws Exception {
		String accountType = tvo.getAccountType();
		AccountVo cvo = null;
		switch (accountType) {
		case "S":
			throw new SavingsAccountWithdrawException("SavingsAccount cannot be transfered");
		case "C":
			cvo = be.getAccount(tvo.getAccountId());
			double balance = cvo.getBalance();
			double transferAmt = tvo.getAmount();
			if (balance >= transferAmt) {
				return be.transfer(tvo, avo);
			} else {
				throw new TransferWithoutBalanceException("No Balance to transfer");
			}
		}
		return 0;
	}

	@Override
	public double getBalance(TransactionVo tvo) {
		return be.getBalance(tvo);
	}
	
	@Override
	public double setTransaction(TransactionVo tvo) throws Exception {
		return be.setTransaction(tvo);
	}
	@Override
	public List<TransactionVo> getTransaction() {
		return be.getTransaction();
	}
	
	@Override
	public List<AccountVo> checkAccounts() {
		return be.checkAccounts();
	}
	@Override
	public List<AccountVo> accumulateInterest() {
		return be.accumulateInterest();
	}
	@Override
	public List<CustomerVo> customerReport() {
		return be.customerReport();
	}
}
