package z_buoi7_bai1.Enum;

public enum Time {
	Tiet1(1,"6h45-9h"),
	Tiet2(2,"9h10-11h"),
	Tiet3(3,"1h-3h30"),
	Tiet4(4,"3h40-5h");
	
	public  final int i;
	public String s;
	
	private Time(int i,String s) {
		this.i = i;
		this.s = s;
	}
	public static Time getTime(int i) {
		for( Time e : values()) {
			if(e.i == i) {
				return e;
			}
		}
		return null;
	}

}
