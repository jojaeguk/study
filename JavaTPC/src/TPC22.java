import kr.tpc.Animal;
import kr.tpc.Cat;

public class TPC22 {
	public static void main(String[] args) {
		
		// upcasting
		Animal ani = new Cat();
		ani.eat(); // �����Ͻ��� -> Animal, ������� -> Dog
		
		// downcasting
		// Cat c = (Cat)ani;
		// c.night();
		((Cat)ani).night(); // .�����ڰ� () �����ں��� �켱������ ���Ƽ� ������
		
		// ������
		// ����Ŭ������ ����Ŭ�������� ������ �޼����� ���δٸ��� ���۽�Ű��
		// ��ü���� ����
		
	}

}
