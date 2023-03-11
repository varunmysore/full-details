package arrays_string;

public class Sorting {

	public static void main(String[] args) {
		int[] a = { 8, 4, 1, 2,5,9,3 ,8};
		int temp ;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for(int b:a) {
		System.out.println(b);
	}
}}
