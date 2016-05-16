package com.bank.view;

import java.util.List;

import com.bank.vo.AccountVo;
import com.bank.vo.CustomerVo;
import com.bank.vo.TransactionVo;

public interface IBankView {
	void excute(int result, TransactionVo tvo);
	void excute(double result, TransactionVo tvo);
	void viewTransactionList(List<TransactionVo> list);
	void checkInterest(List<AccountVo> list);
	void checkAccounts(List<AccountVo> list);
	void viewCustomerReport(List<CustomerVo> list);
}
