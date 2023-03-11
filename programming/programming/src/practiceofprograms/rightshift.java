package practiceofprograms;

public class rightshift {

	public static void main(String[] args) {
		int temp;
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		for (int n = 0; n < 5; n++) {
			temp = a[a.length - 1];
			for (int i = a.length - 1; i > 0; i--) {

				a[i] = a[i - 1];

			}
			a[0] = temp;

		}
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}
}
