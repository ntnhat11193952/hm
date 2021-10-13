package z_buoi7_bai1.entity;

import z_buoi7_bai1.Enum.Phonghoc;
import z_buoi7_bai1.Enum.Time;

public class Lichgiangday {
	private int id;
	private Time tg;
	private Phonghoc ph;
	
	public Lichgiangday(int id,int tg,int ph) {
		this.id = id;
		this.tg = Time.getTime(tg);
		this.ph = Phonghoc.getPhonghoc(ph);
	}

	public int getId() {
		return id;
	}

	public Time getTg() {
		return tg;
	}

	public Phonghoc getPh() {
		return ph;
	}
}
