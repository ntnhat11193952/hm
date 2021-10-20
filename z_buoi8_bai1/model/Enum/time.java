package z_buoi8_bai1.model.Enum;

public enum time {
	Tiet1(1,"6h45-9h"),
	Tiet2(2,"9h10-11h"),
	Tiet3(3,"1h-3h30"),
	Tiet4(4,"3h40-5h");
	
	public  final int i;
	public String s;
	
	private time(int i,String s) {
		this.i = i;
		this.s = s;
	}
	public static time getTime(int i) {
		for( time e : values()) {
			if(e.i == i) {
				return e;
			}
		}
		return null;
	}

}
