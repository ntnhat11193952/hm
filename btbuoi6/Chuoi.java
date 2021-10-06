package btbuoi6;

public class Chuoi extends Thuoctinh{
	private int MK ;
	public Chuoi(int MK , String ten  ,int soluong,int gia) {
		super(ten ,gia,soluong);
		this.MK = MK;
		
	}
	public int getMK() {
		return MK;
	}
	public void setMK(int MK) {
		this.MK = MK;
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
