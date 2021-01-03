package com.example.hi;

import java.util.Scanner;

public class P06 {

	public static void main(String[] args) {
		//조건문 if-else문
		int score;
		
		Scanner s = new Scanner(System.in);
		System.out.println("점수를 입력하시오 : ");
		score = s.nextInt();
		if(score >= 90 ) {
			System.out.println("잘 오셨습니다.");
			System.out.println("장학금 신청이 가능합니다.");
		}
		if(score >= 60) {
			System.out.println("합격을 축하합니다.");
		}
		else 
		{
			System.out.println("다음기회에...");
		}
		
		
	}

}
