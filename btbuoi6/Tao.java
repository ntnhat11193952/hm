package btbuoi6;

public class Tao extends Thuoctinh {
	private int duong ;
	
	public Tao (int duong ,String ten , int soluong,int gia) {
		super(ten ,gia,soluong);
		this.duong = duong ;
		
	}

	public int getDuong() {
		return duong;
	}

	public void setDuong(int duong) {
		this.duong = duong;
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
