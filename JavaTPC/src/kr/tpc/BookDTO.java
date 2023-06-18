package kr.tpc;
public class BookDTO {
	public String title;
	public int price;
	public String company;
	public int page;
	// default 생성자 메서드(생략)
	public BookDTO() {
		super();
		// 객체를 생성하는 작업을 한다.(기계어코드)
	}
	public BookDTO(String title, int price, String company, int page) {
		super();
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
	
	
}
