package com.edu.array.test;
/*
	배열이 가지고 있는 중요한 성질..
	
	
	"다른 사이즈를 가진 배열의 내용을 Copy해 올 수는 있다."(다른 배열을 카피해 올 수 있다.)
	System.arraycopy()
	
*/
public class BasicArrayCopyTest5 {
	public static void main(String[] args) {
	
		int[] target= {1,2,3,4,5,6};//6
		int[] source= {10,9,8,7,6,5,4,3,2,1};//10
		
		System.out.println();
		System.arraycopy(source, 2, target, 0, target.length);//copy 진행
		System.out.println(target);
		for(int i : target) System.out.print(i+ " ");
		//target 데이터 결과가 ...8,7,6,5,4,3
		//System.arraycopy(); -- static한 성질이어서 객체 생성을 안하고 바로 쓸 수 있어
		//for 이용해서 target안의 데이터를 출력받아서 확인해보세요

	
	}

}
