package example2_buoi6.entity;

public class Sach {
	private String tacgia;
	private int gia;
	private int sl;
	private int id;
	private String theloai;
	static private int count;
	public Sach(String tacgia, int gia, int sl) {
		this.tacgia = tacgia;
		this.gia = gia;
		this.sl = sl;
		this.theloai = theloai;
		this.id = ++count;
	}
	public String getTacgia() {
		return tacgia;
	}
	public void setTacgia(String tacgia) {
		this.tacgia = tacgia;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public int getSl() {
		return sl;
	}
	public void setSl(int sl) {
		this.sl = sl;
	}
	public int getId() {
		return id;
	}
	public String getTheloai() {
		return theloai;
	}
	public void setTheloai(String theloai) {
		this.theloai = theloai;
	}
	
	

}
