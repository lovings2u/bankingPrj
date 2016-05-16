package com.bank.view;

import java.util.List;

import com.bank.vo.AccountVo;
import com.bank.vo.CustomerVo;
import com.bank.vo.TransactionVo;

public class BankViewImpl implements IBankView{

	@Override
	public void excute(int result, TransactionVo tvo) {
		System.out.println(tvo.getTransactionType() + " 거래가 " + result + "건 실행되었습니다. (" 
				+ tvo.getCustomerId() + "님의 " + tvo.getAccountId() + "계좌에서 실행)");
	}

	@Override
	public void excute(double result, TransactionVo tvo) {
		System.out.println(tvo.getAccountId() + "계좌 잔액: " + result);
	}
	
	@Override
	public void viewTransactionList(List<TransactionVo> list) {
		System.out.println("\n********************** Transaction List **********************");
		System.out.println(" ID | TransactionDate | CustomerId|  AccountId | TransactionType |  Balance   |");
		int index = 1;
		for (TransactionVo transactionVo : list) {
			System.out.printf("%3d |%6s/%8s|  %5s    | %10s | %15s | %10f |\n",index, transactionVo.getTransactionDate(), transactionVo.getTransactionTime(), transactionVo.getCustomerId(), transactionVo.getAccountId()
					,transactionVo.getTransactionType(), transactionVo.getAmount());
			index++;
		}
	}

	@Override
	public void checkInterest(List<AccountVo> list) {
		System.out.println("\n********************** Accumulate Interest **********************");
		System.out.println(" ID | AccountType |CustomerId | AccountId | InterestRate |    Balance   |    Result   | ");
		int index = 1;
		for (AccountVo accountVo : list) {
			System.out.printf("%3d | %7s     |%6s     | %6s    | %12.2f | %12.2f | %10.2f  |\n", index, accountVo.getAccountType(), accountVo.getCustomerId(), accountVo.getAccountId(), accountVo.getInterestRate(), 
																accountVo.getBalance(), accountVo.getBalance() * (1+accountVo.getInterestRate()));
			index++;
		}
	}
	@Override
	public void checkAccounts(List<AccountVo> list) {
		System.out.println("\n************************* Account List *************************");
		
		int index = 1;
		System.out.println("----------------------- Savings Account -----------------------");
		System.out.println(" ID | CustomerId | AccountId |    Balance    | Type |  InterestRate  |");
		for (AccountVo accountVo : list) {
			if(accountVo.getAccountType().equals("S")){
				AccountVo svo = accountVo;
				
				System.out.printf("%3d | %6s     | %6s    | %12.2f  | %3s  |  %10.2f    |\n", index, svo.getCustomerId(), svo.getAccountId(), 
						svo.getBalance(), svo.getAccountType(), svo.getInterestRate());
				index++;
			}
		}
		System.out.println("----------------------- Checking Account -----------------------");
		System.out.println(" ID | CustomerId | AccountId |    Balance   | Type | Over Amount | Over Protect |");
		for (AccountVo accountVo : list) {
			if(accountVo.getAccountType().equals("C")){
				AccountVo cvo = accountVo;
				System.out.printf("%3d | %6s     | %6s    | %12.2f | %3s | %12.2f | %10.2f   |\n", index, cvo.getCustomerId(), cvo.getAccountId(), cvo.getBalance(), 
						cvo.getAccountType(), cvo.getOverdraftAmount(), cvo.getOverdraftProtect());
				index++;

			}
		}
	}
	@Override
	public void viewCustomerReport(List<CustomerVo> list) {
		System.out.println("\n********************** Customer Report **********************");
		for (CustomerVo customerVo : list) {
			System.out.println("Customer Name: " + customerVo.getFirstName() + "  " +customerVo.getLastName());
			for (AccountVo accountVo : customerVo.getAccounts()) {
				if(accountVo.getAccountType().equals("S")){
					System.out.printf("%6s | %3s | %8.2f | %3.2f |\n",accountVo.getAccountType(),accountVo.getAccountId(),accountVo.getBalance(),accountVo.getInterestRate());
				} else {
					System.out.printf("%6s | %3s | %8.2f | %3.2f | %3.2f |\n",accountVo.getAccountType(),accountVo.getAccountId(),accountVo.getBalance(),accountVo.getOverdraftAmount(), accountVo.getOverdraftProtect());
				}
			}
		}
	}
}
