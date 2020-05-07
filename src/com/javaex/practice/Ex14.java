package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		float horizontal = 0;
		float vertical = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가로를 입력하세요\n가로:");
		horizontal=sc.nextInt();
		System.out.print("세로를 입력하세요\n세로:");
		vertical=sc.nextInt();
		System.out.printf("사각형의 넓이는 %.1f", horizontal*vertical);
		System.out.printf("\n사각형의 둘레는 %.1f", 2*horizontal+2*vertical);
		sc.close();
	}

}
