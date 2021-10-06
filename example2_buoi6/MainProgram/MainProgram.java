package example2_buoi6.MainProgram;

import java.util.List;
import java.util.Scanner;

import example2_buoi6.entity.Khoahoc;
import example2_buoi6.entity.Ngoaivan;
import example2_buoi6.entity.Sach;
import example2_buoi6.entity.Vanhoc;
import example2_buoi6.singleton.Cart;
import example2_buoi6.singleton.Inventory;

public class MainProgram {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		Inventory.addToInventory(new Vanhoc("A",20000,10))	;	
		Inventory.addToInventory(new Vanhoc("B",21000,50))	;	
		Inventory.addToInventory(new Khoahoc("C",22000,15))	;	
		Inventory.addToInventory(new Khoahoc("D",23000,10))	;	
		Inventory.addToInventory(new Ngoaivan("E",24000,15));	
		Inventory.addToInventory(new Ngoaivan("F",25000,20));
		
		List<Sach> a = Inventory.getInstance();
		System.out.println("ID | Tac gia | So luong | Gia |");
		System.out.println("-------------------------------");
		for(Sach i : a) {
			System.out.println(i.getId()+ "  |    " + i.getTacgia() + "    |     "+i.getSl()+ "   |"+i.getGia()+ "|");
			System.out.println("-------------------------------");
		}
	//	System.out.println("-------------------------------");
		
		System.out.println("Moi ban chon : (1>Khach hang || 2>Nguoi ban hang)");
		int x = input.nextInt();
		
		switch (x){
			case 1:{
				System.out.println("Them sach vao gio hang " );
				int sum =0;
				
					
				System.out.println("Ban muon them may lan :  " );
				int q = input.nextInt();
					for(int p =0 ;p<q;p++) {
							System.out.println("Lan  "+p+ ": " );
							System.out.println("Moi chon id :  " );
							int t = input.nextInt();
							System.out.println("Moi chon so luong them vao : " );
							int w = input.nextInt();
							sum += w* Inventory.getSach(t).getGia();
							Cart.addToCart(t, w);
							
						}
						
				
				
				System.out.println("So tien phai thanh toan :  "+ sum );
				
					 
				System.out.println("Ban co muon kiem tra kho hang khong? (1>Co || 2>Khong)");
				int z = input.nextInt();
				if(z==1) {
					System.out.println("ID | Tac gia | So luong | Gia |");
					System.out.println("-------------------------------");
					for(Sach i : a) {
						System.out.println(i.getId()+ "  |    " + i.getTacgia() + "    |     "+i.getSl()+ "   |"+i.getGia()+ "|");
						System.out.println("-------------------------------");
					}
				}
				
				break;
			}
			case 2:	{
				
				
				System.out.println("Them vao kho hang ");
				
					System.out.println("Ban muon them vao may lan?   ");
					int s = input.nextInt();
					for(int j =0 ; j<s;j++) {
						System.out.println("Lan thu "+j+1+": ");
						System.out.println("Moi chon id :  " );
						int t = input.nextInt();
						System.out.println("Moi chon so luong them vao : " );
						int w = input.nextInt();
						Inventory.addSoLuong(t, w);
					}
					
				
				System.out.println("Ban co muon kiem tra kho hang khong? (1>Co || 2>Khong)");
				 int z = input.nextInt();
				if(z==1) {
					System.out.println("ID | Tac gia | So luong | Gia |");
					System.out.println("-------------------------------");
					for(Sach i : a) {
						System.out.println(i.getId()+ "  |    " + i.getTacgia() + "    |     "+i.getSl()+ "   |"+i.getGia()+ "|");
						System.out.println("-------------------------------");
					}
				}
				break;
			}
	
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
