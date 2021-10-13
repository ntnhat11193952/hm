package z_buoi7_bai1.Enum;

public enum Phonghoc {
	A1(1),A2(2),A(3);
	
	public final int i;
	private Phonghoc(int i) {
		this.i= i;
	}
	public static Phonghoc getPhonghoc(int i) {
		for( Phonghoc e : values()) {
			if(e.i == i) {
				return e;
			}
		}
		return null;
	}
}
