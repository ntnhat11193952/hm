package example2_buoi6.entity;

public class Ngoaivan extends Sach {
	private int isbn ;

	public Ngoaivan(String tacgia, int gia, int sl) {
		super(tacgia, gia, sl);
		this.isbn = isbn;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

}
