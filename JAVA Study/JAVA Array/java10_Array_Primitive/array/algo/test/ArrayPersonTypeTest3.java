package com.edu.array.algo.test;

import java.util.Scanner;
/*
Input Sample Data
6
1 4 4 4 5 3 
*/
public class ArrayPersonTypeTest3 {
	public static void main(String[] args) {
		System.out.println("�ο����� �Է����ּ���");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();//�迭�� ����� �ȴ�.6
		
		int[ ] people = new int[num]; //6ĭ ¥�� �迭�� �������
		//while(true) {
			
			for(int i=0; i<people.length; i++) {
				people[i] = sc.nextInt();//�� ����� ���������� �Է� 1~5
				if(people[i]< 6 && people[i]>=0) {
					continue;
				}else {
					System.out.println("���� ������ �ٽ� �Է����ּ���");
					i--;
				}
			}
			
			
		//}
		
			
		for(int i : people) System.out.print(i);
		//���, for���� ����ؼ� ���� ���� ������ Ÿ���� ���� ���
		
		
		//����
		
		//System.out.println("Result :: "+);

	}
}



/*package com.edu.array.algo.test;

import java.util.Scanner;

 * input sample Data
	6
	1 4 4 4 5 3


public class ArrayPersonTypeTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();//�迭�� ����� �ȴ�.
		
		int[] people= new int[num];
		for(int i=0; i<people.length; i++) {
			people[i] = sc.nextInt();// �� ����� ���� ������ �Է� 1~5
			
		}
		
		//���, for���� ����ؼ� ���� ���� ������ Ÿ���� ���� ���
		
		
		//����
		System.out.println();

	}

}
*/