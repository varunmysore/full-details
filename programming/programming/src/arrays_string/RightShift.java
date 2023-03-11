package arrays_string;

public class RightShift {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int temp = a[4];

		for (int i = 3; i >= 0; i--) {

			a[i + 1] = a[i];
		}
		a[0] = temp;
		for (int b : a)
			System.out.println(b);

	}

}
