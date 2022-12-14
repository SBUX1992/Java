package sub1;
/*
 * 날짜 : 2022-09-20
 * 이름 : 강중현
 * 내용 : 람다식을 활용한 스레드 실습하기
 */
public class LambdaThreadTest {

	
	Runnable r = () -> {
		
		for(int i=1; i<=10; i++) {
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("서브 스레드 실행...");
	};
	
	public static void main(String[] args) {
		Thread t = new Thread();
		t.start();
		
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
				
		}
	}
	

}
