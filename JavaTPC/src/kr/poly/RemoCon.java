package kr.poly;
public interface RemoCon { // 객체생성 X; RemoCOn r = new RemoCon(); X
	// 상수를 사용가능
	public static final int MAXCH = 100; // RemoCon.MAXCH
	public final static int MINCH = 1; // RemoCon.MIN
	// 추상메서드
	public void chUp(); // abstract 생략되어 있음.
	public void chDown();
	public void internet();
}
