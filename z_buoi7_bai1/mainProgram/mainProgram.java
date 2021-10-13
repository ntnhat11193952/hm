package z_buoi7_bai1.mainProgram;

import java.util.List;
import java.util.Scanner;

import z_buoi7_bai1.entity.Giangvien;
import z_buoi7_bai1.entity.Info;
import z_buoi7_bai1.entity.Lichhoc;
import z_buoi7_bai1.entity.Lichtruc;
import z_buoi7_bai1.entity.Nhanvien;
import z_buoi7_bai1.entity.Sinhvien;
import z_buoi7_bai1.singelton.Banglichhoc;
import z_buoi7_bai1.singelton.Banglichtruc;
import z_buoi7_bai1.singelton.Danhsachgiangvien;
import z_buoi7_bai1.singelton.Danhsachnhanvien;
import z_buoi7_bai1.singelton.Danhsachsinhvien;

public class mainProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Danh sach nhan vien
		Danhsachnhanvien.addDanhsachnhanven(new Nhanvien(1,"Nguyen Van A",18,1,4));
		Danhsachnhanvien.addDanhsachnhanven(new Nhanvien(2,"Nguyen Van B",19,3,2));
		Danhsachnhanvien.addDanhsachnhanven(new Nhanvien(3,"Nguyen Van C",20,2,3));
		//Danh sach giang vien
		Danhsachgiangvien.addDanhsachgiangven(new Giangvien(4,"Nguyen Van D",18,1,4));
		Danhsachgiangvien.addDanhsachgiangven(new Giangvien(5,"Nguyen Van E",19,2,2));
		Danhsachgiangvien.addDanhsachgiangven(new Giangvien(6,"Nguyen Van F",20,2,3));
		//Danh sach sinh vien
		Danhsachsinhvien.addDanhsachsinhven(new Sinhvien(7,"Nguyen Van G",18,2,3));
		Danhsachsinhvien.addDanhsachsinhven(new Sinhvien(8,"Nguyen Van H",18,2,4));
		Danhsachsinhvien.addDanhsachsinhven(new Sinhvien(9,"Nguyen Van I",18,1,3));
		
		
//		List<Nhanvien> a = Danhsachnhanvien.getInstance();
//		for(Nhanvien i : a) {
//			System.out.println(i.getId()+"   |   "+i.getTen()+"  |   "+i.getTuoi()+"  |  "+i.getVitri()+"  |  "+i.getGioitinh());
//		}
//		List<Giangvien> b = Danhsachgiangvien.getInstance();
//		for(Giangvien i : b) {
//			System.out.println(i.getId()+"   |   "+i.getTen()+"  |   "+i.getTuoi()+"  |  "+i.getVitri()+"  |  "+i.getGioitinh());
//		}
//		List<Sinhvien> c = Danhsachsinhvien.getInstance();
//		for(Sinhvien i : c) {
//			System.out.println(i.getId()+"   |   "+i.getTen()+"  |   "+i.getTuoi()+"  |  "+i.getVitri()+"  |  "+i.getGioitinh());
//		}
		
		while(true){
			
			System.out.println("1:In thong tin nhan vien");
			System.out.println("2:In thong tin giang vien");
			System.out.println("3:In thong tin sinh vien");
			System.out.println("4:Them in lich truc, lich lam viec vua nhan vien");
			System.out.println("5:Them in lich truc, lich lam viec vua giang vien");
			System.out.println("6:In lich hoc");
			System.out.println("7:Dung chuong trinh");
			
			
			int x;
			x = input.nextInt();
			if(x==1) {
				List<Nhanvien> a = Danhsachnhanvien.getInstance();
				for(Nhanvien i : a) {
					System.out.println(i.getId()+"   |   "+i.getTen()+"  |   "+i.getTuoi()+"  |  "+i.getVitri()+"  |  "+i.getGioitinh());
				}
				
			}
			else if(x==2) {
				List<Giangvien> b = Danhsachgiangvien.getInstance();
				for(Giangvien i : b) {
					System.out.println(i.getId()+"   |   "+i.getTen()+"  |   "+i.getTuoi()+"  |  "+i.getVitri()+"  |  "+i.getGioitinh());
				}
				
			}
			else if(x==3) {
				List<Sinhvien> c = Danhsachsinhvien.getInstance();
				for(Sinhvien i : c) {
					System.out.println(i.getId()+"   |   "+i.getTen()+"  |   "+i.getTuoi()+"  |  "+i.getVitri()+"  |  "+i.getGioitinh());
				}
				
			}
			else if(x==4) {
				System.out.println("Ban muon them lich truc,lich lam viec cho nhan vien khong? <1.Co|2.Khong>");
				int y = input.nextInt();
				if(y==1) {
					System.out.println("Moi nhap id nhan vien");
					int id = input.nextInt();
					System.out.println("Moi nhap thoi gian truc: <1.Tiet1  | 2.Tiet2  |3.Tiet3   |4.Tiet4>");
					int tg = input.nextInt();
					System.out.println("Moi nhap vi tri truc: <1.Cong bao ve  | 2.tang 1  |3.Tang 2  | 4.Tang 3 >");
					int vt = input.nextInt();
					//Them
					Banglichtruc.addBanglichtruc(new Lichtruc(id,tg,vt));
					}
				System.out.println("Ban muon in lich truc,lich lam viec cho nhan vien khong? <1.Co|2.Khong>");
				y = input.nextInt();
				if(y==1) {
					List<Lichtruc > a = Banglichtruc.getInstance();
					for(Lichtruc i : a) {
						System.out.println(i.getId()+"  |   "+i.getTg()+"  |  "+i.getVt());
					}
				}
				
			}
			else if(x==5) {
				System.out.println("Ban muon them lich truc,lich lam viec cho giang vien khong? <1.Co|2.Khong>");
				int y = input.nextInt();
				if(y==1) {
					System.out.println("Moi nhap id giang vien");
					int id = input.nextInt();
					System.out.println("Moi nhap thoi gian day: <1.Tiet1  | 2.Tiet2  |3.Tiet3   |4.Tiet4>");
					int tg = input.nextInt();
					System.out.println("Moi nhap phong hoc : <1.A1  | 2.A2  |3.A3 >");
					int vt = input.nextInt();
					//Them
					Banglichhoc.addBanglichhoc(new Lichhoc(id,tg,vt));
					}
				System.out.println("Ban muon in lich truc,lich lam viec cho giang vien vien khong? <1.Co|2.Khong>");
				y = input.nextInt();
				if(y==1) {
					List<Lichhoc > a = Banglichhoc.getInstance();
					for(Lichhoc i : a) {
						System.out.println(i.getId()+"  |   "+i.getTg()+"  |  "+i.getPh());
					}
				}
				
				
			}
			else if(x==6) {
				System.out.println("Ban muon them hoc cho sinh vien vien khong? <1.Co|2.Khong>");
				int y = input.nextInt();
				if(y==1) {
					System.out.println("Moi nhap id sinh  vien");
					int id = input.nextInt();
					System.out.println("Moi nhap thoi gian hoc: <1.Tiet1  | 2.Tiet2  |3.Tiet3   |4.Tiet4>");
					int tg = input.nextInt();
					System.out.println("Moi nhap phong hoc : <1.A1  | 2.A2  |3.A3 >");
					int vt = input.nextInt();
					//Them
					Banglichhoc.addBanglichhoc(new Lichhoc(id,tg,vt));
					}
				System.out.println("Ban muon in lich hoc cho sinh vien khong? <1.Co|2.Khong>");
				y = input.nextInt();
				if(y==1) {
					List<Lichhoc > a = Banglichhoc.getInstance();
					for(Lichhoc i : a) {
						System.out.println(i.getId()+"  |   "+i.getTg()+"  |  "+i.getPh());
					}
				}				
			}
			else if(x==7) {
				break;
			}
			
		}

		
		
		
		
		
	}

}
