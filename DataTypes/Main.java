public class Main {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.f);
	}
}

abstract interface A {
	final static float f = 6.0;
}

class B implements A {}
