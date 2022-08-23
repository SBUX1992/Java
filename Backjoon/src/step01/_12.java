package step01;
/*
 * 날짜 : 2022-08-23
 * 이름 : 강중현
 * 내용 : 곱셈
 */
import java.util.Scanner;
public class _12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int a3 = num2 / 100; //백의자리
		int a2 = num2 % 100 / 10; //십의자리
		int a1 = num2 % 100 % 10;//일의자리
		
		System.out.println(num1 * a1);
		System.out.println(num1 * a2);
		System.out.println(num1 * a3);
		System.out.println(num1 * num2);
		
		
	}

}
