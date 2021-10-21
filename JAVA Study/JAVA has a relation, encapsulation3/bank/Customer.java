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
		return account;//호출한 곳으로 리턴
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	//추가적으로 필요한 메소드
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
