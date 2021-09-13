package btbuoi3;

public class CPU {
	private String name;
    private Hang hang;
    
    /**
     * @param name
     * @param hang
     */
    public CPU(String name, Hang hang) {
        this.name = name;
        this.hang = hang;
    }

    public String getName() {
        return name;
    }

    public Hang getHang() {
        return hang;
    }

}
//private Tensach tensach;
//private trangthai tentrangthai;
//public trongkho(Tensach tensach,trangthai tentrangthai) {
//	this.tentrangthai = tentrangthai;
//	this.tensach = tensach;
//}
//public trangthai getTt() {
//	return tentrangthai;
//}
//public Tensach getTensach() {
//	return tensach;
//}
