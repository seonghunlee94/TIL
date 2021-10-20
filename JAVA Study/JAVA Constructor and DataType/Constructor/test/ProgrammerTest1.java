package com.edu.cons.test;

import com.edu.cons.NoteBook;
import com.edu.cons.Programmer;

public class ProgrammerTest1 {

	public static void main(String[] args) {
		//1. NoteBook 객체를 2개 생성...nb1, nb2
		//  이떄 값의 주입의 통로를 생성자로....setNoteBook()는 사용안함
		NoteBook nb1 = new NoteBook("HP", 1000, 111);
		NoteBook nb2 = new NoteBook("LG", 2000, 222);		
		
		//2. Programmer 객체를 2개 생성...pro1, pro2
		//이때 값의 주입의 통로를 생성자로...setProgrammer()는 사용안함
		Programmer pro1 = new Programmer("James", "NY", "JAVA", 400000);
		Programmer pro2 = new Programmer("Gosling", "LA", "PYTHON", 500000);
		
		//3. nb1, nb2의 정보를 출력
		nb1.printInfo();
		nb2.printInfo();
		
		//4. pro1, pro2의 정보를 출력
		System.out.println(pro1.getProgrammerInfo());
		System.out.println(pro2.getProgrammerInfo());
	}

}



















