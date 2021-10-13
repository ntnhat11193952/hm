package z_buoi7_bai1.singelton;

import java.util.ArrayList;
import java.util.List;

import z_buoi7_bai1.entity.Nhanvien;


public class Danhsachnhanvien {
	static private List<Nhanvien> dsnv = new ArrayList<Nhanvien>();
	
	private Danhsachnhanvien() {
		
	}
	
	static public List<Nhanvien> getInstance(){
		return dsnv;
	}
	
	static public boolean addDanhsachnhanven(Nhanvien nv) {
		dsnv.add(nv);
		return true;
	}
	
	
	static public boolean isValidDsnv(int id) {
		for(Nhanvien i : dsnv) {
			if(i.getId()== id) {
				return true;
			}
		}
		return false;
	}
	
	static public Nhanvien getNhanvien(int id) {
		return dsnv.get(id);
	}
}
