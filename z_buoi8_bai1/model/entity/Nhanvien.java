package z_buoi8_bai1.model.entity;

import z_buoi8_bai1.model.Enum.gioitinh;
import z_buoi8_bai1.model.Enum.vitri;

public class Nhanvien extends Info {
	private gioitinh gt;
	private vitri vt;

	public Nhanvien(int id, String ten, int tuoi,int gt,int vt) {
		super(id, ten, tuoi);
		this.gt = gioitinh.getGioitinh(gt);
		this.vt = vitri.getVitri(vt);
	}

	@Override
	public gioitinh getGioitinh() {
		// TODO Auto-generated method stub
		return gt;
	}

	@Override
	public vitri getVitri() {
		// TODO Auto-generated method stub
		return vt
				;
	}

}
