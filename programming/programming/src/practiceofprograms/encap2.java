package practiceofprograms;

public class encap2 {
	public static void main(String[] args) {
		enca1 ob = new enca1();
		System.out.println(ob.read());
		ob.write(2000);
		System.out.println(ob.read());
	}
}
