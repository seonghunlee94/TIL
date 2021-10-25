package com.edu.bank.test;

import com.edu.bank.Account;

public class BankTest1 {

	public static void main(String[] args) {
		// 1. accounts라는 이름으로 Account 타입의 배열 생성 .. 사이즈는 3
			/*Account[] accounts= new Account[3];
			
		// 2. 각각의 칸에 신한, 국민, 우리은행 통장을 생성
			accounts[0] = new Account(10000.0, "신한은행");
			accounts[1] = new Account(5000.0, "국민은행");
			accounts[2] = new Account(7000.0, "우리은행");*/
			
		//배열의 선언 + 생성 + 초기화를 한꺼번에...
		/*
			기본형 타입의 배열에서의 값은 데이터 자체를 의미하지만
			클래스 타입의 배열에서의 값은 생성된 객체가 된다. 생성된 객체 자체다.
		*/
		Account[] accounts= {
				new Account(10000.0, "신한은행"),
				new Account(5000.0, "국민은행"),
				new Account(7000.0, "우리은행")
		};
		
		
		//3. for문을 이용해서 배열 안에 있는 Account 정보를 출력
			for(Account account : accounts) System.out.println(account.getDetails());
	}

}
