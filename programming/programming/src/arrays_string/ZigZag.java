package arrays_string;

public class ZigZag {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6 };
		int[] c = new int[a.length + b.length];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			c[k] = a[i];
			k++;
			c[k] = b[i];
			k++;
		}
		for (int d : c)
			System.out.println(d);
	}

}
