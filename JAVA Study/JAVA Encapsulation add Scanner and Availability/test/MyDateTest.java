package com.edu.capsul.test;
import java.util.Scanner;

/*
	Encapsulation pattern
	1.외부(다른 클래스)로부터 직접적으로 막는다. private
	2.field 값을 set get으로 소통함, public은 접근 지정자.
	3.set 어디 부분에 제어문을 달아야 하는지 정리하기! set 메소드 구현부에 제어문을 달아야한다.
*/
import com.edu.capsul.MyDate;

public class MyDateTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("오늘 날짜를 입력하세요");
		
		MyDate md= new MyDate();//Ctrl + Shift + o 한번에 임포트되어짐
		
		
		while(true) {
			System.out.println("월 입력 >>(0은 종료)");
			
			int month=sc.nextInt();
			if(month >=0 && month <=12) {
				md.setMonth(month);//111
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
			}
		}
		
		
		while(true) {
			System.out.println("일 입력 >>");
			int day=sc.nextInt();
			if(day >=0 && day <=31) {
				md.setDay(day);//111
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
			}
		}
		
		System.out.println("오늘은"+md.getMonth()+"월"+md.getDay()+"일");
		
		
	}

}
