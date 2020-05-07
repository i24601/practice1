package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		float f = 80;
		double Cel = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨: ");
		f = sc.nextFloat();
		sc.close();
		Cel=5.0/9.0*(f-32.0);
		System.out.println(Cel);
		// 5/9의 결과는 int형의 결과값으로 0이 나오므로 
		// 실수형으로 계산값을 얻기위해 .0을 붙임
	}

}
