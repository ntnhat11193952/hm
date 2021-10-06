package btbuoi5;

public class lophoc  {
	giaovien gv ;
	hocsinh hs;
	Monhoc mh ;
	public lophoc(giaovien gv , hocsinh hs , Monhoc mh) {
		this.gv = gv;
		this.mh = mh;
		this.hs = hs;
	}
	public giaovien Getgv() {
		return gv;
	}
	public hocsinh Geths() {
		return hs;
	}
	public Monhoc Getmh() {
		return mh;
	}
	

}
