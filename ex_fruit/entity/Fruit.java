package ex_fruit.entity;

abstract public class Fruit {
	private int id;
	private String name;
	private double price;
	private int quantity;
	static private int count;
	
	abstract public String getVitamin();
	
	public Fruit(String name,double price , int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.id = ++count ;
		
	}
	public int addQuan(int quantity) {
		return this.quantity +=quantity ;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	
}
