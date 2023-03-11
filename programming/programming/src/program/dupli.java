package program;

import java.util.HashSet;

public class dupli {
 public static void main(String[] args) {
	int[]a= {1,2,3,4,1,2};
	
	HashSet<Integer> s = new HashSet<Integer>();
	for(int i=0;i<a.length;i++) {
		s.add(a[i]);
	}
System.out.println(s);
}
}
