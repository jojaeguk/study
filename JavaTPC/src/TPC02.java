
public class TPC02 {

	public static void main(String[] args) {
		// 프로그래밍의 3대 요소 : 변수, 자료형(DataType), 할당(=)
		// 1+1 = 2 (메모리에서 계산)
		
		int a,b,c;
		// a,b,c 3개의 변수를 int형으로 선언
		// 이 기억공간에 a,b,c이 만들어짐
		// 크기는 int는 4byte의 크기를 갖고 만들어짐
		a = 1;
		b = 1;
		// 변수에 데이터를 대입
		c = a+b;
		// 자바는 한 문장이 끝날떄 세미콜론을 찎어줘야 함
		System.out.println(c);
		
		float f; // 실수는 float, double
		// 기본적으로 double타입으로 인식
		f = 34.5f; // 뒤에 f을 붙여야 인식됨
		System.out.println(f);
		
		char d;
		d='A';
		// ""로 표기되는 것은 문자열로 간주되어 String이라는 타입으로 저장해야 함
		System.out.println(d);
		
		boolean g;
		g=true; // false(거짓), true(참)
		
		System.out.println(g);
		
		// Book bk;
		// 기본자료형이 아니라 사용을 할 수 없음
		// Book이란 자료형을 class로 설계를 하면 됨
		// 책은 제목 저자 출판사 가격,,,,,,으로 구조를 만들어 설계를 해서 이름을 book으로 하면 이렇게 한 덩어리를 book타입이 되어짐
		

	}

}
