package program;

public class String_palindrome {

	public static void main(String[] args) {
		String s = "abcdcba";
		String temp=" ";
		for (int i = s.length() - 1; i >= 0; i--) {
			temp = temp + s.charAt(i);
		}
		temp=temp.trim();
		if (s.equals(temp))
			System.out.println("palindrome");
		else
			System.out.println("not");
	}

}
