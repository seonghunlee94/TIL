package com.edu.bank.test;

import com.edu.bank.Account;
import com.edu.bank.Customer;

public class BankTest {

	public static void main(String[] args) {
		
		//1.���� ����
		Customer custom = new Customer("James", "Gpsling");
		
		//2. James�� ������ �ϳ� ���� ... Has a Relation
		custom.setAccount(new Account(10000.0));
		
		//3.James�� ������ ������ �ϳ� �޾Ƽ�...
		//CustomerŬ������ �ִ� getAccount()�޼ҵ带 ȣ��...  .�� at�̾�!
		Account jamesAcc=custom.getAccount();
		
		
		//4. ���� james�� ������ ������ ����� �� �ִ�.
		//5000, 3000, 20000 �Ա��ϰ� /25000 ��� / ���� �ݾ� ����/  13000 �ܾ�
		jamesAcc.deposit(5000);
		jamesAcc.deposit(3000);
		jamesAcc.deposit(20000);
		/////////////////////////
		jamesAcc.withdraw(25000);
		
		System.out.println("james Account Balance :: "+ jamesAcc.getBalance());
		
		
		
		
		
		/*Customer customer= new Customer("��", "����");
		Account account = new Account(1234);
		
		account.deposit(amt);
		System.out.println(customer.getAccount());
		System.out.println(customer.getCustomer());
		System.out.println("--------------");
		customer.getCustomer();
		customer.getCustomer();
		System.out.println(customer);
		System.out.println(account);*/
	}

}
