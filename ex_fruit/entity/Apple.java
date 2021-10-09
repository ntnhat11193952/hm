package ex_fruit.entity;

public class Apple extends Fruit  {
	private int sugar;
	private String vitamin;

	public Apple(String name, double price, int quantity, int sugar, String vitamin) {
		super(name, price, quantity);
		this.sugar = sugar;
		this.vitamin = vitamin;
	}

	public String getVitamin() {
		return vitamin;
	}

	public void setVitamin(String vitamin) {
		this.vitamin = vitamin;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

}
