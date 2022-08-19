package ch02;

/*
 * 날짜 : 2022-08-17
 * 이름 : 강중현
 * 내용 : 문자형 연습
 */

public class p53 {
	public static void main(String[] args) {
		char ch1 = 'A';					// A 는 아스키 코드값 65번
		System.out.println(ch1);		// 문자 출력
		System.out.println((int)ch1);	// (int)를 적었기 때문에 문자에 해당하는 정수 값 출력
		
		char ch2 = 66;					// A 가 아스키 코드값 65번이고 다음인 B는 66번
		System.out.println(ch2);		// 문자 출력
		
		int ch3 = 67;					
		System.out.println(ch3);		// (int)로 시작했기 때문에 문자 정수 값 출력
		System.out.println((char)ch3);	// (char)을 적었기 때문에 ch3 67에 해당하는 영문 C가 출력
	}
}
