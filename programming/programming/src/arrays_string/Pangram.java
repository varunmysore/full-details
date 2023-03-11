package arrays_string;

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter sentence");
		String s = sc.nextLine();
		boolean flag = true;

		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (!s.contains(String.valueOf(ch))) {
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println("pangram");
		else
			System.out.println("not pangram");
	}

}
