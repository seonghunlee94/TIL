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
	
	//�޼ҵ� �߰�...�ʵ忡 ���� �Ҵ������ �ִ� ����� �ϳ� �߰��Ѵ�.
	public void setNoteBookInfo(String brandName, int price, int serialNumber){
		//~Test���� ���ȣ���Ҷ� ���� ���ڰ����� �ٽ� �ʵ忡 �Ҵ�
		//�ʵ��ʱ�ȭ(Field Initialization)
		
		//this::�ʵ�� ���ú����� �̸��� ������ �����ϱ� ���ؼ� �ʵ�տ� �ٿ��ش�.
		this.brandName=brandName;
		this.price=price;
		this.serialNumber = serialNumber;
	}
}








