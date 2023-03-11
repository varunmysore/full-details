package practice;

public class one_100 {
	static int n1 = 1;

	public static void main(String[] args) {
		int count = 50;
		System.out.print(n1 + " ");
		number(count - 1);

	}

	private static void number(int count) {
		if (count != 0) {
			int n2 = n1 + 1;
			System.out.print(n2+" ");
			n1 = n2;
			number(count - 1);
		}
	}
}
