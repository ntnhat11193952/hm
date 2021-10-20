package z_buoi8_bai1.model.entity;

import z_buoi8_bai1.model.Enum.time;
import z_buoi8_bai1.model.Enum.vitri;

public class Lichtruc {
	private int id;
	private time tg;
	private vitri vt;
	
	public Lichtruc(int id,int tg,int vt) {
		this.id = id;
		this.tg = time.getTime(tg);
		this.vt = vitri.getVitri(vt);
	}

	public int getId() {
		return id;
	}

	public time getTg() {
		return tg;
	}

	public vitri getVt() {
		return vt;
	}

}
