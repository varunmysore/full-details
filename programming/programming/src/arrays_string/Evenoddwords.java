package arrays_string;

import java.util.Scanner;

public class Evenoddwords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter sentence");
		String s = sc.nextLine();
		int  even=0,odd=0;
		
		String[] arr = s.split(" ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()%2==0)
				even++;
			else
				odd++;
		}
		System.out.println(even);
		System.out.println(odd);
	}

}
