package arrays_string;

public class Duplicate {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7,5,6};
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					sum = sum + a[i];
				}

			}
		}
		System.out.println(sum);
	}

}
