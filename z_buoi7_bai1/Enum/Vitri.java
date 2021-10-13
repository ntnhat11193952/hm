package z_buoi7_bai1.Enum;

public enum Vitri {
	cbv(1,"Cong bao ve"),
	t1(2,"Tang 1"),
	t2(3,"Tang 2"),
	t3(4,"Tang 3");
	
	public final int i;
	public String s;
	private Vitri(int i,String s) {
		this.i = i;
		this.s = s;
	}
	public static Vitri getVitri(int i) {
		for( Vitri e : values()) {
			if(e.i == i) {
				return e;
			}
		}
		return null;
	}
}
