package ch03;

/*
 * 날짜 : 2022-08-18
 * 이름 : 강중현
 * 내용 : 산술 연산자를 사용하여 총점과 평균 구하기
 */
public class p74 {
	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;		// 총점 구하기
		System.out.println(totalScore);
		
		double avgScore = totalScore / 2.0;			// 평균 구하기(avg)
		System.out.println(avgScore);
		
		
	}
}
