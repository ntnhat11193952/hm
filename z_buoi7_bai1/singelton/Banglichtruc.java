package z_buoi7_bai1.singelton;

import java.util.ArrayList;
import java.util.List;

import z_buoi7_bai1.entity.Lichhoc;
import z_buoi7_bai1.entity.Lichtruc;

public class Banglichtruc {
	static private List<Lichtruc> blt = new ArrayList<Lichtruc>();

	private Banglichtruc() {
		
	}

	static public List<Lichtruc> getInstance(){
		return blt;
	}

	static public boolean addBanglichtruc(Lichtruc lt) {
		blt.add(lt);
		return true;
	}


	static public boolean isValidBlt(int id) {
		for(Lichtruc i : blt) {
			if(i.getId()== id) {
				return true;
			}
		}
		return false;
	}

	static public Lichtruc getLichtruc(int id) {
		return blt.get(id);
	}

}
