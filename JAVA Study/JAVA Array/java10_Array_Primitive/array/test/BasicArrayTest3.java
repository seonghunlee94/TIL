/*package com.edu.array.test;
public class BasicArrayTest3 {

	public static void main(String[] args) {
		
		//1. 배열 선언과 생성과 초기화를 한번에, 값이 세 개 들어가니까 칸이 세 개 들어갔어!
		int[] arr = {11,22,33};
		int[] arr2 = {1,2,3};
		
		System.out.println("배열 각각의 칸에 들어있는 값 ...");
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			System.out.println("배열 객체를 참조하는 주소값 ::"+ arr);
			
			System.out.println("\n============\n");
			
			// 추가... 메모리에서 어떤 일이 벌어지는지를 잘 생각해보시기 바랍니다.
			//가능하다면 직접 그림!!! 그려주세요!!
		}
		arr = arr2;
		
		System.out.println("배열 각각의 칸에 들어있는 값2 ...");
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
			System.out.println("배열 객체를 참조하는 주소값 ::"+ arr2);

	}
	}
}*/
package com.edu.array.test;
public class BasicArrayTest3 {
	public static void main(String[] args) {
		
		//1.배열 선언과 생성과 초기화를 한번에
		int[ ] arr= {11,22,33};
		int[ ] arr2 = {1,2,3};
		
		System.out.println("배열 각각의 칸에 들어있는 값...");		
		for(int i=0; i< arr.length; i++) 
			System.out.print(arr[i]+" ");
		
		System.out.println("배열 객체를 참조하는 주소값:: "+arr);
		
		System.out.println("\n=============================\n");
		
		//추가...메모리에서 어떤 일이 벌어지는지를 잘 생각해보시기 바랍니다.
		//가능하다면 직접 그림!!! 그려주세요!!!!!
		
		arr2 = arr;
		
		System.out.println("배열 각각의 칸에 들어있는 값2...");		
		for(int i=0; i< arr2.length; i++) 
			System.out.print(arr2[i]+" ");
		
		System.out.println("배열 객체를 참조하는 주소값:: "+arr2);//참조 변수는 toString이 생략되 있는거야
		//toString()....주소값을 문자열로 리턴하는 기능
		System.out.println("배열 객체를 참조하는 주소값:: "+arr2.toString());//위와 동일한 값 출력
		
	}
}
