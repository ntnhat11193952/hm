package ex_fruit.MainProgram;

import java.util.List;
import java.util.Scanner;

import ex_fruit.entity.Apple;
import ex_fruit.entity.Banana;
import ex_fruit.entity.Fruit;
import ex_fruit.entity.Orange;
import ex_fruit.singelton.Cart;
import ex_fruit.singelton.Inventory;

public class Mainprogram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Inventory.addInventory(new Apple( "Tao May   " , 100, 5 , 20,"A")); 
		Inventory.addInventory(new Apple( "Tao tau   " , 50, 1 , 10,"A"));
		Inventory.addInventory(new Orange("Cam Sanh  " , 70, 7 , 20,"B"));
		Inventory.addInventory(new Banana("Chuoi My  " , 50, 15 , 0.01,"C"));
		Inventory.addInventory(new Banana("Chuoi tieu" , 30, 10 , 0.01,"D"));
		
		List<Fruit> a = Inventory.getInstance();
				for(Fruit i : a) {
					if(i.getQuantity() <10) {
						System.out.println(i.getId()+ "  | " + i.getName() + "    |     "+i.getQuantity()+ " |"+i.getPrice() +"  | "+i.getVitamin());
					}else {
						System.out.println(i.getId()+ "  | " + i.getName() + "    |    "+i.getQuantity()+ " |"+i.getPrice()+"  | "+i.getVitamin());
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
										System.out.println(i.getId()+ "  | " + i.getName() + "    |     "+i.getQuantity()+ " |"+i.getPrice() +"  | "+i.getVitamin());
									}else {
										System.out.println(i.getId()+ "  | " + i.getName() + "    |    "+i.getQuantity()+ " |"+i.getPrice()+"  | "+i.getVitamin());
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
							System.out.println(i.getId()+ "  | " + i.getName() + "    |     "+i.getQuantity()+ " |"+i.getPrice() +"  | "+i.getVitamin());
						}else {
							System.out.println(i.getId()+ "  | " + i.getName() + "    |    "+i.getQuantity()+ " |"+i.getPrice()+"  | "+i.getVitamin());
						}
				
					}
					break;
				}
				
				
				
				
				
				}
		
				
				
	}

}
