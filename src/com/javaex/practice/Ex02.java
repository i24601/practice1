package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		System.out.println(12/5-3);
		// 연산자가 - 연산자보다 우선순위에 있으므로 앞의 12/5부터 계산한다
		// 따라서 12/5-3은 2-3과 같으므로 출력되는 값은 -1
		System.out.println(5+19%3);
		// %연산자의 순서가 +보다 우선순위에 있으므로 19%3 부터 계산한다
		// 따라서 5+19%3은 5+1과 같으므로 출력되는 값은 6
	}

}
