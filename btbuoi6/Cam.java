package btbuoi6;

import btnhanvien.Nhanvien;

public class Cam extends Thuoctinh {
	private int cannang ;
	
	public Cam (int cannang, String ten ,int soluong ,int gia) {
		super(ten ,gia,soluong);
		this.cannang= cannang ;
		
		
		
	}
	public int getCannang() {
		return cannang;
	}
	public void setCannang(int cannang) {
		this.cannang = cannang;
		
		
	}
	
	public String getTen() {
		return ten;
	}
	
	
	public int getGia() {
		return gia;
	}
	public int getSoluong() {
		return soluong;
	}

}
