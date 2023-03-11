package arrays_string;

public class Sumofarrayindex {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4 };
		int n = 2;
		int x = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (x < n) {
				sum = sum + arr[i];
				x++;
			} else {
				i = i + n-1;
				x = 0;
			}
		}
		System.out.println(sum);
	}

}
