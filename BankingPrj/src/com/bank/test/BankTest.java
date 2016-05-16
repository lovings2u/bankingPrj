package com.bank.test;

import java.io.File;

import com.bank.controller.BankingController;

public class BankTest {
	public static void main(String[] args) {
		BankingController bc = new BankingController();
		//1.���� ���
		File file = new File("test.dat");
		bc.createData(file);
		
		//2. �Ա�
		bc.deposit("U3", "S", "A4", 500.00);
		bc.deposit("U1", "C", "A2", 100.00);
		
		//3. ���
		bc.withdraw("U1", "C", "A2", 230);
		bc.withdraw("U1", "S", "A1", 200.00);
		
		//4. �ܾ���ȸ
		bc.getBalance("U1", "C", "A2");		
		bc.getBalance("U1", "C", "A2");		
		bc.getBalance("U1", "S", "A1");		
		bc.getBalance("U1", "C", "A2");
		
		//5. ��ü
		bc.transfer("U3", "C", "A5", 100.00, "U4", "S", "A6");
		bc.transfer("U3", "S", "A4", 100.00, "U4", "S", "A6");
		
		//6. �ŷ����� ��ȸ
		bc.getTransaction(); 
		//7. ��ü ������ȸ
		bc.checkAccounts();
		//8. ������ ���
		bc.accumulateInterest();
		//9. �� ����Ʈ
		bc.customerReport();

	}
}
