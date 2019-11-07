public class TestProduct {
	public static void main(String[] args) {
		Product shoe = new Shoe(200, 38);
		shoe.showSize();
		System.out.println("Shoe price:" + shoe.getPrice());
		shoe.increasePrice(20);
		System.out.println("Shoe price:" + shoe.getPrice());
		
		System.out.println();
				
		Product shirt = new Shirt(150, 'S');
		shirt.showSize();
		System.out.println("Shirt price:" + shirt.getPrice());
		shirt.increasePrice(10);
		System.out.println("Shirt price:" + shirt.getPrice());
	}
}
