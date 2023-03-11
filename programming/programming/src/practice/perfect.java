package practice;

public class perfect {
public static void main(String[] args) {
	int num=8128;
	int sum=0;
	for(int i=1;i<num;i++) {
		if (num%i==0)
			sum=sum+i;
	}
	if(sum==num)
		System.out.println("spy");
	else
		System.out.println("not spy");
}

}
