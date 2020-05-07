package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		int salary = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("월급을 입력하세요\n월급:");
		salary=sc.nextInt();
		System.out.printf("10년 동안의 월급은 %d원 입니다", salary*12*10);
		System.out.println("\n10년 동안의 월급은 "+salary*12*10+"원 입니다");
		sc.close();
	}

}
