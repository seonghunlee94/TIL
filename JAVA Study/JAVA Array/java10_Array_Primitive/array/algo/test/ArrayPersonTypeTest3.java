package com.edu.array.algo.test;

import java.util.Scanner;
/*
Input Sample Data
6
1 4 4 4 5 3 
*/
public class ArrayPersonTypeTest3 {
	public static void main(String[] args) {
		System.out.println("인원수를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();//배열의 사이즈가 된다.6
		
		int[ ] people = new int[num]; //6칸 짜리 배열이 만들어짐
		//while(true) {
			
			for(int i=0; i<people.length; i++) {
				people[i] = sc.nextInt();//각 사람의 성격유형이 입력 1~5
				if(people[i]< 6 && people[i]>=0) {
					continue;
				}else {
					System.out.println("성격 유형을 다시 입력해주세요");
					i--;
				}
			}
			
			
		//}
		
			
		for(int i : people) System.out.print(i);
		//제어문, for문을 사용해서 가장 많은 유형의 타입을 직접 출력
		
		
		//구현
		
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
		int num = sc.nextInt();//배열의 사이즈가 된다.
		
		int[] people= new int[num];
		for(int i=0; i<people.length; i++) {
			people[i] = sc.nextInt();// 각 사람의 성격 유형이 입력 1~5
			
		}
		
		//제어문, for문을 사용해서 가장 많은 유형의 타입을 직접 출력
		
		
		//구현
		System.out.println();

	}

}
*/