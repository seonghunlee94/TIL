package com.edu.cons.test;

import com.edu.cons.NoteBook;
import com.edu.cons.Programmer;

public class ProgrammerTest1 {

	public static void main(String[] args) {
		//1. NoteBook ��ü�� 2�� ����...nb1, nb2
		//  �̋� ���� ������ ��θ� �����ڷ�....setNoteBook()�� ������
		NoteBook nb1 = new NoteBook("HP", 1000, 111);
		NoteBook nb2 = new NoteBook("LG", 2000, 222);		
		
		//2. Programmer ��ü�� 2�� ����...pro1, pro2
		//�̶� ���� ������ ��θ� �����ڷ�...setProgrammer()�� ������
		Programmer pro1 = new Programmer("James", "NY", "JAVA", 400000);
		Programmer pro2 = new Programmer("Gosling", "LA", "PYTHON", 500000);
		
		//3. nb1, nb2�� ������ ���
		nb1.printInfo();
		nb2.printInfo();
		
		//4. pro1, pro2�� ������ ���
		System.out.println(pro1.getProgrammerInfo());
		System.out.println(pro2.getProgrammerInfo());
	}

}



















