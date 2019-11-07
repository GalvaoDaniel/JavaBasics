public class Shirt extends Product {
	
	private char size;

	public Shirt (Integer price, char size) {
		super(price);
		this.size = size;
	}

	public char getSize() {
		return this.size;
	}

	@Override
	public void showSize() {
		System.out.println("Shirt size: " + getSize());
	}

}
