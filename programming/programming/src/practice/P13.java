package practice;

public class P13 {

	public static void main(String[] args) {
		String s="abcd";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			int a=s.charAt(i);
			sum=sum+a;
		}
		System.out.println(sum);

	}

}
