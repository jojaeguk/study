import kr.tpc.MemberVO;

public class TPC14 {
	public static void main(String[] args) {
		MemberVO m = new MemberVO();
		
		m.setName("ȫ�浿");
		m.setAge(50);
		m.setTel("010-1111-1111");
		m.setAddr("����");
		
		System.out.print(m.getName() + "\t");
		System.out.print(m.getAge() + "\t");
		System.out.print(m.getTel() + "\t");
		System.out.println(m.getAddr() + "\t");
	}

}
