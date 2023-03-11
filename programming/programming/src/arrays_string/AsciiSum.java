package arrays_string;

public class AsciiSum {

	public static void main(String[] args) {
		String s = "abcd";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			int num = s.charAt(i);
			sum = sum + num;
		}
		System.out.println(sum);
	}
}
