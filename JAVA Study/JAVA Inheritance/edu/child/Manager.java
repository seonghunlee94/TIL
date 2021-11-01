package com.edu.child;

import com.edu.parent.Employee;
import com.edu.util.MyDate;

/*
 * Employee�� �ڽ� Ŭ����..
 * �θ� ���� ��� ������ �����ް�
 *         +
 * �ڽŸ��� ����� �߰�..
 * ::
 * ��ӿ��� �ڽ�ũ����
 * �ʵ� --> �ڽŸ��� �ʵ带 �߰�
 * �޼ҵ� --> �θ� ������ ����� �ڱ⿡�� �°� ���ľ���
 * (��Ӱ��迡 �ִ� 2���� Ŭ���������� ����..�������̵�)
 */
//�θ� Employee�κ��� Ȯ��� �ڽ� Ŭ���� Manager�� ����
public class Manager extends Employee{

	private String dept;
	
	//�̺κ��� ������ �ȳ��� �ҷ��� � �ڵ带 �߰��ؾ��ұ��????
	public Manager(String name,MyDate birthDate,double salary,String dept) {
		//super();//Employee();//null, null,0.0
		super(name, birthDate,salary);
		this.dept = dept;
	}	
	
	/*
		��Ӱ��迡 �ִ� 2���� Ŭ�������� method�� ��ӵɶ� �Ͼ�� ��
		Method Overring
		1 step. �θ� ���� �޼ҵ带 �״�� �����޴´�.
		2 step. �װ� ��ģ��
		
		�θ� ���� �޼ҵ带 �����޾Ƽ�
		����� �ڽĿ��� �°� �ٽ� ���ļ� ����ϴ� ��
		:
		����� �ٲ���� ������ ���ο� �޼ҵ尡 ��������ٰ� �����ص� �ȴ�...
		�޼ҵ� ������
		<Rule>
		1. �޼ҵ� ����δ� ��� ��ġ - �̸�, ���ڰ�, ����Ÿ��.
		2. �޼ҵ� �����δ� �޶�� �Ѵ�.- ����� �޶�����.
		3. ���δٸ� ��Ӱ����� Ŭ�������� �߻��Ѵ�.
	 */
	public String getDetails() {
		return super.getDetails()+","+dept;
	}
	
	//�ڽĸ��� ����� ���Ӱ� �߰��� ���..�������̵��� �������.
	public void changeDept(String dept) {
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}
}

























