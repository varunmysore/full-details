package program;

public class StringSentenceReverse {
	public static void main(String[] args) {
		String s = "today is monday";
		String[] arr = s.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) 
		{
			String a = arr[i];
			String temp = " ";
			for (int j = a.length() - 1; j >= 0; j--) 
			{
				temp = temp + a.charAt(j);
			}
			temp = temp.trim();
			System.out.print(temp + " ");
		}
	}
}
