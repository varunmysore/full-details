package program;

public class Sort {

	public static void main(String[] args) {
		int[] a = { 9, 5, 2, 1, 0, 7, 6, 8 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int big = a[i];
					a[i] = a[j];
					a[j] = big;
				}
			}
		}
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}

}
