package z_buoi8_bai1.model.Enum;

public enum chucvu {
	Baove(1), Vesinh(2), Giangvien(3), Sinhvien(4);

	
	public final int i;
	private chucvu(int i) {
		this.i = i;
	}
	public static chucvu getChucvu(int i) {
		for(chucvu e :values()) {
			if(e.i == i) {
				return e;
			}
		}
		return null;
	}

}
