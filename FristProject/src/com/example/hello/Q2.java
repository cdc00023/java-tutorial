package com.example.hello;

import java.util.Scanner;

// 사용자로부터 생년을 입력받아 나이를 출력해주는 프로그램을 구성하시오.
// 변수후보 : 생년, 나이
// 나이를 입력하라는 메세지
// 입력을 받기 위한 동작이 필요
// 나이계산
// 출력을 받기 위한 동작이 필요
public class Q2 {

	public static void main(String[] args) {
		// 1.프로그램에서 사용할 변수 선언
		// 2.로직을 차례대로 적어나가면 됨.
		
		// 변수선언
		int birthYear; // 생년
		int age; // 나이
		
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 생년을 입력하시오");
		birthYear = sc.nextInt();
		
		age = 2020 - birthYear;
		
		System.out.printf("생년이 %d인 당신의 나이는 %d이므로 ", birthYear, age);
		
		
		if(age >= 20) System.out.println("출입이 가능합니다.");
		else System.out.println("출입이 불가능합니다.");
					
		if(age >=60) System.out.println("할인이 가능합니다");
		else System.out.println("할인이 불가능합니다");
					

	}

}
