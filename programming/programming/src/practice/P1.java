package practice;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 10 digits");
        String s =sc.next();
        boolean b=true;
        int count=0;
        
while(b) {
	if(count<=3) {
		if(s.length()==10) {
			System.out.println("thank you");
			b=false;
		}
		else
		{
			System.out.println("retry");
			count++;
			s=sc.next();	
		}
	}
	else {
		System.out.println("sorry,try after some time");
		b=false;
	}
}
	}
}

