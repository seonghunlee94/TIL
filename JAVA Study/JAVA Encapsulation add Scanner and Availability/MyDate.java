package com.edu.capsul;

import org.omg.Messaging.SyncScopeHelper;
/*
	Encapsulation Pattern
	1. �ʵ� �տ� private ����... �ٸ� Ŭ�������� �ʵ忡 ���Ҵ� ����(�������� ������ ���´�)--3���� �����
	2. setXxx(O,O) / getXxx() �� public���� ����
	3. setXxx() �޼ҵ忡�� �ʵ��ʱ�ȭ �Ǳ� ������ 
		���� ���� Ÿ���� �������� ���� ��ȿ�� �˻縦 �Ѵ�.
*/

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
			System.exit(0); // 0 = ���� ����, -1 = ������ ����
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
		case 2:
			if(day>=1 & day <=28) {
				this.day = day;
			}
			else { 
				System.out.println("�߸��� ��¥!!");
				//System.exit(0);//���⼭ ���α׷��� ��������... �ٽ� Test�� ���ư��� �ʾƵ� ��
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
				System.out.println("�߸��� ��¥!!");//0
				System.exit(0);
			}
				break;
		default:
			if(day>=1 & day <=31) { 
				this.day = day;
			}
			else { 
				System.out.println("�߸��� ��¥!!");
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
