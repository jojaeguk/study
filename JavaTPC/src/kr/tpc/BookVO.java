package kr.tpc;
	// å(object) -> ����, ����, ���ǻ�, ��������.....
public class BookVO {
	public String title;
	public int price;
	public String company;
	public int page;
	// �⺻������ �޼���(����)
	public BookVO() {
		// �ʱ�ȭ �۾�
		this.title = "�ڹ�";
		this.price = 14000;
		this.company = "������";
		this.page = 780;
	}
	public BookVO(String title, int price, String company, int page) {
		// ������ �޼����� �ߺ�����(overloading)
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
}
