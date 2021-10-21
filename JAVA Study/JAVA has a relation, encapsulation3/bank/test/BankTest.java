package com.edu.bank.test;

import com.edu.bank.Account;
import com.edu.bank.Customer;

public class BankTest {

	public static void main(String[] args) {
		
		//1.고객을 생성
		Customer custom = new Customer("James", "Gpsling");
		
		//2. James가 통장을 하나 개설 ... Has a Relation
		custom.setAccount(new Account(10000.0));
		
		//3.James가 개설한 통장을 하나 받아서...
		//Customer클래스에 있는 getAccount()메소드를 호출...  .은 at이야!
		Account jamesAcc=custom.getAccount();
		
		
		//4. 이제 james가 개설한 통장을 사용할 수 있다.
		//5000, 3000, 20000 입금하고 /25000 출금 / 원래 금액 만원/  13000 잔액
		jamesAcc.deposit(5000);
		jamesAcc.deposit(3000);
		jamesAcc.deposit(20000);
		/////////////////////////
		jamesAcc.withdraw(25000);
		
		System.out.println("james Account Balance :: "+ jamesAcc.getBalance());
		
		
		
		
		
		/*Customer customer= new Customer("이", "성훈");
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
