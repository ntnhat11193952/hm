package z_buoi7_bai1.entity;

import z_buoi7_bai1.Enum.Gioitinh;

import z_buoi7_bai1.Enum.Vitri;

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
	abstract public Gioitinh getGioitinh();
	abstract public Vitri getVitri();
	
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
