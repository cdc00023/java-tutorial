package com.example.hello;
/*
 * 프로그램 작성의 기본이 되는 제어 흐름
 * 1. 순차적 제어 흐름(Sequential flow)
 *    프로그램 명령어가 적혀진 순서대로 차례로 진행하는 것.
 *    (main에서 순서대로 진행)
 * 2. 조건에 따른 제어(Conditional flow)
 *    조건에 따라 수행을 달리 하는 것.
 *    (if구문을 통해 제어)
 *    - if(조건식)실행문장;
 *    - if(조건식) {
 *        실행문장;
 *        실행문장
 *        }else {
 *        
 *        } 
 *     - if(조건식) { }
 *        else if(조건식) { }
 *        else if(조건식) { }
 *        else {}
 *     - switch(상수(식)) {
 *         case 상수 :
 *            문장;
 *            문장;
 *            break
 *         case 상수 :
 *     }
 * 3. 반복제어 (Loop control)
 *    특정 조건에 맞추어 일정 문장들을 반복하여 실행하는 것.
 *    - while(조건식){ } /do { } while(조건식)
 *    - for(제어변수의 초기식;조건식;증감식) { }
 */
public class Lesson05_controlFlow {

	public static void main(String[] args) {
		boolean isHungry = true;
		int time;
		
		System.out.println("아침에 일어났어요...");
		if(isHungry) System.out.println("아침식사를 합니다...");
		
		time = 9;
		while(time < 12) {
		    System.out.printf("현재시간: %d, 오전 일과를 진행합니다...\n", time);
		    time++;
		}
		
		if(isHungry) System.out.println("점심 식사를 합니다...");
		for (time = 13; time < 18; time++) {
		System.out.printf("현재시간: %d시, 오후 일과를 진행합니다...\n", time);
		}
		
		boolean havePromise = true;
		if(havePromise) {
			System.out.println("친구와 만납니다.");
		}
		
		System.out.println("귀가해요...");
		System.out.println("잠자리에 들어요...");

	}

}
