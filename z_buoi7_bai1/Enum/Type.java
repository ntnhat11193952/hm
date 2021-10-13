package z_buoi7_bai1.Enum;

public enum Type {
	Chinhquy(1), Lienthong(2), Taichuc(3);
	
	public final int i;
	private Type(int i) {
		this.i = i;
	}
	
	public static Type getType(int i) {
		for( Type e : values()) {
			if(e.i == i) {
				return e;
			}
		}
		return null;
	}

}
