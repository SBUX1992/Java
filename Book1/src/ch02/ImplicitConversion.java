package ch02;

public class ImplicitConversion {
	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum;			// byte형 강ㅄ이 int형 변수로 대입됨
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;			// int형 값이 float형 변수로 대입됨
		
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);
		
		
		char ch1 = 'A';
		System.out.println((int)ch1);		// 문자에 해당하는 정수 값 출력
		
		int ch2 = 67;
		System.out.println((char)ch2);
		
		
	}
}
