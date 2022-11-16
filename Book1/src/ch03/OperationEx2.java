package ch03;
/*
 * 날짜 : 2022-11-16
 * 이름 : 강중현
 * 내용 : 증가감소 연산자를 사용하여 값 연산하기
 * 
 * val = ++num; - 먼저 num 값이 1 증가한 후 val 변수에 대입
 * val = num++; - val 변수에 기존 num값을 먼저 대입한 후 num 값 1 증가
 * 
 * val = --num; - 먼저 num 값이 1 감소한 후 val 변수에 대입
 * val = num--; - val 변수에 기존 num값을 먼저 대입한 후 num 값 1 감소
 */
public class OperationEx2 {
	public static void main(String[] args) {
		int gameScore = 150;
		
		int lastScore1 = ++gameScore;		// gameScore에 1만큼 더한 값을 lastScore1에 대입
		System.out.println(lastScore1);
		
		int lastScore2 = --gameScore;		// gameScore에서 1만큼 뺀 값을 lastScore2에 대입
		System.out.println(lastScore2);
		
		
		
		
		int num = 10;
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(--num);
	}
}
