package practice;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter string");
		String s =sc.nextLine();
		boolean b=true;
		s=s.toLowerCase();
		for(char ch='a';ch<='z';ch++){
		  if(!s.contains(String.valueOf(ch))) {
			  b=false;
			  break;
		  }
		}
	  if(b) {
		  System.out.println("panagram");
	  }
		  else {
			  System.out.println("not panagram");
		  }
	  }
	}
