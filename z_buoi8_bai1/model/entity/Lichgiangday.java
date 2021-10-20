package z_buoi8_bai1.model.entity;

import z_buoi8_bai1.model.Enum.phonghoc;
import z_buoi8_bai1.model.Enum.time;

public class Lichgiangday {
	private int id;
	private time tg;
	private phonghoc ph;
	
	public Lichgiangday(int id,int tg,int ph) {
		this.id = id;
		this.tg = time.getTime(tg);
		this.ph = phonghoc.getPhonghoc(ph);
	}

	public int getId() {
		return id;
	}

	public time getTg() {
		return tg;
	}

	public phonghoc getPh() {
		return ph;
	}
}
