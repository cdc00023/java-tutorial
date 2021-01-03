package com.example.hello;

import java.util.Scanner;

/*
 * 도형의 너비를 구하는 프로그램을 작성해봅시다
 * 1. 가로, 세로를 입력받아 사각형의 너비를 구하시오
 * 2. 밑변의 길이와 높이를 입력받아 삼각형의 너비를 구하시오
 * 3. 반지름을 입력받아 원의 너비를 구하시오.
 */
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Width; //가로
		int Depth; //세로
		int areaOfRect; //사각형 너비
		
		int baselength; //밑변의 길이
		
		
	
		int radius; //반지름

		Scanner sc = new Scanner(System.in);
		System.out.println("가로를 입력하시오");
		Width = sc.nextInt();
		
		System.out.println("세로를 입력하시오");
		Depth = sc.nextInt();
		
		areaOfRect = Width * Depth;
		System.out.printf("사각형의 너비는 %d 입니다", areaOfRect);

	}

}
