package com.edu.bank;

public class Account {

	
	double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	// 입금하는거 출금하는거
	//10000 + 5000
	public void deposit(int amt) {//입금하다
		//balance=balance + amt;
		balance+= amt; //성능도 좋고, 가독성도 더 좋아!!
	}
	
	public void withdraw(int amt) {//출금하다
		//balance=balance - amt;
		balance-= amt; //성능도 좋고, 가독성도 더 좋아!!
	}
	
	
	
	/*double balance;
	
	public Account() {
		
	}
	public Account(double balance) {
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(int amt) {
		System.out.println("저축 :"+ balance );
	}
	
	public void withdraw(int amt) {
		System.out.println("출금 :"+ balance);
	}
	*/
}
