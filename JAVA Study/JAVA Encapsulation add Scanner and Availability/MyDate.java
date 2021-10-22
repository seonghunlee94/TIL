package com.edu.capsul;

import org.omg.Messaging.SyncScopeHelper;
/*
	Encapsulation Pattern
	1. 필드 앞에 private 지정... 다른 클래스에서 필드에 값할당 못함(직접적인 접근을 막는다)--3번과 연결됨
	2. setXxx(O,O) / getXxx() 는 public으로 지정
	3. setXxx() 메소드에서 필드초기화 되기 직전에 
		받은 값이 타당한 값인지에 대한 유효성 검사를 한다.
*/

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
			System.exit(0); // 0 = 정상 종료, -1 = 비정상 종료
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
		case 2:
			if(day>=1 & day <=28) {
				this.day = day;
			}
			else { 
				System.out.println("잘못된 날짜!!");
				//System.exit(0);//여기서 프로그램을 끝내도록... 다시 Test로 돌아가지 않아도 됨
			}
				break;
		case 4:	
		case 6:
		case 9:
		case 11:
			if(day>=1 & day <=30) {
				this.day = day;
				
			}
			else { 
				System.out.println("잘못된 날짜!!");//0
				System.exit(0);
			}
				break;
		default:
			if(day>=1 & day <=31) { 
				this.day = day;
			}
			else { 
				System.out.println("잘못된 날짜!!");
				System.exit(0);
			}
				break;
		}
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	
	
}
