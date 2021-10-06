package example2_buoi6.entity;

public class Khoahoc extends Sach {
	private int xuatban;

	public Khoahoc(String tacgia, int gia, int sl) {
		super(tacgia, gia, sl);
		this.xuatban = xuatban;
	}

	public int getXuatban() {
		return xuatban;
	}

	public void setXuatban(int xuatban) {
		this.xuatban = xuatban;
	}
	

}
