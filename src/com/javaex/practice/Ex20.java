package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		int w500, w100, w50, w10 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("500원 개수: ");
		w500=sc.nextInt();
		System.out.print("\n100원 개수: ");
		w100=sc.nextInt();
		System.out.print("\n50원 개수: ");
		w50=sc.nextInt();
		System.out.print("\n10원 개수: ");
		w10=sc.nextInt();
		System.out.printf("\n동전의 총합은 %d 원입니다", w500*500+w100*100+w50*50+w10*10);
		
		sc.close();
	}

}
