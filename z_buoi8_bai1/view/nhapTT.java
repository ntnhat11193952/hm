package z_buoi8_bai1.view;

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

public class nhapTT {
	 static Scanner input = new Scanner(System.in);
	 
	 
	 static public void nhapTTgiangvien() {
		 System.out.println("Nhap Id giang vien: ");
		 int id = ScannerUtils.readInt(input,"Loi", 1, 100);
		 System.out.println("Nhap ten giang vien ");
		 String ten = ScannerUtils.readString(input,"Loi");
		 System.out.println("Nhap tuoi giang vien: ");
		 int tuoi = ScannerUtils.readInt(input,"Loi", 1, 100);
		 System.out.println("Nhap gioi tinh giang vien:  <Nam(1) , Nu(2) , khac(3)>");
		 int gt = ScannerUtils.readInt(input,"Loi", 1,3);
		// gioitinh gioitinh1 = gioitinh.getGioitinh(gt);
		 System.out.println("Nhap vi tri giang vien:  <1,Cong bao | 2.Tang 1  | 3.Tang 2 | 4.Tang 3);>");
		 int vt = ScannerUtils.readInt(input,"Loi", 1,4);
		 //vitri vitri1 = vitri.getVitri(vt); 
		 if(Danhsachgiangvien.isValidDsgv(id) == false) {
			 Danhsachgiangvien.addDanhsachgiangven(new Giangvien( id, ten,tuoi,gt,vt));
		 }
	 }
	 static public void nhapTTnhanvien() {
		 System.out.println("Nhap Id nhan  vien: ");
		 int id = ScannerUtils.readInt(input,"Loi", 1, 100);
		 System.out.println("Nhap ten nhan vien ");
		 String ten = ScannerUtils.readString(input,"Loi");
		 System.out.println("Nhap tuoi nhan vien: ");
		 int tuoi = ScannerUtils.readInt(input,"Loi", 1, 100);
		 System.out.println("Nhap gioi tinh nhan vien:  <Nam(1) , Nu(2) , khac(3)>");
		 int gt = ScannerUtils.readInt(input,"Loi", 1,3);
		 gioitinh gioitinh1 = gioitinh.getGioitinh(gt);
		 System.out.println("Nhap vi tri giang vien:  <1,Cong bao | 2.Tang 1  | 3.Tang 2 | 4.Tang 3);>");
		 int vt = ScannerUtils.readInt(input,"Loi", 1,4);
		 //vitri vitri1 = vitri.getVitri(vt); 
		 if(Danhsachnhanvien.isValidDsnv(id) == false) {
			 Danhsachnhanvien.addDanhsachnhanven(new Nhanvien( id, ten,tuoi,gt,vt));
		 }	 
	 }
	 
	 static public void nhapTTsinhvien() {
		 System.out.println("Nhap Id sinh vien: ");
		 int id = ScannerUtils.readInt(input,"Loi", 1, 100);
		 System.out.println("Nhap ten sinh vien ");
		 String ten = ScannerUtils.readString(input,"Loi");
		 System.out.println("Nhap tuoi sinh vien: ");
		 int tuoi = ScannerUtils.readInt(input,"Loi", 1, 100);
		 System.out.println("Nhap gioi tinh sinh vien:  <Nam(1) , Nu(2) , khac(3)>");
		 int gt = ScannerUtils.readInt(input,"Loi", 1,3);
		 gioitinh gioitinh1 = gioitinh.getGioitinh(gt);
		 System.out.println("Nhap vi tri giang vien:  <1,Cong bao | 2.Tang 1  | 3.Tang 2 | 4.Tang 3);>");
		 int vt = ScannerUtils.readInt(input,"Loi", 1,4);
		 //vitri vitri1 = vitri.getVitri(vt); 
		 if(Danhsachsinhvien.isValidDssv(id) == false) {
			 Danhsachsinhvien.addDanhsachsinhven(new Sinhvien( id, ten,tuoi,gt,vt));
		 }	 
		 
	 }
	  static public void nhapLichDayGiangVien() {
		  	System.out.println("Moi nhap id lich truc giang vien");
			int id = ScannerUtils.readInt(input,"Loi", 1, 100);
			System.out.println("Moi nhap thoi gian day: <1.Tiet1  | 2.Tiet2  |3.Tiet3   |4.Tiet4>");
			int tg = ScannerUtils.readInt(input,"Loi", 1, 4);
			System.out.println("Moi nhap phong hoc : <1.A1  | 2.A2  |3.A3 >");
			int ph = ScannerUtils.readInt(input,"Loi", 1, 3);
			//Them
			if(banglichgiangday.isValidBlgd(id) == false) {
				banglichgiangday.addBanglichgiangday(new Lichgiangday(id,tg,ph));
			}
	}
	  static public void nhapLichTrucNhanVien() {
		  	System.out.println("Moi nhap id lich truc nhan vien");
			int id = ScannerUtils.readInt(input,"Loi", 1, 100);
			System.out.println("Moi nhap thoi gian truc: <1.Tiet1  | 2.Tiet2  |3.Tiet3   |4.Tiet4>");
			int tg = ScannerUtils.readInt(input,"Loi", 1, 4);
			System.out.println("Moi nhap vi tri truc : <1,Cong bao | 2.Tang 1  | 3.Tang 2 | 4.Tang 3)");
			int vt = ScannerUtils.readInt(input,"Loi", 1, 4);
			//Them
			if(Banglichtruc.isValidBlt(id) == false) {
				Banglichtruc.addBanglichtruc(new Lichtruc(id,tg,vt));
			}
	}
	  static public void nhapLichHocSinhVien() {
		  	System.out.println("Moi nhap id lich hoc sinh vien");
			int id = ScannerUtils.readInt(input,"Loi", 1, 100);
			System.out.println("Moi nhap thoi gian hoc: <1.Tiet1  | 2.Tiet2  |3.Tiet3   |4.Tiet4>");
			int tg = ScannerUtils.readInt(input,"Loi", 1, 4);
			System.out.println("Moi nhap phong hoc : <1.A1  | 2.A2  |3.A3 >");
			int vt = ScannerUtils.readInt(input,"Loi", 1, 3);
			//Them
			if(Banglichhoc.isValidBlh(id) == false) {
				Banglichhoc.addBanglichhoc(new Lichhoc(id,tg,vt));
			}
	}
	  
	 
	 
}
