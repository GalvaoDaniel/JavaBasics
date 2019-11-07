abstract class Product {
	
	private Integer price;
	
	public Product(Integer price) {
		this.price = price;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public void increasePrice(Integer amountToIncrease) {
		this.price = this.price + amountToIncrease;
	}

	public void decreasePrice(Integer amountToDecrese) {
		this.price = this.price - amountToDecrese;
	}

	abstract public void showSize();
}
