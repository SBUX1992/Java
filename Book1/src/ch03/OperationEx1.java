package ch03;
/*
 * 날짜 : 2022-11-16
 * 이름 : 강중현
 * 내용 : 산술 연산자를 사용하여 총점과 평균 구하기
 */
public class OperationEx1 {
	public static void main(String[] args) {
		int mathScore = 90;
		int engScore  = 70;
		
		int totalScore = mathScore + engScore;	// 총점 구하기
		System.out.println(totalScore);
		
		double avgScore = totalScore / 2.0;		// 평균 구하기
		System.out.println(avgScore);
		
		int korScore = 65;						// 국어 점수 추가하여 총 스코어 및 총 평균 구하기
		int allScore = totalScore + korScore;
		System.out.println(allScore);
		
		double avg = allScore / 3.0;
		System.out.println(avg);
		
		
	}
}
