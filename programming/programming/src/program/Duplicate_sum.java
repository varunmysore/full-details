package program;

public class Duplicate_sum {

	public static void main(String[] args) {
		int sum = 0;
		int[] a = { 1, 2, 3, 4, 5, 1, 2, 3, 4 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j])
					sum = sum + a[i];
			}
		}
		System.out.println(sum);
	}

}
