package example.MainProgram;
import java.util.List;
import java.util.Scanner;

import example.entity.Apple; 
import example.entity.Orange; 
import example.entity.Banana;
import example.entity.Fruit;
import example.singelton.Cart;
import example.singelton.Inventory;

public class Mainprogram {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Inventory.addInventory(new Apple( "Tao May   " , 100, 5 , 20)); 
		Inventory.addInventory(new Apple( "Tao tau   " , 50, 1 , 10));
		Inventory.addInventory(new Orange("Cam Sanh  " , 70, 7 , 20));
		Inventory.addInventory(new Banana("Chuoi My  " , 50, 15 , 0.01));
		Inventory.addInventory(new Banana("Chuoi tieu" , 30, 10 , 0.01));
		
		List<Fruit> a = Inventory.getInstance();
				for(Fruit i : a) {
					if(i.getQuantity() <10) {
						System.out.println(i.getId()+ "  | " + i.getName() + "    |     "+i.getQuantity()+ " |"+i.getPrice());
					}else {
						System.out.println(i.getId()+ "  | " + i.getName() + "    |    "+i.getQuantity()+ " |"+i.getPrice());
					}
			
				}
				System.out.println("---------------------------------");	
				System.out.println("1.Quan li kho");
				System.out.println("2.Khach hang");
				System.out.println("---------------------------------");
				System.out.println("Chon : ");
				int x = input.nextInt();
				System.out.println("---------------------------------");
				
				switch(x) {
				case 1: {
		
					System.out.println("Ban co muon them vao kho hang khong? 1.Co|2.Khong " );
					int y =input.nextInt();
					if(y==1) {
						System.out.println("Ban co muon them may lan: " );
						int q = input.nextInt();
						for(int p =0 ;p<q;p++) {
							System.out.println("Lan  "+p + ": " );
							System.out.println("Moi chon id :  " );
							int t = input.nextInt();
							System.out.println("Moi chon so luong them vao : " );
							int w = input.nextInt();
							Inventory.addQuantity(t, w);
							
						}
						System.out.println("Ban co muon xem kho hang khong? 1.Co|2.Khong " );
						int z = input.nextInt();
							if(z==1) {
								for(Fruit i : a) {
									if(i.getQuantity() <10) {
										System.out.println(i.getId()+ "  | " + i.getName() + "    |     "+i.getQuantity()+ " |"+i.getPrice());
									}else {
										System.out.println(i.getId()+ "  | " + i.getName() + "    |    "+i.getQuantity()+ " |"+i.getPrice());
									}
								}
							}	
						
						
						
					}
					break;
					
					
				}
				case 2: {
				
					System.out.println("Ban co muon them gio hang khong? 1.Co|2.Khong " );
					int y = input.nextInt();
					if(y==1) {
						System.out.println("Ban co muon may lan :  " );
						int q = input.nextInt();
						for(int p =0 ;p<q;p++) {
							System.out.println("Lan  "+ p + ": " );
							System.out.println("Moi chon id :  " );
							int t = input.nextInt();
							System.out.println("Moi chon so luong them vao : " );
							int w = input.nextInt();
							Cart.addToCart(t, w);
							
						}
					}
					for(Fruit i : a) {
						if(i.getQuantity() <10) {
							System.out.println(i.getId()+ "  | " + i.getName() + "    |     "+i.getQuantity()+ " |"+i.getPrice());
						}else {
							System.out.println(i.getId()+ "  | " + i.getName() + "    |    "+i.getQuantity()+ " |"+i.getPrice());
						}
				
					}
					break;
				}
				
				
				
				
				
				}
		
				
				
	}
}


