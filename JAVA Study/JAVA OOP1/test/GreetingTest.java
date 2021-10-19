package com.edu.oop.test;

import com.edu.oop.Greeting;

/*
	main 메소드를 가진 실행 클래스
	~~Test.java
	::
	
	1) 객체를 생성한다 == 클래스의 모든 요소를 메모리에 올린다.
	2) 메모리에 올라간 변수와 메소드에 접근한다.
	    변수에 접근 ---> 값할당
	    메소드 접근 ---> 호출
*/
public class GreetingTest {

	public static void main(String[] args) {
		//객체 생성 == Greeting 클래스의 모든 요소가 메모리에 올라간다. **외우기**
		Greeting g = new Greeting();
		//메모리에 올라간 멤버(변수와 메소드)에 접근
		g.message ="안녕^^ 여러부운~~";//literal value(실제 값)이 왼편에 있는 변수에 할당(주입)되는 것 
		g.printMessage();// 메소드 호출(Calling)
		//  ; 문장의 마무리이자 콜링
	}//콜링 메소드와 worker 메소드

}
