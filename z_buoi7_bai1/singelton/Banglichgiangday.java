package z_buoi7_bai1.singelton;

import java.util.ArrayList;
import java.util.List;

import z_buoi7_bai1.entity.Lichgiangday;


public class Banglichgiangday {
static private List<Lichgiangday> blgd = new ArrayList<Lichgiangday>();
	
	private Banglichgiangday() {
		
	}
	
	static public List<Lichgiangday> getInstance(){
		return blgd;
	}
	
	static public boolean addBanglichgiangday(Lichgiangday lgd) {
		blgd.add(lgd);
		return true;
	}
	
	
	static public boolean isValidBlgd(int id) {
		for(Lichgiangday i : blgd) {
			if(i.getId()== id) {
				return true;
			}
		}
		return false;
	}
	
	static public Lichgiangday getLichgiangday(int id) {
		return blgd.get(id);
	}
}
