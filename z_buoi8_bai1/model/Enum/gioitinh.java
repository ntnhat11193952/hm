package z_buoi8_bai1.model.Enum;

public enum gioitinh {
	Nam(1) , Nu(2) , khac(3) ;
	public final int x;
	private gioitinh(int x) {
		this.x = x;
	}

	public static gioitinh getGioitinh(int x) {
		for(gioitinh e : values()) {
			if(e.x == x) {
				return e;
			}
				
		}
		return null;
		
	}
}
