package com.example.hi;

import java.util.Scanner;

public class P05 {

	public static void main(String[] args) {
		//연산자2 (Operator)
		//증감연산자 ++/--
		
		int banana = 1, apple = 3;
		
		System.out.println("전위증감연산자 = " + banana * apple++);
		//1*3=3 로 바로 계산된다
		//(apple++의 ++는 apple = 3->4가 된 상태임)
		
		System.out.println("후위증감연산자 = " + banana * ++apple);
		//1*(4+1)=5
		
		System.out.println("후위증감연산자 = " + banana * ++apple);
		//1*(5+1)=6
		
		System.out.println("전위증감연산자 = " + banana * apple++);
		//1*6=6
		//apple = 6->7
		
		System.out.println("apple = " + apple);
		
		
		//비트 연산자
		/* 1. | : 0001|0010 == 0101
		 * 2. & : 0011&0010 == 0010 
		 * 3. || : true||false == true
		 * 4. && : true&&false == false
		 */
		
		//제어문 if
		int score = 100;
		if(score >= 60); //if 조건문
		{
			System.out.println("합격을 축하합니다.");
		}
		System.out.println("당신의 점수는 " + score + " 입니다.");
		
	}

}
