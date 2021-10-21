package com.edu.cons;
// Programmer가  NoteBook을 가지는 관계를 설정...Has A Relation
/*
	1. 필드 레벨에 추가하고자 하는 클래스를 선언(주입한거는 아니야)
	2. 추가한 필드를 주입하는 통로를 하나 생성
	생성자 혹은 setter()
*/
public class Programmer {
	public String name;
	public String address;
	public String mainSkill;
	int salary;
	
	NoteBook noteBook = new NoteBook();
	
	
	public Programmer() {
		
	}
	public Programmer(String name, String address,String mainSkill,int salary) {
		this.name=name;
		this.address=address;
		this.mainSkill=mainSkill;
		this.salary=salary;
	}
	//setter()를 추가
	public void buyNoteBook(NoteBook noteBook) {
		this.noteBook=noteBook;
	}
	// 주입한 노트북을 다시 받아오는 루트도 추가한다.
	public NoteBook getNoteBook() {
		return noteBook;
	}
	
	public void setProgrammerInfo(String name, String address, String mainSkill, int salary) {
		this.name=name;
		this.address=address;
		this.mainSkill= mainSkill;
		this.salary=salary;
	}
	
	public String getProgrammerInfo() {
		return name+"\t"+ address+"\t" + mainSkill +"\t"+salary;
	}
	
		public int getAnnualSalary() {
			return salary * 12;		
		}

	//
	public String getMainSkill() {
		return mainSkill;
	}
	
}
