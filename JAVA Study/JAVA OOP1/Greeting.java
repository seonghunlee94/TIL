package com.edu.oop;

/*
	인삿말에 대한 성질과 기능을 담고 있는 클래스...
	인삿말--?(값) .. 변수(값을 담는 공간)
	인삿말을 콘솔창에 출력하는 기능-- 메소드, 함수
	
	Greeting
	변수 / 기능 *어떤 변수와 기능으로 만들 것인지 생각하는 것 중요해*
	
	
*/
public class Greeting {
	public String message; //변수 선언
	//메소드 정의 = 메소드 선언 + 메소드 구현
	public void printMessage() {//메소드 선언
		System.out.println("Greeting Message..."+message);//메소드 구현부... worker 메소드
		
	}
	
	
}


