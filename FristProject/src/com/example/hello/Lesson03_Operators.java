package com.example.hello;
/*
 * 연산자 : 데이터값(피연산자oprand)을 조작하기 위한 방법
 * 산술연산자 :  +, -, *, /, %(나머지 구하는 연산자)
 * 관계연산자 : >, <, ==, !=, <=, !=
 * 논리연산자 : &&(AND), !(NOT), ||(or)
 * 비트연산자 : & ,|, ^(XOR), ~(NOT), <<, >>(시프트 연산)
 */
public class Lesson03_Operators {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 5;
		int var2 = 127;
		int var3 = 4;
		int var4 = 0;
		var4 = var3 >> 1;
		
//		System.out.println(var3);
//		System.out.println(var4);
		
		boolean decision; // 관계연산자, if구문에 사용
//		if((5 < 10) && (5 > 2)) System.out.println("결과는 참");
//		else System.out.println("결과는 거짓");
		
		System.out.printf("%f\n", 10.0/3);
		System.out.printf("%f\n", 10.0%3);
		System.out.println(10 % 3);
		
		

	}// end of main 

}// end of class
