package arrays_string;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter word");
		String word = sc.next();
        String temp="";
        for(int i=word.length()-1;i>=0;i--) {
        	temp=temp+word.charAt(i);
        }
        System.out.println(temp);
        if(temp.equals(word))
        	System.out.println("palindrome");
        else
        	System.out.println("not palindrome");
	}

}
