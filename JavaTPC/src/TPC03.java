import kr.bit.Book;
import kr.bit.PersonVo;
//class�� ���ο� �ڷḦ �𵨸� �ϴ°�
public class TPC03 {

	public static void main(String[] args) {

		// ���踦 �����϶�, PDT vs UDDT
		// ���� 1���� �����ϱ� ���� ������ �����Ͻÿ�.
		int a;
		a = 10;
		
		// å 1���� �����ϱ� ���� ������ �����Ͻÿ�.

		Book b = new Book();
		b.company = "ȸ��";
		b.title = "�ڹ�";
		b.price = 10000;
		System.out.println(b);
		
		// Book�̶�� �ڷ����� ����ϰ� ����.
		// Book�̶�� �ڷ����� ���� => class�� ����
		
		
		PersonVo p = new PersonVo();
		p.age = 32;
		p.height = 172;
		p.name = "���籹";
		p.weight = 75;
		
		System.out.println(p.age + "\t" + p.height + "\t" + p.name + "\t" + p.weight);
		
	}

}
