package com.example.hello;

import java.util.Scanner;

/*
 * 연산자 활용 예제
 */
public class Lesson04_ExOfOperators {

	public static void main(String[] args) {
		// 나머지 연산자(%) 활용 예(홀짝판단)
//		int num1 = 12;
//		if(( num1 % 2) == 0) System.out.println("짝수");
//		else System.out.println("홀수");

//		if( (num1 % 3) == 0 && (num1 % 5) == 0 ) 
//			System.out.println("3과 5의 공배수임");
//		else System.out.println("3과 5의 공배수가 아니다");
		
		Scanner sc = new Scanner(System.in);
	
		int year;
		
		while (true) {
		System.out.println("연도 : ");
		year = sc.nextInt();
		if(year == 0) break ;
		String decision=" ";
		
		if( year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					decision = "윤년";
				}else 
					decision = "평년";
			}else 
				decision = "윤년";
		}else 
			decision = "평년";
		

		System.out.printf("%d년은 %s 입니다\n", year, decision);
		}
		System.out.println("프로그램을 종료합니다.\n");
		
		
//		int num1 = 2200;
//		if(( num1 % 4) == 0) System.out.println("윤년");
//		if( (num1 % 4) == 0 && (num1 % 100) == 0 ) 
//			System.out.println("평년");
//		if( (num1 % 4) == 0 && (num1 % 100) == 0 && (num1 % 400) == 0 ) 
//			System.out.println("윤년");
		
	}

}
