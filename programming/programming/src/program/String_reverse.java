package program;

public class String_reverse {

	public static void main(String[] args) {
		String s = "hello";
		String[] arr = s.split("");
		String temp = " ";
		for (int i = arr.length - 1; i >= 0; i--) {
			temp = temp + arr[i];
		}
		temp = temp.trim();
		System.out.println(temp);
	}

}
