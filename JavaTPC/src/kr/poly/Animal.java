package kr.poly;

public abstract class Animal { // 추상클래스(불완전한객체) -> Animal ani = new Animal(); X
	// Dog, Cat ---> 공통부분 eat();
	public abstract void eat(); // 추상메서드(불완전한 메서드)
	public void move() { // 구현메서드
		System.out.println("무리를 지어서 이동한다.");
	}
}

