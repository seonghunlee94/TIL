package com.edu.bank;
/*
 * ���� ���� ������ ��� �ִ� Ŭ����
 * �ش� ���� �������� ������ ������ �ִ� ������ ����Ǿ��� �ִ�.
 * --------------------------------------------------
 * Customer Ŭ������
 * Account[ ] Ŭ������ ������ �����̴�.
 */
public class Customer {
	//1. �ʵ� ����
	//������ ����
	private int ssn;
	private String name;
	
	//Has a Relation
	//setter����
	private Account[ ] accounts;
	
	//2. ������ �ʵ尪�� ���� �����Ѵ�.
	public Customer(int ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}
	
	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	
	public Account[] getAccounts() {
		return accounts;
	}

	/////////////////////////////////////////////////
	
	//���� ������ ��ȯ
	public String getCustomerInfo() {
		return ssn+", "+ name;
	}	
}













/*package com.edu.bank;

	���� ���� ������ ��� �ִ� Ŭ����
	�ش� ���� �������� ������ ������ �ִ� ������ ����Ǿ��� �ִ�.
	-----------------------------------------------
	CustomerŬ������
	Account[] Ŭ������ ������ �����̴�.

public class Customer {
	// 1. �ʵ� ����
	// ������ ����
	private int ssn;//�ֹε�� ��ȣ��� �����ϸ� ��
	private String name;
	
	//Has a Relation
	// setter�� ����
	private Account[] accounts;
	
	/////////////////////////////////////////

	//2.������ �ʵ尪�� ������
	public Customer(int ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	
	public Account[] getAccounts() {
		return accounts;
	}
	
///////////////////////////////////////
	
	//���� ������ ��ȯ�ϴ� ���
	public String getCustomerInfo() {
		return ssn+","+name;
	}

	
	
}
*/