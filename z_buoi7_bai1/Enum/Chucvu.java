package z_buoi7_bai1.Enum;

public enum Chucvu {
	Baove(1), Vesinh(2), Giangvien(3), Sinhvien(4);

	
	public final int i;
	private Chucvu(int i) {
		this.i = i;
	}
	public static Chucvu getChucvu(int i) {
		for(Chucvu e :values()) {
			if(e.i == i) {
				return e;
			}
		}
		return null;
	}
	

}
