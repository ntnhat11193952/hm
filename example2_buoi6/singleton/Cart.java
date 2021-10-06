package example2_buoi6.singleton;

import java.util.HashMap;
import java.util.Map;


import example2_buoi6.singleton.Inventory;
import example2_buoi6.entity.Sach;

public class Cart {
	 private static Map<Integer,Integer> cart = new HashMap<Integer,Integer>();
	 
	 private Cart() {
		 
		 
	 }
	 
	 static public Map<Integer,Integer> getInstance(){
		 return cart;
	 }
	 
	 static public boolean addToCart(int id, int sl) {
			if(Inventory.isValid(id) == false) {
				return false;
			}
			
		
			Sach temp = Inventory.getSach(id);
			if(temp.getSl() < sl) {
				return false;
			}else {
				int oldSl = temp.getSl();
				temp.setSl(oldSl - sl);
			}
			
			if(cart.containsKey(id)) {
				int oldSl = cart.get(id);
				cart.put(id, oldSl + sl);
			
			}else {
				cart.put(id, sl);
			}
			return true;
	 }
	 
}
