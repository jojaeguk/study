import kr.bit.Book;
import kr.bit.PersonVo;
//class는 새로운 자료를 모델링 하는것
public class TPC03 {

	public static void main(String[] args) {

		// 관계를 이해하라, PDT vs UDDT
		// 정수 1개를 저장하기 위한 변수를 선언하시오.
		int a;
		a = 10;
		
		// 책 1권을 저장하기 위한 변수를 선언하시오.

		Book b = new Book();
		b.company = "회사";
		b.title = "자바";
		b.price = 10000;
		System.out.println(b);
		
		// Book이라는 자료형을 사용하고 싶음.
		// Book이라는 자료형을 설계 => class을 통한
		
		
		PersonVo p = new PersonVo();
		p.age = 32;
		p.height = 172;
		p.name = "조재국";
		p.weight = 75;
		
		System.out.println(p.age + "\t" + p.height + "\t" + p.name + "\t" + p.weight);
		
	}

}
