package z_buoi7_bai1.singelton;

import java.util.ArrayList;
import java.util.List;

import z_buoi7_bai1.entity.Giangvien;
import z_buoi7_bai1.entity.Sinhvien;

public class Danhsachgiangvien {
	
	static private List<Giangvien> dsgv = new ArrayList<Giangvien>();
	
	private Danhsachgiangvien() {
		
	}
	
	static public List<Giangvien> getInstance(){
		return dsgv;
	}
	
	static public boolean addDanhsachgiangven(Giangvien gv) {
		dsgv.add(gv);
		return true;
	}
	
	
	static public boolean isValidDsgv(int id) {
		for(Giangvien i : dsgv) {
			if(i.getId()== id) {
				return true;
			}
		}
		return false;
	}
	
	static public Giangvien getGiangvien(int id) {
		return dsgv.get(id);
	}

}
