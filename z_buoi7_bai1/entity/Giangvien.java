package z_buoi7_bai1.entity;

import z_buoi7_bai1.Enum.Gioitinh;
import z_buoi7_bai1.Enum.Type;
import z_buoi7_bai1.Enum.Vitri;



public class   Giangvien extends Info {
	
	private Gioitinh gt;
	private Vitri vt;

	public Giangvien(int id, String ten, int tuoi,int gt,int vt) {
		super(id, ten, tuoi);
		this.gt = Gioitinh.getGioitinh(gt);
		this.vt = Vitri.getVitri(vt);
		
	}

	@Override
	public Gioitinh getGioitinh() {
		// TODO Auto-generated method stub
		return gt;
	}

	
	
	@Override
	public Vitri getVitri() {
		// TODO Auto-generated method stub
		return vt;
	}

	
	
}
