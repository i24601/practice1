package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		int i = 10;
		int n = i++%2;
		
		System.out.println(i); // 예상 11 출력
		System.out.println(n); // 예상 0 출력
//		i의 값이 증가연산자에 의해 증가하지만
//		ln7을 처리한 후에 증가하므로 ln7에서의 i는 10이다
//		그러므로 ln7은 10%2와 같다
//		ln7 이후의 i는 11
		
	}

}
