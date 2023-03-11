package arrays_string;

public class Greatinarray {

	public static void main(String[] args) {
		int []arr= {1,12,3,4,5,10};
		int great=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>great)
				great=arr[i];
		}
         for(int j=0;j<arr.length;j++) {
        	if(arr[j]!=great)
        		System.out.print(great-arr[j]+1 +",");
        	else
        		System.out.print(0+",");
         }
	}

}
