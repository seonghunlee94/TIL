package com.edu.bank;

public class Account {

	
	double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	// �Ա��ϴ°� ����ϴ°�
	//10000 + 5000
	public void deposit(int amt) {//�Ա��ϴ�
		//balance=balance + amt;
		balance+= amt; //���ɵ� ����, �������� �� ����!!
	}
	
	public void withdraw(int amt) {//����ϴ�
		//balance=balance - amt;
		balance-= amt; //���ɵ� ����, �������� �� ����!!
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
		System.out.println("���� :"+ balance );
	}
	
	public void withdraw(int amt) {
		System.out.println("��� :"+ balance);
	}
	*/
}
