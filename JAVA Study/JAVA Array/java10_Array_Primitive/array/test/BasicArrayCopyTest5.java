package com.edu.array.test;
/*
	�迭�� ������ �ִ� �߿��� ����..
	
	
	"�ٸ� ����� ���� �迭�� ������ Copy�� �� ���� �ִ�."(�ٸ� �迭�� ī���� �� �� �ִ�.)
	System.arraycopy()
	
*/
public class BasicArrayCopyTest5 {
	public static void main(String[] args) {
	
		int[] target= {1,2,3,4,5,6};//6
		int[] source= {10,9,8,7,6,5,4,3,2,1};//10
		
		System.out.println();
		System.arraycopy(source, 2, target, 0, target.length);//copy ����
		System.out.println(target);
		for(int i : target) System.out.print(i+ " ");
		//target ������ ����� ...8,7,6,5,4,3
		//System.arraycopy(); -- static�� �����̾ ��ü ������ ���ϰ� �ٷ� �� �� �־�
		//for �̿��ؼ� target���� �����͸� ��¹޾Ƽ� Ȯ���غ�����

	
	}

}
