package com.example.hello;

import java.util.Scanner;

/*
 * 사용자로부터 두 개의 변수를 입력받아 사칙 연산의 결과를 출력하는
 * 자바 프로그램을 작성하시오
 */
public class Q1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("숫자 1: ");
        num1 = sc.nextInt();
        System.out.println("숫자 2: ");
        num2 = sc.nextInt();
        
        System.out.printf("%d + %d=%4d\n", num1, num2, num1+num2);
        System.out.printf("%d - %d=%4d\n", num1, num2, num1-num2);
        System.out.printf("%d * %d=%4d\n", num1, num2, num1*num2);
        System.out.printf("%d / %d=%4d\n", num1, num2, num1/num2);
        
        
        }

}
