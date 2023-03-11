package arrays_string;

import java.util.Scanner;

public class Revesecase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter word");
		String word = sc.next();
		String temp = "";
		for (int i = 0; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i)))
				temp += Character.toLowerCase(word.charAt(i));
			else
				temp += Character.toUpperCase(word.charAt(i));
		}
		System.out.print(temp);
	}

}
