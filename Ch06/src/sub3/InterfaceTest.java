package sub3;
/*
 * 날짜 : 2022-09-01
 * 이름 : 강중현
 * 내용 : 인터페이스 실습하기
 * 
 * 인터페이스(Interface)
 *  - 클래스간의 공통의 통일된 표준 규격
 */
public class InterfaceTest {
	public static void main(String[] args) {

		// 인터페이스를 활용한 경합도 완화
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
		
		
	}
	

	
	

}
