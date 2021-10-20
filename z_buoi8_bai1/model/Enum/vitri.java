package z_buoi8_bai1.model.Enum;

public enum vitri {
	cbv(1,"Cong bao ve"),
	t1(2,"Tang 1"),
	t2(3,"Tang 2"),
	t3(4,"Tang 3");
	
	public final int i;
	public String s;
	private vitri(int i,String s) {
		this.i = i;
		this.s = s;
	}
	public static vitri getVitri(int i) {
		for( vitri e : values()) {
			if(e.i == i) {
				return e;
			}
		}
		return null;
	}

}
