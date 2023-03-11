package practice;

public class P10 {

	public static void main(String[] args) {
		int f = 5, l = 10000;
		for (int i = f; i <= l; i++) {
			int sum = 0;
			for (int j = 1; j <= i / 2; j++) {
				if (i % j == 0)
					sum = sum + j;
			}
			if (i == sum) {
				System.out.println(i);
			}
		}
	}
}
