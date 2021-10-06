package btbuoi5;

public class hocsinh extends thuoctinh{
	public hocsinh(String ten,int tuoi,int CCCD) {
		this.ten = ten ;
		this.tuoi=tuoi;
		this.CCCD=CCCD;
		}
	public String Getten() {
		return ten;
	}
	public int Gettuoi() {
		return tuoi;
	}
	public int GetCCCD() {
		return CCCD;
	}
	

}
