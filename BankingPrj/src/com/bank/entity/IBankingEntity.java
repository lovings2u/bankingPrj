package com.bank.entity;

import java.util.List;

import com.bank.vo.AccountVo;
import com.bank.vo.BankVo;
import com.bank.vo.CustomerVo;
import com.bank.vo.TransactionVo;

public interface IBankingEntity {
	void createDate(BankVo bvo);
	int withdraw(AccountVo cvo);
	int deposit(AccountVo avo);
	double getBalance(TransactionVo tvo);
	double setTransaction(TransactionVo tvo);
	double transfer(TransactionVo tvo, AccountVo avo);
	List<TransactionVo> getTransactionVo();
	AccountVo getAccount(String accountId);
	List<AccountVo> accumulateInterest();
	List<AccountVo> checkAccounts();
	List<CustomerVo> customerReport();
}
