// import java.lang.*; // 생략
public class TPC34 {
	public static void main(String[] args) {
		// String            012345 ... index
		// java.lang.String str = new java.lang.String("APPLE");
		String str = new String("APPLE");
		String v = str.toLowerCase();
		System.out.println(v);
		System.out.println(str.charAt(3));
		System.out.println(str.length());
		System.out.println(str.indexOf("PL"));
		System.out.println(str.indexOf("PX")); // -1 = 실패 or 끝
		System.out.println(str.replace("P", "X"));
	}

}
