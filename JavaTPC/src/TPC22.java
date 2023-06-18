import kr.tpc.Animal;
import kr.tpc.Cat;

public class TPC22 {
	public static void main(String[] args) {
		
		// upcasting
		Animal ani = new Cat();
		ani.eat(); // 컴파일시점 -> Animal, 실행시점 -> Dog
		
		// downcasting
		// Cat c = (Cat)ani;
		// c.night();
		((Cat)ani).night(); // .연산자가 () 연산자보다 우선순위가 높아서 감싸줌
		
		// 다형서
		// 상위클래스가 하위클래스에게 동일한 메세지로 서로다르게 동작시키는
		// 객체지향 원리
		
	}

}
