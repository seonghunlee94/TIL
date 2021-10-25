package com.edu.array.algo.test;

public class ArrayMasAndMinTest1 {

	public static void main(String[] args) {
		int[] scores = {79,88,91,44,100,55,95};
		
		//scores 안에 들어있는 점수 중에서 가장 잘한 성적과 가장 못받은 성적을 찾아서 출력
		//가장 잘한 성적 --> Max | 가장 못한 성적--> Min
		
		int min = scores[0];// 음수가 나올 수 있기 때문에 첫번째 값을 기준으로 설정하는게 좋아
		int max = scores[0];// 이 값을 통해서 뒤의 값들과 비교한 뒤에 비교한 내용이 맞는게 나오면 바꾸고, 바뀐 값을 통해 계속 비교해나가!
		
		//for문과 if문을 사용해서 로직을 작성.
		for(int i=0; i<scores.length;i++) {
			if(scores[i]<min) min=scores[i];
			if(scores[i]>max) max=scores[i];
		}
		System.out.println("최대값"+max);
		System.out.println("최소값"+min);
		
	}

}
