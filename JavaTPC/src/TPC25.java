import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC25 {
	public static void main(String[] args) {
		// eat() --������(override)----> eat()
		// Animal a = new Animal(); X
		// a.eat();
		// upcasting(�θ��ǿ��ҷ� ��� -> ����� ������ ��)
		Animal ani = new Dog();
		ani.eat(); // eat{?} --> eat{��}(������ ������ o)
		ani.move();
		
		ani = new Cat();
		ani.eat(); // eat{?} --> eat{��}
		ani.move();
		((Cat)ani).night(); // downcasting
	}
}
