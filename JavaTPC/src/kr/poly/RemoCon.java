package kr.poly;
public interface RemoCon { // ��ü���� X; RemoCOn r = new RemoCon(); X
	// ����� ��밡��
	public static final int MAXCH = 100; // RemoCon.MAXCH
	public final static int MINCH = 1; // RemoCon.MIN
	// �߻�޼���
	public void chUp(); // abstract �����Ǿ� ����.
	public void chDown();
	public void internet();
}
