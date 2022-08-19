package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022-08-19
 * 이름 : 강중현
 * 내용 : 1단계 7번 : 사칙연산
 *  - 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
 *  - 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
 *  - 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
 */
public class _07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		
		sc.close();
	}
}
