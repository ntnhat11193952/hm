package ex_fruit.singelton;

import java.util.ArrayList;
import java.util.List;
import ex_fruit.entity.Fruit;


public class Inventory {
	static private List<Fruit> inventory = new ArrayList<Fruit>();
	
	private Inventory() {
		
	}
	static public List<Fruit> getInstance(){
//		if(inventory == null) {
//			inventory = new ArrayList<Fruit>();
//			
//		}
		return inventory;
		
	}
	
	static public boolean addInventory(Fruit fruit) {
		
		inventory.add(fruit);
		return true;
	}
	static public boolean isValid(int id ) {
		for (Fruit i : inventory) {
			if(i.getId() == id ) {
				return true;
			}
		}
		return false;
	}
	 static public Fruit getFruit(int id) {
		 return inventory.get(id-1);
	 }
	 
	 static public boolean addQuantity(int id ,int quantity) {
		 if(isValid(id) == false) {
			 return false;
		 }
		 
		 Fruit temp1 = getFruit(id);
		 int oldQuantity = temp1.getQuantity();
		 temp1.setQuantity(oldQuantity + quantity);
		 return true;
	 }
	 
	 
	 
}