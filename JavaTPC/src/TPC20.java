import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {

	public static void main(String[] args) {
		// Animal 부모클래스를 사용하지 않음
		Dog d = new Dog();
		d.eat(); // 부모가 eat가 (?로 출력) but 자식클래스에서 오버라이딩하면 자식메서드가 우선임
		// Animal d = new Dog(); // upcasting(자동형변환)
		
		Cat c = new Cat();
		c.eat();
		c.night();
		
		// Dog.class, Cat.class
		Animal ani = new Dog();
		ani.eat(); // Dog의 eat이 동작
		
		ani = new Cat();
		ani.eat(); // Cat의 eat이 동작
		
		// ani.night();
		((Cat)ani).night(); // 밤에 눈에서 빛이 난다. --> downcasting(강제 형변환)
	}

}
