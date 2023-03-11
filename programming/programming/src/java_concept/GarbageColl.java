package java_concept;

public class GarbageColl {
	int a = 10, b = 20;

	protected void finalize() {
		System.out.println("hai hello");
	}
	public static void main(String[] args) {
	GarbageColl ob1 = new GarbageColl();
    ob1=new GarbageColl();
    System.gc();
}
}