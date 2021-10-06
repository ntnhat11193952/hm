package btbuoi6;

public class Thuoctinh {
	protected String ten ;
	protected int gia ;
	protected int soluong;
	
	public Thuoctinh(String ten, int gia ,int soluong) {
		this.ten = ten ;
		this.gia = gia;
		this.soluong = soluong;
	}
	

	public String getTen() {
		return "";
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	public int getGia() {
		return 0 ;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	
	public int getSoluong() {
		return 0;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	

}
