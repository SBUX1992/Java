package ch02;

public class CharacterEx3 {
	public static void main(String[] args) {
		int a = 65;
		int b = -66;
		
		char a2 = 65;
		// char b2 = -66; 문자형 변수에 음수를 넣으면 오류가 발생하므로 주석 처리.
		
		System.out.println((char)a);
		System.out.println((char)b);	// Java는 문자를 2바이트로 표기하는 UTF-16 인코딩을 사용하기 때문에 ? 로 출력될 수 있음
		System.out.println(a2);
		
	}
}
