package z_buoi8_bai1.model.entity;

import z_buoi8_bai1.model.Enum.gioitinh;
import z_buoi8_bai1.model.Enum.vitri;

public abstract class Info {
	private int id;
	private String ten;
	private int tuoi;
	//private 
	public  Info(int id,String ten,int tuoi) {
		this.id = id;
		this.ten = ten;
		this.tuoi = tuoi;
		
	}
	abstract public gioitinh getGioitinh();
	abstract public vitri getVitri();
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public int getId() {
		return id;
	}
	
}
