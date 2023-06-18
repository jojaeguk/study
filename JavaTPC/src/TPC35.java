public class TPC35 {
	public static void main(String[] args) {
		
		String str1 = new String("APPLE"); // Heap Area
		String str2 = new String("APPLE");
		
		if(str1==str2) {
			System.out.println("YES");
		}else {
			System.out.println("NO"); // V
		}
		
		if(str1.equals(str2)) {
			System.out.println("YES"); // V
		}else {
			System.out.println("NO");
		}
		
		String str3 = "APPLE"; // Literal Pool
		String str4 = "APPLE";
		
		if(str3==str4) {
			System.out.println("YES"); // V
		}else {
			System.out.println("NO");
		}
	}
}
