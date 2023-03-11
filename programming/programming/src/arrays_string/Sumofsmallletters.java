package arrays_string;

public class Sumofsmallletters {

	public static void main(String[] args) {
		String s = "MorNiNG";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			//if (ch >= 'a' && ch <= 'z') 
			if(Character.isLowerCase(ch))
				sum = sum + i;
			}
		
		System.out.println(sum);
	}
}
