package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			final float mile = 1.609f;
			float distance = 0;
			System.out.print("마일을 입력하세요: ");
			distance=sc.nextFloat();
			System.out.printf("%.2f마일은 %.2f킬로미터입니다.", distance, mile*distance);
			
			sc.close();
	}

}
