package com.edu.cons;

public class NoteBook {
	public String brandName;
	public int price;
	public int serailNumber;
	
	public NoteBook() {
		
	}
	public NoteBook(String brandName,int price,int serailNumber){
		this.brandName=brandName;
		this.price=price;
		this.serailNumber=serailNumber;
	}
	
	
	public void printInfo() {
		System.out.println("NoteBook Brand :: "+brandName+", Price :: "+price+", Number :: "+ serailNumber);
	}

	public String getBrandName() {
		return "NoteBook brandName ::"+ brandName +"," +"Price :: " +price+","+ "Number :: "+ serailNumber;
	}
	
	
	public void setNoteBookInfo(String brandName, int price, int serailNumber){
		//~Test에서 기능 호출할 때 받은 인자값으로 다시 필드에 할당
		//필드 초기화 (Field Initialization)
		
		//this::필드와 로컬변수의 이름이 같을 때 구분하기 위해서 필드 앞에 붙여준다.
		this.brandName=brandName;
		this.price=price;
		this.serailNumber=serailNumber;
		
	}
}
