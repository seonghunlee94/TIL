package com.edu.bank;


public class Customer {
	
	String firstName;
	String lastName;
	
	//Has a Relation...
	Account account; //1
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Account getAccount() {
		return account;//ȣ���� ������ ����
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	//�߰������� �ʿ��� �޼ҵ�
	public String getCustomer() {
		return lastName+ " "+ firstName;
	}
	
	
	
	
	
	
	
	/*String firstName;
	String lastName;
	
	Account account= new Account();
	
	public Customer(){
		
	}
	public Customer(String firstName, String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public void setAccount(Account account) {
		
		this.account= account;
	}
	
	public Account getAccount() {
		return account;
	}
	
	public String getCustomer() {
		return lastName +","+ firstName+","+ account;
	}
	*/
}
