package kr.poly;
public class Raddio implements RemoCon {
	@Override
	public void chUp() {	
		System.out.println("Radio 채널이 올라간다.");
	}
	@Override
	public void chDown() {
		System.out.println("Radio 채널이 내려간다.");
	}
	@Override
	public void internet() {		
		System.out.println("Radio는 인터넷이 지원되지 않는다.");
	}
	// Radio의 독단적인 기능이 있다면 추가적인 기능을 구현......
}
