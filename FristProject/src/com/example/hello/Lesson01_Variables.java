package com.example.hello;
// 2020-12-23
/*  -주석 여러번(/*)
 *  -변수 : 프로그램에서 사용할 데이터를 저장하는 
 *  기억장소(공간)에 부여하는 이름(Variables)
 *  예)number = 10;
 *  -상수 : 메모리 공간, 변수에 저장되는 데이터 값, 
 *  특히 숫자 데이터(Constants)
 *  예)PI = 3.141592
 *   */
public class Lesson01_Variables {

	public static void main(String[] args) {
		// 변수의 선언
		// 타입 변수명[= 초기값];
		// 타입 : 숫자형-정수/실수,
		// 문자형-문자(A)/문자열(APPLE)
		int number1 = 123; // 정수형 변수 number1를 선언하고 123으로 초기화
		int number2;
		number2 = 345;
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.printf("varible number1 = %d\n", number1);
		System.out.printf("varible number1 = %x\n", number1);
		System.out.printf("varible number1 = %o\n", number1);
	

	} // end of main

} // end of class
