package z_buoi7_bai1.Enum;

public enum Gioitinh {
	Nam(1) , Nu(2) , khac(3) ;
	public final int x;
	private Gioitinh(int x) {
		this.x = x;
	}

	public static Gioitinh getGioitinh(int x) {
		for(Gioitinh e : values()) {
			if(e.x == x) {
				return e;
			}
				
		}
		return null;
		
	}


}
