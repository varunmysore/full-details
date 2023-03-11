package practice;

public class Greatest4 {

	public static void main(String[] args) {
		int a=100,b=20,c=30,d=40;
		int b1,b2,great;
		b1=(a>b?a:b);
		b2=(c>d?c:d);
		great=(b1>b2?b1:b2);
		System.out.println("Great="+great);
	}
}