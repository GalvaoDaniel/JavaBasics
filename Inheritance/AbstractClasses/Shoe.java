public class Shoe extends Product {
	
	private Integer size;

	public Shoe(Integer price, Integer size) {
		super(price);
		this.size = size;
	}

	public Integer getSize() {
		return this.size;
	}

	@Override
	public void showSize() {
		System.out.println("Shoe size: " + getSize());
	}
}
