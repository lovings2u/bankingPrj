package com.bank.service;

import java.io.File;
import java.util.List;

import com.bank.vo.AccountVo;
import com.bank.vo.CustomerVo;
import com.bank.vo.TransactionVo;

public interface IBankingService {
	void createDate(File file);
	int deposit(TransactionVo tvo);
	int transfer(TransactionVo tvo, AccountVo avo) throws Exception;
	int withdraw(TransactionVo tvo) throws Exception;
	double getBalance(TransactionVo tvo);
	double setTransaction(TransactionVo tvo) throws Exception;
	List<TransactionVo> getTransaction();
	List<AccountVo> checkAccounts();
	List<AccountVo> accumulateInterest();
	List<CustomerVo> customerReport();
}
