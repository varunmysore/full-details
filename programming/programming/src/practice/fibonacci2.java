package practice;

public class fibonacci2 {
	static int n1 = 0, n2 = 1;
	public static void main(String[] args) {
		int count = 20;
		System.out.print(n1 + " " + n2);
		fibo(count - 2);
	}

	public static void fibo(int count) {
		if (count > 0) {
			int n3 = n2 + n1;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
			fibo(count - 1);
		}
	}

	
}
