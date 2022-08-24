package sub2;
/*
 * 날짜 : 2022-08-24
 * 이름 : 강중현
 * 내용 : Java 캡슐화 실습하기
 * 
 * 캡슐화(Encapsulation)
 *  - 캡슐화는 객체의 속성(필드)을 외부에서 참조하지 못하도록 객체의 정보를 은닉하는 특성
 *  - 클래스의 속성은 반드시 private 선언을 통해 캡슐화 해야한다.
 *  - 은닉된 정보의 안전한 참조를 위해 Getter, Setter를 정의한다.
 * 
 */
public class EncapsuleTest {
	public static void main(String[] args) {
		
		// 객체 생성
		Car sonata = new Car("소나타", "흰색", 0);
		
		// Setter를 통한 속성 변경
		sonata.setColor("은색");
		
		// 기능
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		// 객체 생성
		Account kb = new Account("국민은행", "101-11-1234", "홍길동", 10000);
		
		// 기능
		kb.deposit(50000);
		kb.withdraw(30000);
		kb.show();
		
		
	}

}
