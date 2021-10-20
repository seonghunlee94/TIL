package com.edu.cons;

class Person{
	String name;
	int age;
	
	Person(){}
	Person(String name, int age){
		//필드 초기화
		this.name = name;
		this.age = age;
	}
	
	public void setPerson(String name, int age) {
		//필드 초기화
		this.name = name;
		this.age = age;
	}
	
	public String getPerson() {
		return name+","+age;
	}	
}
public class PersonTest {
	public static void main(String[] args) {
		/*
		 * 생성자란?
		 * 객체가 생성될때마다 구동하는 것
		 * 
		 * 1.모든 클래스에는 하나이상의 생성자가 무조건 존재한다.
		 * 2.기본생성자는 개발자가 작성하지 않아도 무조건 클래스에 존재한다.
		 *   Default Constructor는 인자값 X, {} 구현부에서 아무런 일도 하지않은 생성자
		 *   
		 * 3.명시적 생성자는 인자값이 하나이상
		 *   하는 일은 "필드 초기화"
		 *   
		 * 4.클래스에 명시적 생성자를 작성해놓으면
		 *   컴파일러가 기본생성자를 넣어주는 작업을 하지 않는다.
		 *   
		 *  ::
		 *  
		 *  필드에 값이 주입되는  통로는 단 2개이다.
		 *  1) 명시적 생성자..객체가 생성되는 것과 동시에 값이 주입됨
		 *  2) setter() ..객체가 생성된 직후에 값이 주입됨
		 */
		
		//객체생성과 동시에 명시적값을 할당....
		Person p1 = new Person("James", 65);
		Person p2 = new Person("아이유", 30);
		Person p3 = new Person();
		
		/*p1.setPerson("James", 65);
		p2.setPerson("아이유", 30);*/
		p3.setPerson("기안84", 35);
		
		System.out.println(p1.getPerson());
		System.out.println(p2.getPerson());
		System.out.println(p3.getPerson());

	}
}
