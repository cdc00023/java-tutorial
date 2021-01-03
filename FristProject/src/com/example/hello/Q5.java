package com.example.hello;
// if구문 연습하기

// 1. 숫자를 입력받아, 홀수/짝수를 판단하여 주세요

import java.util.Scanner;

// while구문 연습
// 위 프로그램을 무한반복, 0을 입력하면 끝난다.
public class Q5 {

	public static void main(String[] args) {
		int number;

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 입력하시오");
			number = sc.nextInt();

			if (number == 0) {
				System.out.println("종료합니다.");
				break;
			}

			if ((number % 2) == 0)
				System.out.printf("숫자 %d는 짝수입니다.", number);
			else
				System.out.printf("숫자 %d는 홀수입니다.", number);
		} //while


	} //main

} //class
