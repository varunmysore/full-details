package practice;

public class P15 {

	public static void main(String[] args) {

		factorial();
		System.out.println(product);
	}

	static int i = 1;
	static int product = 1;

	public static void factorial() {
		if (i <= 5) {
			product = product * i;
			i++;
			factorial();
		}
	}
}
