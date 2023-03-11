package program;

public class Sentence_reverse {
	public static void main(String[] args) {
		String s = "today is monday";
		String[] arr = s.split(" ");
		String temp = " ";
		for (int i = arr.length - 1; i >= 0; i--) {
			temp = temp + arr[i] + " ";
		}
		temp = temp.trim();
		temp = temp.replace(" ", "_");
		System.out.println(temp);
	}

}
