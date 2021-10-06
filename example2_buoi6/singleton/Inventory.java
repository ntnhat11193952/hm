package example2_buoi6.singleton;

import java.util.ArrayList;
import java.util.List;

import example.entity.Fruit;
import example2_buoi6.singleton.Inventory;
import example2_buoi6.entity.Sach;
public class Inventory {
	
	static public List<Sach> inventory =  new ArrayList<Sach>();
	
	private Inventory() {
		
	}
	
	static public List<Sach> getInstance(){
		return inventory;
	}
	
	static public boolean addToInventory(Sach sach) {
		inventory.add(sach);
		return true;
	}
	
	static public boolean isValid(int id ) {
		for(Sach i : inventory) {
			if(i.getId() == id   ) {
				return true;
			}
		}
		return false;
	}
	
	static public Sach getSach(int id) {
		return inventory.get(id -1);
	}
	
	static public boolean addSoLuong(int id, int sl) {
		if(isValid(id) == false) {
			 return false;
		 }
		 
		 Sach temp = getSach(id);
		 int oldSl = temp.getSl();
		 temp.setSl(oldSl + sl);
		 return true;
	}
	

}
