package com.bank.view;

import java.util.List;

import com.bank.vo.AccountVo;
import com.bank.vo.CustomerVo;
import com.bank.vo.TransactionVo;

public class BankView {
	IBankView bv;

	public BankView() {
		bv = new BankViewImpl();
	}

	public void viewResult(int result, TransactionVo tvo) {
		bv.excute(result, tvo);
	}

	public void viewResult(double result, TransactionVo tvo) {
		bv.excute(result, tvo);
	}
	
	public void viewTransactionList(List<TransactionVo> list) {
		bv.viewTransactionList(list);
	}
	
	public void checkInterest(List<AccountVo> list) {
		bv.checkInterest(list);
	}
	public void checkAccounts(List<AccountVo> list) {
		bv.checkAccounts(list);
	}
	public void viewCustomerReport(List<CustomerVo> list) {
		bv.viewCustomerReport(list);
	}
}
