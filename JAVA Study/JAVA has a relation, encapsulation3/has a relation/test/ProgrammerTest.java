package com.edu.cons.test;

import com.edu.cons.NoteBook;
import com.edu.cons.Programmer;

public class ProgrammerTest {

	public static void main(String[] args) {
		/*
			1. programmer 객체를 생성.. 이름을 james로
			2. james가 삼성 노트북 한대를 구매함
			3. james가 구매한 노특북의 정보를 출력함
			   이때 james의 기술셋(mainSkill)도 함께 출력함
		 */		
		
		Programmer james=new Programmer("james", "NY","JAVA", 3500 );
		//james가 노트북을 구매... has a relation
		/*NoteBook nb = new NoteBook("SAMSUNG", 200, 1234);
		james.buyNoteBook(nb);*/
		james.buyNoteBook(new NoteBook("SAMSUNG", 200, 1234));
		
		System.out.println("James의 주력 기술은"+james.getMainSkill()+"!!!");
		
		//james가 구매한 노트북 정보를 출력함 -- 받아오는 메소드 필요
		james.getNoteBook().printInfo();
		
	}

}
