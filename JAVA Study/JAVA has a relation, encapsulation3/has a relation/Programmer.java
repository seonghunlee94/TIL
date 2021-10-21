package com.edu.cons;
// Programmer��  NoteBook�� ������ ���踦 ����...Has A Relation
/*
	1. �ʵ� ������ �߰��ϰ��� �ϴ� Ŭ������ ����(�����ѰŴ� �ƴϾ�)
	2. �߰��� �ʵ带 �����ϴ� ��θ� �ϳ� ����
	������ Ȥ�� setter()
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
	//setter()�� �߰�
	public void buyNoteBook(NoteBook noteBook) {
		this.noteBook=noteBook;
	}
	// ������ ��Ʈ���� �ٽ� �޾ƿ��� ��Ʈ�� �߰��Ѵ�.
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
