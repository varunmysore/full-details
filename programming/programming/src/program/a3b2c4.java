package program;

public class a3b2c4 {
	public static void main(String[] args) {
		String s = "a3b2c4d5";
		for (int i = 0; i < s.length(); i++) 
		{
			if (Character.isAlphabetic(s.charAt(i)))
				System.out.print(s.charAt(i));
			else
			{
				int a = Character.getNumericValue(s.charAt(i));
				for (int j = 0; j < a-1; j++)
					System.out.print(s.charAt(i-1));
			}
		}
	}
}
