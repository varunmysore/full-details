package practice;

public class stringDuplicate {
	public static void main(String[] args) {
		String s = "helloo";
		String[] st = s.split("");
		String temp = "";
		for (int i = 0; i < st.length; i++) {
			if (!temp.contains(st[i]))
				temp = temp + st[i];
		}
		System.out.println(temp);
	}
}
