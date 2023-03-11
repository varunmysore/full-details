package practice;

import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		boolean res=prime(n);
		if(res) 
			System.out.println("prime");
			else
			System.out.println("not prime");
	}

	static int count=0;
    static int a=1;
	public static boolean prime(int n) {
		if (a<=n) {
          if(n%a==0) {
        	  count++;
          }
		a++;
		prime(n);
		}
	if(count==2) 
		return true;
	else
		return false;
	}
}
