package java_concept;

public class A2 extends A1 {
	public void test() {

		super.test();
		System.out.println("hello");
	}

	public static void main(String[] args) {
		A2 ob = new A2();
		ob.test();
	}
}
