package practice;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter letter");
		char ch= sc.next().charAt(0);
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':{
			      System.out.println("vowel");
		          break;
		}
		default :{
			System.out.println("consonent");
			break;
		}
		}

	}

}
