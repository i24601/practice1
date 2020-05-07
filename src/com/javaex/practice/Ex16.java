package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float price, money = 0f;
		System.out.print("상품가격: ");
		price=sc.nextFloat();
		System.out.print("받은돈: ");
		money=sc.nextFloat();
		System.out.println("=====================");
		System.out.printf("받은돈: %.1f \n가격: %.1f \n부가세: %.1f \n잔액: %.1f", money, price, price*0.1, money-price);
		
		sc.close();
	}

}
