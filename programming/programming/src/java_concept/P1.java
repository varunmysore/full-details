package java_concept;


import java.util.TreeSet;

public class P1 {

	public static void main(String[] args) {
		myComparator c = new myComparator();
		TreeSet tm=new TreeSet(c);
		tm.add(20);
		tm.add(35);
		tm.add(100);
		tm.add(50);
		System.out.println(tm);

	}

}
