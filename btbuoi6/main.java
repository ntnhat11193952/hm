package btbuoi6;

import java.util.ArrayList;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		ArrayList<Cam> lst_cam = new ArrayList<Cam>();
		lst_cam.add(new Cam(40,"A",10,100 ));
		lst_cam.add(new Cam(50,"B",20,200 ));
		lst_cam.add(new Cam(60,"C",30,300 ));
		
		ArrayList<Chuoi> lst_chuoi = new ArrayList<Chuoi>();
		lst_chuoi.add(new Chuoi(40,"D",5,100 ));
		lst_chuoi.add(new Chuoi(50,"E",20,200 ));
		lst_chuoi.add(new Chuoi(60,"F",30,300 ));
		
		
		ArrayList<Tao> lst_tao = new ArrayList<Tao>();
		lst_tao.add(new Tao(40,"G",20,100 ));
		lst_tao.add(new Tao(50,"H",20,200 ));
		lst_tao.add(new Tao(60,"I",30,300 ));
		
		
		System.out.println("===Chon 1 trong 2=== ");
		System.out.println("1.thong tin 3 loai hoa qua ");
		System.out.println("2.tim ra so luong hoa qua co the mua nhieu nhat ");
		int x = Integer.parseInt(input.nextLine());
		if (x==1) {
			System.out.println("\nThong tin cam ");
			for(int i =0;i<3;i++) {
				System.out.print("Ten Cam: " + lst_cam.get(i).getTen() +", Can nang: " +lst_cam.get(i).getCannang()+", So luong: "+lst_cam.get(i).getSoluong() +", gia: "+lst_cam.get(i).getGia() +"\n") ;
			}
			System.out.println("\nThong tin tao ");
			for(int i =0;i<3;i++) {
				System.out.print("Ten Tao: " + lst_tao.get(i).getTen() +", luong duong: " +lst_tao.get(i).getDuong()+", So luong: "+lst_tao.get(i).getSoluong() +", gia: "+lst_tao.get(i).getGia() +"\n") ;
			}
			System.out.println("\nThong tin chuoi ");
				for(int i =0;i<3;i++) {
			System.out.print("Ten Chuoi: " + lst_chuoi.get(i).getTen() +", kho luong dong vi Kali: " +lst_chuoi.get(i).getMK()+", So luong: "+lst_chuoi.get(i).getSoluong() +", gia: "+lst_chuoi.get(i).getGia() +"\n") ;
			}
		
		}
		else {
			System.out.println("Nhap so tien vao ");
			int y = Integer.parseInt(input.nextLine());
			
			//cam
				if(y <= 1000) {
					System.out.println("so luong qua cam mua nhieu nhat la : " +y /lst_cam.get(0).getGia());	
				}
				else if (y>1000  && y <=5000) {
					System.out.println("so luong qua cam mua nhieu nhat la : " + ((y-1000) /lst_cam.get(1).getGia() + 10) );
					
				}
				else if (y > 5000) {
					System.out.println("so luong qua cam mua nhieu nhat la : " + ((y-5000) /lst_cam.get(1).getGia() + 30) );
					
				}
				
			
			//chuoi
				if(y <= 500) {
					System.out.println("so luong qua chuoi mua nhieu nhat la : " +y /lst_chuoi.get(0).getGia());	
				}
				else if (y>500 && y <=45000) {
					System.out.println("so luong qua choi mua nhieu nhat la : " + ((y-500) /lst_chuoi.get(1).getGia() + 5) );
					
				}
				else if (y > 4500) {
					System.out.println("so luong qua chuoi mua nhieu nhat la : " + ((y-4500) /lst_chuoi.get(1).getGia() + 25) );
					
				}
			//tao
				if(y <= 2000) {
					System.out.println("so luong qua tao mua nhieu nhat la : " +y /lst_tao.get(0).getGia());	
				}
				else if (y>2000  && y <=6000) {
					System.out.println("so luong qua tao mua nhieu nhat la : " + ((y-2000) /lst_tao.get(1).getGia() + 20) );
					
				}
				else if (y > 6000) {
					System.out.println("so luong qua tao mua nhieu nhat la : " + ((y-6000) /lst_tao.get(1).getGia() + 40) );
					
				}
			
		}
		
		
		
		

	}

}
