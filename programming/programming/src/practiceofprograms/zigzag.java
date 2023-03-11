package practiceofprograms;

public class zigzag {
	public static void main(String[] args) {
		int[] a = { 4, 5, 6 };
		int[] b = { 1, 2, 3 };
		int[] c = new int[a.length + b.length];
		int j=0;
		for (int i = 0; i <a.length; i++) {
			c[j] = a[i];
			c[j + 1] = b[i];
			j=j+2;
		}
		for (int d : c)
			System.out.println(d);
	}
}
