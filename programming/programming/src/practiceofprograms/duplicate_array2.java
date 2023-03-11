package practiceofprograms;

public class duplicate_array2 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 1, 2 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j])
					sum = sum + a[i];

			}
		}
		System.out.println(sum);
	}
}
