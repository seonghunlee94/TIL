package com.edu.array.test;
/*
	배열이 가지고 있는 중요한 성질..
	
	"Resizing이 안된다."
	한번 만든 배열 객체를 가지고 사이즈를 수정하게 되면
	새로운 객체가 만들어진다... 전에 만든 객체는 참조가 끊어져 쓰레기 객체가 된다.
	한번 배열을 만들 때 사이즈를 넉넉히 만들자...
	
	"다른 사이즈를 가진 배열의 내용을 Copy해 올 수는 있다."(다른 배열을 카피해 올 수 있다.)
	System.arraycopy()
	
	
	
	
	지금은 기본형 타입의 배열을 다루고 있는데
	클래스 타입의 배열을 다룰 때가 가장 어려워
*/
public class BasicArrayCopyTest4 {
	public static void main(String[] args) {
		int[] target= {1,2,3,4,5,6};
		for(int i=0; i<target.length; i++) System.out.println(target[i]+" ");
		//향상된 for문, for in "뭐가 어디서 돌아가나?" 생각하고 하면돼
		for(int i : target) //target 안에 있는 값이 한번씩 다 할당될 때까지 동작, 근데 알고리즘 구현할 때는 쓰지말고, 프로그램 할 때는 써!
			System.out.println(i+" ");
			
		//회원수가 늘었다.. 그래서 배열의 사이즈를 늘려야 한다... 칸을 늘려야 한다. 10칸으로
		target= new int[10]; //칸을 늘렸다.
		target[6] =11;
		target[7] =22;
		target[8] =33;
		target[9] =44;
		System.out.println("==============");
		for(int i : target) System.out.println(i+ " ");
	}

}
