package com.edu.capsul;

import org.omg.Messaging.SyncScopeHelper;

//���� ��¥ ������ ������ �ִ� Ŭ����...
public class MyDate {
	
	//���� Ŭ���������� ... ���� ����... �ٸ� Ŭ�������� ���� �Ұ�
	private int month;
	private int day;
	private int monthLastDay;
	
	public void setMonth(int month) {
		//invalid�� ���� ���޵Ǵ��� �ʵ� �ʱ�ȭ �Ǳ� ������ �ɷ��� �� �մ�.
		//month�� �ش��ϴ� ���� 1~12�� ��쿡�� �ʵ��ʱ�ȭ �ǵ��� �Ѵ�.
		if(month >=1 && month <=12 ) {
		this.month = month;
		}else {
			System.out.println("�߸��� �� �Է��Դϴ�..");
		}
	}
	public void setDay(int day) {
		/*
			switch���� ���
			1,3,5,7,8,10,12�� �ϴ�� day�� 1~31��
			4,6,9�� �϶��� day�� 1~30��
			2���϶��� day�� 1~28�ϱ����� ���� ������ ������ �����ϼ���
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
				System.out.println("���� �ٽ� �Է����ּ���");
		}
		if(day<=monthLastDay &&day>0 ) { this.day = day;}
		else {
			System.out.println("���� �ٽ� �Է����ּ���");
		}
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	
	
}
