package com.edu.array.test;
/*
	�迭�� ������ �ִ� �߿��� ����..
	
	"Resizing�� �ȵȴ�."
	�ѹ� ���� �迭 ��ü�� ������ ����� �����ϰ� �Ǹ�
	���ο� ��ü�� ���������... ���� ���� ��ü�� ������ ������ ������ ��ü�� �ȴ�.
	�ѹ� �迭�� ���� �� ����� �˳��� ������...
	
	"�ٸ� ����� ���� �迭�� ������ Copy�� �� ���� �ִ�."(�ٸ� �迭�� ī���� �� �� �ִ�.)
	System.arraycopy()
	
	
	
	
	������ �⺻�� Ÿ���� �迭�� �ٷ�� �ִµ�
	Ŭ���� Ÿ���� �迭�� �ٷ� ���� ���� �����
*/
public class BasicArrayCopyTest4 {
	public static void main(String[] args) {
		int[] target= {1,2,3,4,5,6};
		for(int i=0; i<target.length; i++) System.out.println(target[i]+" ");
		//���� for��, for in "���� ��� ���ư���?" �����ϰ� �ϸ��
		for(int i : target) //target �ȿ� �ִ� ���� �ѹ��� �� �Ҵ�� ������ ����, �ٵ� �˰��� ������ ���� ��������, ���α׷� �� ���� ��!
			System.out.println(i+" ");
			
		//ȸ������ �þ���.. �׷��� �迭�� ����� �÷��� �Ѵ�... ĭ�� �÷��� �Ѵ�. 10ĭ����
		target= new int[10]; //ĭ�� �÷ȴ�.
		target[6] =11;
		target[7] =22;
		target[8] =33;
		target[9] =44;
		System.out.println("==============");
		for(int i : target) System.out.println(i+ " ");
	}

}
