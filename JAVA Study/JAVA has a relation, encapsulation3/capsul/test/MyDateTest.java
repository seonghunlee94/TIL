package com.edu.capsul.test;
/*
	Encapsulation pattern
	1.
	2.
	3.set ��� �κп� ����� �޾ƾ� �ϴ��� �����ϱ�!
*/
import com.edu.capsul.MyDate;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate md= new MyDate();//Ctrl + Shift + o �ѹ��� ����Ʈ�Ǿ���
		//ĸ��ȭ�ؼ� �ʵ忡 �������� ������ ���Ƶд�.
		//md.month =33;
		//md.day = 33;
		
		md.setMonth(2);
		md.setDay(3);
		
		//��µ� �� 0�� 21��
		//10�� 0�� ... �̷� ���� ���������� ����� �ȵǵ��� �Ͻñ� �ٶ��ϴ�.
		if(md.getMonth()!=0 & md.getDay()!=0) {
			System.out.println("������"+md.getMonth()+"��"+md.getDay()+"��");
		}else {
			System.out.println("�ް� ���� �ٽ� Ȯ�����ּ���");
		}
		
		
	}

}
