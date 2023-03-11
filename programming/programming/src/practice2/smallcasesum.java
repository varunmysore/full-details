package practice2;

public class smallcasesum {
	public static void main(String[] args) {
		String s = "MorNiNG";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLowerCase(s.charAt(i)))
				sum = sum + i;
		}
	    System.out.println(sum);
	}
}
