package z_buoi8_bai1.controller.singleton;
import java.util.ArrayList;
import java.util.List;

import z_buoi8_bai1.model.entity.Lichgiangday;
public class banglichgiangday {
static private List<Lichgiangday> blgd = new ArrayList<Lichgiangday>();
	
	private banglichgiangday() {
		
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
