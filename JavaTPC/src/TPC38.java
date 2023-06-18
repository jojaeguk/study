import java.util.ArrayList;

import kr.tpc.BookDTO;

public class TPC38 {
	public static void main(String[] args) {
		
		ArrayList<BookDTO> list = new ArrayList<BookDTO>(); 
		// Object[] --> BookDTO[], <BookDTO>만 쓰겠고 제한. 제네릭타입
		list.add(new BookDTO("자바", 12000, "이지스", 600));
		list.add(new BookDTO("C언어", 17000, "에이콘", 700));
		list.add(new BookDTO("Python", 15000, "제이팝", 690));
		
		for(int i=0; i<list.size(); i++) {
			// Object o = list.get(i);
			// BookDTO vo = (BookDTO)o;
			BookDTO vo = list.get(i);
			System.out.println(vo.title+"\t"+vo.price+"\t"
					+ vo.company+"\t"+vo.page);
		}
		
	}

}
