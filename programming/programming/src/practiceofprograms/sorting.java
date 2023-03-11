package practiceofprograms;

public class sorting {
	public static void main(String[] args) {
		int[] a = { 5, 2, 3, 7, 1, 6 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int b : a) {
			System.out.println(b);
		}
	}
}
