package practice;

import java.util.Arrays;

public class P12 {

	public static void main(String[] args) {
		int[] arr = { 11, 8, 4, 26, 7, 9, 2, 16, 1 };
		int[] brr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			brr[i] = arr[i];
		}
		Arrays.sort(brr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != brr[i]) {
				System.out.println(i);
			}
		}
	}

}