package com.edu.array.test;
/*
	Array란?
	같은 데이터 타입(배열의 전제 조건, 가장 중요)을 가지는 서로 다른 값들을
	하나의 변수로 처리하는 것
	
	Array 선언, 생성, 초기화
	1. 선언		2. 생성(new, 객체는 new로 생성)(주의!반드시 사이즈를 명시)  3. 초기화
	int[] arr;	arr = new int[3];					arr[0]=11;arr[1]=22;arr[2]=33;
*/
public class BasicArrayTest1 {

	public static void main(String[] args) {
		// 1. 배열 선언
		int[] arr;
		//2. 배열 생성
		arr= new int[3];
		
		//3. 초기화
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		
		
		
		//length는 배열의 사이즈를 리턴하는 필드이다. int반환
		System.out.println("배열 각각의 칸에 들어있는 값 ...");
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			System.out.println("배열 객체를 참조하는 주소값 ::"+ arr);
		}

	}

}
