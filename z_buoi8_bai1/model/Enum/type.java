package z_buoi8_bai1.model.Enum;

public enum type {
	Chinhquy(1), Lienthong(2), Taichuc(3);
	
	public final int i;
	private type(int i) {
		this.i = i;
	}
	
	public static type getType(int i) {
		for( type e : values()) {
			if(e.i == i) {
				return e;
			}
		}
		return null;
	}

}
