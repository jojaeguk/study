package kr.tpc;
public class JavaOracle implements Dbconnect {

	@Override
	public void getConnection(String url, String user, String password) {
		System.out.println("oracle DB�� ���ӵ˴ϴ�.");
	}
}
