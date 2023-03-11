package practice;

import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int sum=0;
		int x=0;
		int[] arr= {1,2,3,4,5,6,7,8,9,1,2,3,4};
		for(int i=0;i<arr.length;i++) {
			if(x<n) {
				sum=sum+arr[i];
				x++;
			}
			else {
				i=i+x-1;
				x=0;
			}
		}
          System.out.println(sum);
	}

}
