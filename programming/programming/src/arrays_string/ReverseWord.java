package arrays_string;

public class ReverseWord {

	public static void main(String[] args) {
		String s = "today is monday";
		String temp = "";
		String[] arr = s.split(" ");
		for (int i = 2; i >= 0; i--) {
			temp = temp + arr[i] + " ";
		}
		temp=temp.trim();
		temp=temp.replace(" ","_");
		System.out.println(temp);
	}

}
