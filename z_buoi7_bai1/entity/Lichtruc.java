package z_buoi7_bai1.entity;

import z_buoi7_bai1.Enum.Phonghoc;
import z_buoi7_bai1.Enum.Time;
import z_buoi7_bai1.Enum.Vitri;

public class Lichtruc {
	private int id;
	private Time tg;
	private Vitri vt;
	
	public Lichtruc(int id,int tg,int vt) {
		this.id = id;
		this.tg = Time.getTime(tg);
		this.vt = Vitri.getVitri(vt);
	}

	public int getId() {
		return id;
	}

	public Time getTg() {
		return tg;
	}

	public Vitri getVt() {
		return vt;
	}

}
