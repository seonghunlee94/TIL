package com.edu.cons.test;

import com.edu.cons.NoteBook;
import com.edu.cons.Programmer;

public class ProgrammerTest {

	public static void main(String[] args) {
		/*
			1. programmer ��ü�� ����.. �̸��� james��
			2. james�� �Ｚ ��Ʈ�� �Ѵ븦 ������
			3. james�� ������ ��Ư���� ������ �����
			   �̶� james�� �����(mainSkill)�� �Բ� �����
		 */		
		
		Programmer james=new Programmer("james", "NY","JAVA", 3500 );
		//james�� ��Ʈ���� ����... has a relation
		/*NoteBook nb = new NoteBook("SAMSUNG", 200, 1234);
		james.buyNoteBook(nb);*/
		james.buyNoteBook(new NoteBook("SAMSUNG", 200, 1234));
		
		System.out.println("James�� �ַ� �����"+james.getMainSkill()+"!!!");
		
		//james�� ������ ��Ʈ�� ������ ����� -- �޾ƿ��� �޼ҵ� �ʿ�
		james.getNoteBook().printInfo();
		
	}

}
