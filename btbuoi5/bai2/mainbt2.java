package btbuoi5;

import java.util.ArrayList;

public class mainbt2 {

	public static void main(String[] args) {
		ArrayList<giaovien> lst_gv = new ArrayList<giaovien>();
		lst_gv.add(new giaovien("Nhat",20,1));
		lst_gv.add(new giaovien("Tuan",15,2));
		lst_gv.add(new giaovien("Nam",20,3));
		
		ArrayList<NVBV> lst_nvbv = new ArrayList<NVBV>();
		lst_nvbv.add(new NVBV("A",20,4));
		lst_nvbv.add(new NVBV("B",20,5));
		lst_nvbv.add(new NVBV("C",20,6));
		
		ArrayList<NVVS> lst_nvvs = new ArrayList<NVVS>();
		lst_nvvs.add(new NVVS("D",20,7));
		lst_nvvs.add(new NVVS("E",20,8));
		lst_nvvs.add(new NVVS("F",20,9));
		
		ArrayList<hocsinh> lst_hocsinh = new ArrayList<hocsinh>();
		lst_hocsinh.add(new hocsinh("G",20,10));
		lst_hocsinh.add(new hocsinh("H",20,11));
		lst_hocsinh.add(new hocsinh("I",20,12));
		
		ArrayList<Monhoc> lst_mh = new ArrayList<Monhoc>();
		lst_mh.add(new Monhoc("Toan"));
		lst_mh.add(new Monhoc("Van"));
		lst_mh.add(new Monhoc("Anh"));
		
		ArrayList<truonghoc> lst_truonghoc = new ArrayList<truonghoc>();
		lst_truonghoc.add(new truonghoc(lst_gv.get(0) ,lst_nvbv.get(0), lst_nvvs.get(0) ,lst_hocsinh.get(0)));
		
		
		ArrayList<lophoc> lst_lophoc = new ArrayList<lophoc>();
		lst_lophoc.add(new lophoc(lst_gv.get(1),lst_hocsinh.get(1) ,lst_mh.get(1)));
		
		
		System.out.printf("ten giao vien : %s , ten hoc sinh %s,ten monhoc : %s ",lst_lophoc.get(0).Getgv().Getten()
				, lst_lophoc.get(0).Geths().Getten(),
				lst_lophoc.get(0).Getmh().Gettenmh());
		
		System.out.printf("\nten giao vien : %s , ten hoc sinh %s,ten nhan vien bao ve : %s , ten nhan vien ve sinh",
				lst_truonghoc.get(0).Getgv().Getten() ,
				lst_truonghoc.get(0).Geths().Getten(),lst_truonghoc.get(0).Getnvbv().Getten() ,lst_truonghoc.get(0).Getnvvs().Getten()) ;

	}

}
