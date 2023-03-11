package practice;

public class recurssion {
   public static void main(String[] args) {
	int n=5;
	int result=fact(n);
	System.out.println(result);
}

	static int prod=1;
private static int fact(int n) {
	if(n>0) {
	prod=prod*n;
	n--;
	fact(n);}
	return prod;
}
}
