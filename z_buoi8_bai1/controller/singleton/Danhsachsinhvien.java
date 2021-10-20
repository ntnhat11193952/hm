package z_buoi8_bai1.controller.singleton;


import java.util.ArrayList;
import java.util.List;

import z_buoi8_bai1.model.entity.Sinhvien;

public class Danhsachsinhvien {
 static private List<Sinhvien> dssv = new ArrayList<Sinhvien>();
	
	private Danhsachsinhvien() {
		
	}
	
	static public List<Sinhvien> getInstance(){
		return dssv;
	}
	
	static public boolean addDanhsachsinhven(Sinhvien sv) {
		dssv.add(sv);
		return true;
	}
	
	
	static public boolean isValidDssv(int id) {
		for(Sinhvien i : dssv) {
			if(i.getId()== id) {
				return true;
			}
		}
		return false;
	}
	
	static public Sinhvien getSinhvien(int id) {
		return dssv.get(id);
	}

}
