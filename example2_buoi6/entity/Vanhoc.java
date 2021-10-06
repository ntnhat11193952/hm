package example2_buoi6.entity;

public class Vanhoc extends Sach {
	private int taiban;	
	public Vanhoc(String tacgia, int gia, int sl) {
		super(tacgia, gia, sl);
		this.taiban = taiban ;
	}
	public int getTaiban() {
		return taiban;
	}
	public void setTaiban(int taiban) {
		this.taiban = taiban;
	}

}
