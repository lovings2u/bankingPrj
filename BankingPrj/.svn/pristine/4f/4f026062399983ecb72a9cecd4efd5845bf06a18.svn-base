package com.bank.test;

import java.io.File;

import com.bank.controller.BankingController;

public class BankTest {
	public static void main(String[] args) {
		BankingController bc = new BankingController();
		//1.파일 등록
		File file = new File("test.dat");
		bc.createData(file);
		
		//2. 입금
		bc.deposit("U3", "S", "A4", 500.00);
		bc.deposit("U1", "C", "A2", 100.00);
		
		//3. 출금
		bc.withdraw("U1", "C", "A2", 230);
		bc.withdraw("U1", "S", "A1", 200.00);
		
		//4. 잔액조회
		bc.getBalance("U1", "C", "A2");		
		bc.getBalance("U1", "C", "A2");		
		bc.getBalance("U1", "S", "A1");		
		bc.getBalance("U1", "C", "A2");
		
		//5. 이체
		bc.transfer("U3", "C", "A5", 100.00, "U4", "S", "A6");
		bc.transfer("U3", "S", "A4", 100.00, "U4", "S", "A6");
		
		//6. 거래내역 조회
		bc.getTransaction(); 
		//7. 전체 계좌조회
		bc.checkAccounts();
		//8. 이자율 계산
		bc.accumulateInterest();
		//9. 고객 리포트
		bc.customerReport();

	}
}
