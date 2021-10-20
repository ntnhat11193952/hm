package z_buoi8_bai1.view;

import java.util.Scanner;

import z_buoi8_bai1.controller.Utils.ScannerUtils;

public class showMenu {
	static Scanner input = new Scanner(System.in);
	public static void Choice() {
		while(true) {
		System.out.println("1:In thong tin nhan vien");
		System.out.println("2:In thong tin giang vien");
		System.out.println("3:In thong tin sinh vien");
		System.out.println("4:Them thong tin nhan vien");
		System.out.println("5:Them thong tin giang vien");
		System.out.println("6:Them thong tin sinh vien");
		System.out.println("7:Them lich truc vien");
		System.out.println("8:Them lich day giang vien");
		System.out.println("9:Them lich hoc sinh vien");
		System.out.println("10:Dung chuong trinh");
		//inTT.inTTnhanvien();
		
		//int x = input.nextInt();
		int x = ScannerUtils.readInt(input, "So khong hop le", 1, 10);
		//inTT.inTTnhanvien();
		
			if(x==1) {
				inTT.inTTnhanvien();
			}
			else if (x==2) {
				inTT.inTTgiangvien();
			}
			else if (x==3) {
				inTT.inTTsinhvien();
			}
			else if(x==4) {
				nhapTT.nhapTTnhanvien();
				
			}
			else if(x==5) {
				nhapTT.nhapTTgiangvien();
				
			}
			else if(x==6) {
				nhapTT.nhapTTsinhvien();
				
			}
			else if(x==7) {
				nhapTT.nhapLichTrucNhanVien();
				
			}
			else if(x==8) {
				nhapTT.nhapLichDayGiangVien();
				
			}
			else if(x==9) {
				nhapTT.nhapLichHocSinhVien();
				
			}
			else if(x==10) {
				break;
				
			}
		}
			
			
		
	}

}
