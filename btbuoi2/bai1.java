package btbuoi2;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Chọn 1 trong các hình sau: ");
		System.out.println("=========== ");
		System.out.println("1.Hinh tam giac ");
		System.out.println("2.Hinh binh hanh");
		System.out.println("3.Hinh chu nhat");
		System.out.println("4.Hinh thoi");
		
		int a;
		System.out.println("===========");
		System.out.println("Chon a = ");
		a =input.nextInt();
		
		if(a==1) {
			triangle tri = new triangle();
			System.out.println("Chu vi tam giac : ");
			System.out.println(tri.perimeter());
			System.out.println("Dien tich tam giac : ");
			System.out.println(tri.area());
		}
		else if(a==2) {
			parallelogram par = new  parallelogram();
			System.out.println("Chu vi tam giac : ");
			System.out.println(par.perimeter());
			System.out.println("Dien tich tam giac : ");
			System.out.println(par.area());
		}
		else if(a==3) {
			rectangle rec = new rectangle();
			System.out.println("Chu vi tam giac : ");
			System.out.println(rec.perimeter());
			System.out.println("Dien tich tam giac : ");
			System.out.println(rec.area());
		}
		else if(a==1) {
			rhombus rho = new rhombus();
			System.out.println("Chu vi tam giac : ");
			System.out.println(rho.perimeter());
			System.out.println("Dien tich tam giac : ");
			System.out.println(rho.area());
		}
		
		

	}

}
