package com.edu.array.test;
/*
	Array��?
	���� ������ Ÿ��(�迭�� ���� ����, ���� �߿�)�� ������ ���� �ٸ� ������
	�ϳ��� ������ ó���ϴ� ��
	
	Array ����, ����, �ʱ�ȭ
	1. ����		2. ����(new, ��ü�� new�� ����)(����!�ݵ�� ����� ���)  3. �ʱ�ȭ
	int[] arr;	arr = new int[3];					arr[0]=11;arr[1]=22;arr[2]=33;
*/
public class BasicArrayTest1 {

	public static void main(String[] args) {
		// 1. �迭 ����
		int[] arr;
		//2. �迭 ����
		arr= new int[3];
		
		//3. �ʱ�ȭ
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		
		
		
		//length�� �迭�� ����� �����ϴ� �ʵ��̴�. int��ȯ
		System.out.println("�迭 ������ ĭ�� ����ִ� �� ...");
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			System.out.println("�迭 ��ü�� �����ϴ� �ּҰ� ::"+ arr);
		}

	}

}
