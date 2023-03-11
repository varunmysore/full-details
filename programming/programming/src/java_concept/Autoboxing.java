package java_concept;

public class Autoboxing {
	public static void main(String[] args) {
	int num=100;
	Integer obj=num;
	System.out.println(num);
	System.out.println(obj);
	
	test(200);
	}
	public static void test(Object obj) {
		System.out.println(obj);
	}
}
