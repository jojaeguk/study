package kr.poly;

public class Dog extends Animal {
	// �̸�, ����, �� : ��������
	public void eat() {
		System.out.println("��ó�� �Դ�");
	}
	public Dog() {
		super(); // new Animal();
	}
}
