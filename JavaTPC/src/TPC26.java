import kr.poly.Raddio;
import kr.poly.RemoCon;
import kr.poly.TV;

public class TPC26 {
	public static void main(String[] args) {
		// RemoCon r = new RemoCon(); �߻�ũ������ ��ü�� ������ �� ����
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
