package com.example.book10;
//인터페이스 정의하기
/*고객센터 상담원 셋에게 전화를 배분한다.
 * 1.순서대로 배분
 * 2.짧은 대기열을 찾아서 배분
 * 3. 우선순위에 따라(vip고객은 업무능력이 좋은 상담원에게 배분)
 */
public interface Scheduler {
	public void getNextCall();
	public void sendCallToAgent();
}
