package btbuoi5;

public class truonghoc {
	giaovien gv ;
	NVBV nvbv;
	NVVS nvvs ;
	hocsinh hs;
	public  truonghoc (giaovien gv ,NVBV nvbv, NVVS nvvs ,hocsinh hs) {
		this.gv = gv;
		this.nvbv = nvbv;
		this.nvvs = nvvs;
		this.hs = hs;
		
	}
	public giaovien Getgv() {
		return gv;
	}
	public NVBV Getnvbv() {
		return nvbv;
	}
	public NVVS Getnvvs() {
		return nvvs;
	}
	public hocsinh Geths() {
		return hs;
	}
	
	

}
