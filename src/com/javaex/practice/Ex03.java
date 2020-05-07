package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		
		int a = ++x*2;
		int b = y++*2;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
		
//		x, y는 ++ 연산자에 의해 값이 1씩 증가한다
//		따라서 x, y = 2
//		차이는 처리시점인데 a는 전위에 증가연산자가 있으므로 
//		값을 증가시킨후 수식이 실행되고 2*2
//		b는 후위에 증가연산자가 있으므로
//		수식이 실행되고 나서 값이 증가한다 1*2 (a=2)
		
	}

}
