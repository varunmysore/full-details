package practice;

public class P11 {

	public static void main(String[] args) {
		int[] arr = { 12, 14, 19, 8, 15 };
		int great = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (great < arr[i]) {
				great = arr[i];
			}
		}
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != great)
				System.out.print(great - arr[j] + 1+" ");
			else
				System.out.print(0+" ");
		}
	}
}
