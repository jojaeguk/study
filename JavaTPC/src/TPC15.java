import kr.tpc.MemberVO;

public class TPC15 {
	public static void main(String[] args) {
		MemberVO m1 = new MemberVO("홍길동", 40, "010-1111-1111", "서울");
		// setter method - 필요 없음
		
		System.out.println(m1.toString());
		System.out.println(m1);
	}
	

}
