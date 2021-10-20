package z_buoi8_bai1.view;

import java.util.List;
import java.util.Scanner;
import z_buoi8_bai1.controller.Utils.ScannerUtils;
import z_buoi8_bai1.controller.singleton.Banglichhoc;
import z_buoi8_bai1.controller.singleton.Banglichtruc;
import z_buoi8_bai1.controller.singleton.Danhsachgiangvien;
import z_buoi8_bai1.controller.singleton.Danhsachnhanvien;
import z_buoi8_bai1.controller.singleton.Danhsachsinhvien;
import z_buoi8_bai1.controller.singleton.banglichgiangday;
import z_buoi8_bai1.model.Enum.gioitinh;
import z_buoi8_bai1.model.Enum.vitri;
import z_buoi8_bai1.model.entity.Giangvien;
import z_buoi8_bai1.model.entity.Lichgiangday;
import z_buoi8_bai1.model.entity.Lichhoc;
import z_buoi8_bai1.model.entity.Lichtruc;
import z_buoi8_bai1.model.entity.Nhanvien;
import z_buoi8_bai1.model.entity.Sinhvien;

public class inTT {
	static Scanner input = new Scanner(System.in);
//			//Danh sach nhan vien
//			Danhsachnhanvien.addDanhsachnhanven(new Nhanvien(1,"Nguyen Van A",18,1,4));
//			Danhsachnhanvien.addDanhsachnhanven(new Nhanvien(2,"Nguyen Van B",19,3,2));
//			Danhsachnhanvien.addDanhsachnhanven(new Nhanvien(3,"Nguyen Van C",20,2,3));
//			//Danh sach giang vien
//			Danhsachgiangvien.addDanhsachgiangven(new Giangvien(4,"Nguyen Van D",18,1,4));
//			Danhsachgiangvien.addDanhsachgiangven(new Giangvien(5,"Nguyen Van E",19,2,2));
//			Danhsachgiangvien.addDanhsachgiangven(new Giangvien(6,"Nguyen Van F",20,2,3));
//			//Danh sach sinh vien
//			Danhsachsinhvien.addDanhsachsinhven(new Sinhvien(7,"Nguyen Van G",18,2,3));
//			Danhsachsinhvien.addDanhsachsinhven(new Sinhvien(8,"Nguyen Van H",18,2,4));
//			Danhsachsinhvien.addDanhsachsinhven(new Sinhvien(9,"Nguyen Van I",18,1,3));	
//	
//	static List<Giangvien> b = Danhsachgiangvien.getInstance();
//	static List<Nhanvien> a = Danhsachnhanvien.getInstance();
//	static List<Sinhvien> c = Danhsachsinhvien.getInstance();
	
	public static void inTTgiangvien() {

//		//Danh sach giang vien
		Danhsachgiangvien.addDanhsachgiangven(new Giangvien(4,"Nguyen Van D",18,1,4));
		Danhsachgiangvien.addDanhsachgiangven(new Giangvien(5,"Nguyen Van E",19,2,2));
		Danhsachgiangvien.addDanhsachgiangven(new Giangvien(6,"Nguyen Van F",20,2,3));
		List<Giangvien> b = Danhsachgiangvien.getInstance();
		for(Giangvien i : b) {
			System.out.println(i.getId()+"   |   "+i.getTen()+"  |   "+i.getTuoi()+"  |  "+i.getVitri()+"  |  "+i.getGioitinh());
		}
	}
	public static void inTTsinhvien() {
//		//Danh sach sinh vien
		Danhsachsinhvien.addDanhsachsinhven(new Sinhvien(7,"Nguyen Van G",18,2,3));
		Danhsachsinhvien.addDanhsachsinhven(new Sinhvien(8,"Nguyen Van H",18,2,4));
		Danhsachsinhvien.addDanhsachsinhven(new Sinhvien(9,"Nguyen Van I",18,1,3));	
		List<Sinhvien> c = Danhsachsinhvien.getInstance();
		for(Sinhvien i : c) {
			System.out.println(i.getId()+"   |   "+i.getTen()+"  |   "+i.getTuoi()+"  |  "+i.getVitri()+"  |  "+i.getGioitinh());
		}
	}
	public static void inTTnhanvien() {
		//Danh sach nhan vien
Danhsachnhanvien.addDanhsachnhanven(new Nhanvien(1,"Nguyen Van A",18,1,4));
Danhsachnhanvien.addDanhsachnhanven(new Nhanvien(2,"Nguyen Van B",19,3,2));
Danhsachnhanvien.addDanhsachnhanven(new Nhanvien(3,"Nguyen Van C",20,2,3));
		List<Nhanvien> a = Danhsachnhanvien.getInstance();
		for(Nhanvien i : a) {
		System.out.println(i.getId()+"   |   "+i.getTen()+"  |   "+i.getTuoi()+"  |  "+i.getVitri()+"  |  "+i.getGioitinh());
	}
	}

}
