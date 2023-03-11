package practice;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("enter number");
		int num= sc.nextInt();
        int rev=0;
        int x=num;
        int rem;
        while(x>0) {
        	rem=x%10;
        	rev=rev*10+rem;
        	x=x/10;
        }
        System.out.println(rev);
        if(rev==num)
        	System.out.println("palindrome");
        else
        	System.out.println("not palindrome");
	}

}
