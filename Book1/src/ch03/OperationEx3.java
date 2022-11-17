package ch03;
/*
 * 날짜 : 2022-11-16
 * 이름 : 강중현
 * 내용 : 단락 회로 평가 실습하기
 */
public class OperationEx3 {
	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value1 = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);	// &&에서 앞 항의 결과 값이 거짓이므로 뒷 문장은 실행되지 않음
		System.out.println(value1);
		System.out.println(num1);
		System.out.println(i);
		
		value1 = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);			// ||에서 핲 항의 결과값이 참이므로 뒷 문장은 실행되지 않음
		System.out.println(value1);
		System.out.println(num1);
		System.out.println(i);
		
		value1 = ((num1 = num1 + 10) > 10) && ((i = i + 2) < 10);			// &&에서 앞 뒤 모두 참 이므로 앞 뒤 모두 성립
		System.out.println(value1);
		System.out.println(num1);
		System.out.println(i);
		
		int num2 = 5;
		int j = 10;
		
		boolean value2 = ((num2 = num2 * 10) > 45) || ((j = j -5) < 10);
		System.out.println(value2);
		System.out.println(num2);
		System.out.println(j);
		
		num1 = num1 + 5;
		num1 = num1 * num2;
		
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		
		System.out.println(ch);
		
	}
}
