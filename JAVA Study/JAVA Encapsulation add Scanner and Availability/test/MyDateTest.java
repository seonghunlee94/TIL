package com.edu.capsul.test;
import java.util.Scanner;

/*
	Encapsulation pattern
	1.�ܺ�(�ٸ� Ŭ����)�κ��� ���������� ���´�. private
	2.field ���� set get���� ������, public�� ���� ������.
	3.set ��� �κп� ����� �޾ƾ� �ϴ��� �����ϱ�! set �޼ҵ� �����ο� ����� �޾ƾ��Ѵ�.
*/
import com.edu.capsul.MyDate;

public class MyDateTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ��¥�� �Է��ϼ���");
		
		MyDate md= new MyDate();//Ctrl + Shift + o �ѹ��� ����Ʈ�Ǿ���
		
		
		while(true) {
			System.out.println("�� �Է� >>(0�� ����)");
			
			int month=sc.nextInt();
			if(month >=0 && month <=12) {
				md.setMonth(month);//111
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���");
			}
		}
		
		
		while(true) {
			System.out.println("�� �Է� >>");
			int day=sc.nextInt();
			if(day >=0 && day <=31) {
				md.setDay(day);//111
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���");
			}
		}
		
		System.out.println("������"+md.getMonth()+"��"+md.getDay()+"��");
		
		
	}

}
