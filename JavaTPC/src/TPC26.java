import kr.poly.Raddio;
import kr.poly.RemoCon;
import kr.poly.TV;

public class TPC26 {
	public static void main(String[] args) {
		// RemoCon r = new RemoCon(); 추상크래스는 객체를 생성할 수 없음
		RemoCon r = new TV();
		r.chUp();
		r.chDown();
		r.internet();
		
		r = new Raddio();
		r.chUp();
		r.chDown();
		r.internet();
		
	}

}
