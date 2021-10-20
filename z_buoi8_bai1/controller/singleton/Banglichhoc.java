package z_buoi8_bai1.controller.singleton;
import java.util.ArrayList;
import java.util.List;

import z_buoi8_bai1.model.entity.Lichhoc;
public class Banglichhoc {
	static private List<Lichhoc> blh = new ArrayList<Lichhoc>();

	private Banglichhoc() {
		
	}

	static public List<Lichhoc> getInstance(){
		return blh;
	}

	static public boolean addBanglichhoc(Lichhoc lh) {
		blh.add(lh);
		return true;
	}


	static public boolean isValidBlh(int id) {
		for(Lichhoc i : blh) {
			if(i.getId()== id) {
				return true;
			}
		}
		return false;
	}

	static public Lichhoc getLichhoc(int id) {
		return blh.get(id);
	}
}
