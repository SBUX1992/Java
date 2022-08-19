package ch02;

/*
 * 날짜 : 2022-08-17
 * 이름 : 강중현
 * 내용 : 상수 사용하기
 */

public class p61 {
	public static void main(String[] args) {
		final int MAX_NUM = 100;	// 선언과 동시에 초기화
		final int MIN_NUM;
		
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MAX_NUM - 1000;  // 오류 발생. 상수는 값을 변경할 수  없음
	}
}
