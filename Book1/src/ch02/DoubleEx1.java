package ch02;

public class DoubleEx1 {
	public static void main(String[] args) {
		double dnum = 1;
		
		for(int i = 0; i < 10000; i++) {	// for문은 지정한 문장을 정해준 횟수만큼 반복해서 수행하는 반복문
			dnum = dnum + 0.1;
		}
		System.out.println(dnum);
	}
}
