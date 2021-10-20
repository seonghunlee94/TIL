package com.edu.cons;

public class NoteBook {
	public String brandName;
	public int price;	
	public int serialNumber;
	
	//
	public NoteBook(){}
	public NoteBook(String brandName, int price, int serialNumber){
		this.brandName=brandName;
		this.price=price;
		this.serialNumber = serialNumber;
	}
	
	public void printInfo() {		
		System.out.println("NoteBook Brand :: "+brandName+", Price :: "+price+", Number :: "+serialNumber);
	}
	
	public  String  getBrandName() {		
		return "NoteBook brandName :: "+brandName;
	}
	
	//메소드 추가...필드에 값을 할당받을수 있는 기능을 하나 추가한다.
	public void setNoteBookInfo(String brandName, int price, int serialNumber){
		//~Test에서 기능호출할때 받은 인자값으로 다시 필드에 할당
		//필드초기화(Field Initialization)
		
		//this::필드와 로컬변수의 이름이 같은때 구분하기 위해서 필드앞에 붙여준다.
		this.brandName=brandName;
		this.price=price;
		this.serialNumber = serialNumber;
	}
}








