package com.edu.capsul;

import org.omg.Messaging.SyncScopeHelper;

//오늘 날짜 정보를 가지고 있는 클래스...
public class MyDate {
	
	//같은 클래스에서만 ... 접근 가능... 다른 클래스에서 접근 불가
	private int month;
	private int day;
	private int monthLastDay;
	
	public void setMonth(int month) {
		//invalid한 값이 전달되더라도 필드 초기화 되기 직전에 걸러낼 수 잇다.
		//month에 해당하는 값이 1~12일 경우에만 필드초기화 되도록 한다.
		if(month >=1 && month <=12 ) {
		this.month = month;
		}else {
			System.out.println("잘못된 월 입력입니다..");
		}
	}
	public void setDay(int day) {
		/*
			switch문을 사용
			1,3,5,7,8,10,12월 일대는 day가 1~31일
			4,6,9월 일때는 day가 1~30일
			2월일때는 day가 1~28일까지의 값을 갖도록 로직을 제어하세요
		*/
		switch(month){
			case 1:	case 3: case 5: case 7: case 8: case 10: case 12: 
				monthLastDay=31;
				System.out.println(monthLastDay);
				break;
			case 4:	case 6: case 9:
				monthLastDay=30;
				System.out.println(monthLastDay);
				break;
			case 2:
				monthLastDay=28;
				System.out.println(monthLastDay);
				break;
				default:
				System.out.println("달을 다시 입력해주세요");
		}
		if(day<=monthLastDay &&day>0 ) { this.day = day;}
		else {
			System.out.println("일을 다시 입력해주세요");
		}
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	
	
}
