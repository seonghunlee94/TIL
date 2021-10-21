package com.edu.capsul.test;
/*
	Encapsulation pattern
	1.
	2.
	3.set 어디 부분에 제어문을 달아야 하는지 정리하기!
*/
import com.edu.capsul.MyDate;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate md= new MyDate();//Ctrl + Shift + o 한번에 임포트되어짐
		//캡슐화해서 필드에 직접적인 접근은 막아둔다.
		//md.month =33;
		//md.day = 33;
		
		md.setMonth(2);
		md.setDay(3);
		
		//출력될 때 0월 21일
		//10월 0일 ... 이런 값이 최종적으로 출력이 안되도록 하시기 바랍니다.
		if(md.getMonth()!=0 & md.getDay()!=0) {
			System.out.println("오늘은"+md.getMonth()+"월"+md.getDay()+"일");
		}else {
			System.out.println("달과 월을 다시 확인해주세요");
		}
		
		
	}

}
