package arrays_string;

import java.util.Scanner;

public class REVERSEsentencewords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter sentence");
		String s = sc.nextLine();

		String[] arr = s.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			String a = arr[i];
			String temp = "";
			for (int j = a.length() - 1; j >= 0; j--) {
				temp += a.charAt(j);
			}
			System.out.print(temp+" ");
		}

	}

}
