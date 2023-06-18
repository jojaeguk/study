import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC25 {
	public static void main(String[] args) {
		// eat() --재정의(override)----> eat()
		// Animal a = new Animal(); X
		// a.eat();
		// upcasting(부모의역할로 사용 -> 명령을 내리는 쪽)
		Animal ani = new Dog();
		ani.eat(); // eat{?} --> eat{개}(다형성 보장이 o)
		ani.move();
		
		ani = new Cat();
		ani.eat(); // eat{?} --> eat{고}
		ani.move();
		((Cat)ani).night(); // downcasting
	}
}
