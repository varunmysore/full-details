package practice;

import java.util.Scanner;

public class Vowel_prog {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter character");
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':System.out.println("vowel");
		        break;
		default:System.out.println("consonent");
		}
	}

}
