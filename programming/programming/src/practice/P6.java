package practice;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
		    if((ch>'a'&& ch<='z')) {
		    	sum=sum+i;
		    }
			
		}
		System.out.println(sum);

	}

}
