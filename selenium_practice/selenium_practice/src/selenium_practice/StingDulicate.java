package selenium_practice;

public class StingDulicate {

	public static void main(String[] args) {
		String s1 = "HelloshS";

		String s = s1.toLowerCase();
		String temp = "";
		String[] str = s.split("");

		for (int i = 0; i < str.length; i++) {
			if (!temp.contains(str[i]))
				temp = temp + str[i];
		}
		System.out.println(temp);
	}

}
