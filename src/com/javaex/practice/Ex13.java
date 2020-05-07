package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double won = 0;
		final double dolor = 1230.95;
		
		System.out.print("환전할 원화를 입력하세요: ");
		won=sc.nextDouble();
		System.out.println("\n받으실 달러는"+won/dolor);
		
		sc.close();
		
		
	}

}
