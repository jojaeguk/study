package kr.poly;

public abstract class Animal { // �߻�Ŭ����(�ҿ����Ѱ�ü) -> Animal ani = new Animal(); X
	// Dog, Cat ---> ����κ� eat();
	public abstract void eat(); // �߻�޼���(�ҿ����� �޼���)
	public void move() { // �����޼���
		System.out.println("������ ��� �̵��Ѵ�.");
	}
}

