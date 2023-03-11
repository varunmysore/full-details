package arrays_string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "Races";
		String str2 = "Cares";
		if (str1.length() == str2.length())
		{
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();
			char[] str3 = str1.toCharArray();
			char[] str4 = str2.toCharArray();
			Arrays.sort(str3);
			Arrays.sort(str4);
			System.out.println(str3);
			System.out.println(str4);
			if (Arrays.equals(str3, str4))
				System.out.println("anagram");
			else
				System.out.println("not anagram");
		} else
			System.out.println("not anagram");

	}

}
