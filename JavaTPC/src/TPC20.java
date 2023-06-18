import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {

	public static void main(String[] args) {
		// Animal �θ�Ŭ������ ������� ����
		Dog d = new Dog();
		d.eat(); // �θ� eat�� (?�� ���) but �ڽ�Ŭ�������� �������̵��ϸ� �ڽĸ޼��尡 �켱��
		// Animal d = new Dog(); // upcasting(�ڵ�����ȯ)
		
		Cat c = new Cat();
		c.eat();
		c.night();
		
		// Dog.class, Cat.class
		Animal ani = new Dog();
		ani.eat(); // Dog�� eat�� ����
		
		ani = new Cat();
		ani.eat(); // Cat�� eat�� ����
		
		// ani.night();
		((Cat)ani).night(); // �㿡 ������ ���� ����. --> downcasting(���� ����ȯ)
	}

}
