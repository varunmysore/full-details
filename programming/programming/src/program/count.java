package program;

public class count {
	public static void main(String[] args) {
		String s1 = "pavan";
			char search = 'a';
			int count = 0;
			for (int i = 0; i < s1.length(); i++) {
				if (search == s1.charAt(i))
					count++;

			}
			System.out.println(search + " is present " + count + " times");
		}
	}
