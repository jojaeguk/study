import kr.tpc.MyUtill;

// import java.lang.*; // ����Ʈ ��Ű��(����)
public class TPC18 {
	public static void main(String[] args) {
		// 1. Java���� �������ִ� class�� .. API
		// ���ڿ�(String)
		String str = new String("APPLE");
		System.out.println(str.toLowerCase()); // apple
		
		// 2. ���� ���� ����ϴ� class��... DTO/VO, DAO, Utility .. API
		MyUtill my = new MyUtill();
		int sum = my.hap();
		System.out.println(sum);
		
		// 3. �ٸ�ȸ�翡�� ����� ���� class�� .. API
		// Gson -> json : https://mvnrepository.com/
		// Gson g = new Gson();
		// BookVO vo = new BookVO("�ڹ�", 13000, "����", 800);
		// String json = g.toJson(vo);
		// System.out.println(json);
	}

}
