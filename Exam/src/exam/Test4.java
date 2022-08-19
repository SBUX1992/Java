package exam;
import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 강중현
 * 내용 : 
 */

public class Test4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		char grade;
		
		System.out.println("입력한 점수는 "+score+"입니다");
		
		if(score >= 90) {
			grade = 'a';
		}else if(score >= 80) {
			grade = 'b';
		}else if(score >= 70 && score <= 80) {
			grade = 'c';
		}else if(score >= 60 && score <= 70) {
			grade = 'd';
		}else{
			grade = 'f';
		}
		
		System.out.printf("등급은 %c입니다", grade);
		
	}
}
