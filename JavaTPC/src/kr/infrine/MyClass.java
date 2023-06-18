package kr.infrine;
public class MyClass { // 생략하면 default 접근권한(의미적으로 생각)
	public int sum(int a, int b) {
		int hap = 0;
		for(int i=a; i<=b; i++) {
			hap+=i;
		}
		return hap;
	}
}
