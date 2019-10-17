public class Polymorphism {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		A ab = new B();
		
		a.m();
		b.m();
		ab.m();
	}

}
