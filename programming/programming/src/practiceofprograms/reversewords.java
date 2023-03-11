package practiceofprograms;

public class reversewords {
	public static void main(String[] args) {
		String s1 = "today is monday";
		String[] s2 = s1.split(" ");
		String temp = "";
		for (int i = 2; i >=0; i--) {
			temp = temp + s2[i]+" ";
		}
		temp=temp.trim();
		temp=temp.replace(" ", "_");
		System.out.println(temp);

	}
}
