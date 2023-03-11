package arrays_string;

import java.util.Arrays;

public class Matchingarray {

	public static void main(String[] args) {
		int[] a1 = { 7, 4, 2, 7, 9 };
		int[] b1 = new int[a1.length];
		for (int i = 0; i < a1.length; i++) {
			b1[i] = a1[i];
		}
		Arrays.sort(b1);

		for (int j = 0; j < b1.length; j++) {
			 if (a1[j] != b1[j])
			 System.out.println(j);
			//System.out.println(b1[j]);
			//System.out.println(a1[j]);
		}
	}
}
