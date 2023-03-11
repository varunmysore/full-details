package practice;

import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int sum=0;
		int product=1;
		while(num!=0) {
			int rem=num%10;
			sum=sum+rem;
			product=product*rem;
			num=num/10;
		}
		if(sum==product)
			System.out.println("spy number");
		else
			System.out.println("not spy number");
		}

	}
