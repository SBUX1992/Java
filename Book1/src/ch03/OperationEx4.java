package ch03;
/*
 * 날짜 : 2022-11-17
 * 이름 : 강중현
 * 내용 : 조건 연산자를 사용하여 부모님의 나이 비교하기
 */
public class OperationEx4 {
	public static void main(String[] args) {

		int num = 10;
		boolean isEven;
		isEven = (num % 2)==0 ? true : false;	// num에 2를 누나어 나머지(%)가 짝수이면 true, 홀수이면 false
		
		System.out.println(isEven);
		
	}
}
