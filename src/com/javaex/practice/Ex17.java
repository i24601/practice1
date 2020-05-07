package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		int r = 0;
		final double pi = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요\n반지름:");
		r=sc.nextInt();
		System.out.printf("구의 부피는 %.2f 입니다", (4.0/3.0)*pi*r*r*r);
		sc.close();
	}

}
