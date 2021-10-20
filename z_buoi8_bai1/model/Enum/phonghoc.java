package z_buoi8_bai1.model.Enum;

public enum phonghoc {
	A1(1),A2(2),A(3);
	
	public final int i;
	private phonghoc(int i) {
		this.i= i;
	}
	public static phonghoc getPhonghoc(int i) {
		for( phonghoc e : values()) {
			if(e.i == i) {
				return e;
			}
		}
		return null;
	}

}
