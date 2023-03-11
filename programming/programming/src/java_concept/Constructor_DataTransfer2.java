package java_concept;

public class Constructor_DataTransfer2 extends Constructor_DataTransfer {

	public Constructor_DataTransfer2(int b, int c) {
		super(b);
		System.out.println("2 arg");
	}

	public static void main(String[] args) {
		Constructor_DataTransfer2 ob = new Constructor_DataTransfer2(100, 200);
		System.out.println(ob.x);
	}

}