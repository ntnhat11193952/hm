package btbuoi5;

import java.util.Scanner;

public class mainbt1 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		System.out.println("Chọn 1 trong các hình sau: ");
		System.out.println("=========== ");
		System.out.println("1.Hinh tam giac ");
		System.out.println("2.Hinh binh hanh");
		System.out.println("3.Hinh chu nhat");
		System.out.println("4.Hinh vuong");
		
		int e;
		System.out.println("===========");
		System.out.println("Chon e = ");
		e =input.nextInt();
		
		
		if(e==3) {
			rectangle hcn = new rectangle() ;
			hcn.input();
			System.out.println("dien tich hinh chu nhat la : "+hcn.a*hcn.b);
			System.out.println("chu vi hinh chu nhat la : "+2*(hcn.a+hcn.b));
		}
		else if(e==4) {
			square hv = new square() ;
			hv.input();
			System.out.println("dien tich hinh vuong la : "+hv.a*hv.a);
			System.out.println("chu vi hinh vuong la : "+4*hv.a);
			
		}
		else if(e==1) {
			triange tg =new  triange() ;
			tg.input();
			float p = tg.a + tg.b + tg.c;
			p = p/2;
			System.out.println("dien tich tam giac la : "+ Math.sqrt(p*(p-tg.a)*(p-tg.b)*(p-tg.c)));
			System.out.println("chu vi tam giac la : "+tg.a + tg.b + tg.c);
			
		}
		else if(e==2) {
			parallogram hbh = new parallogram() ;
			hbh.input();
			System.out.println("dien tich hinh vuong la : "+hbh.c*hbh.c);
			System.out.println("chu vi hinh vuong la : "+2*(hbh.a+ hbh.b) );
			
		}

	}

}
