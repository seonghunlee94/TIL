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
		//~Test���� ��� ȣ���� �� ���� ���ڰ����� �ٽ� �ʵ忡 �Ҵ�
		//�ʵ� �ʱ�ȭ (Field Initialization)
		
		//this::�ʵ�� ���ú����� �̸��� ���� �� �����ϱ� ���ؼ� �ʵ� �տ� �ٿ��ش�.
		this.brandName=brandName;
		this.price=price;
		this.serailNumber=serailNumber;
		
	}
}
