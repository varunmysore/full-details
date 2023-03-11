package java_concept;

import java.util.Comparator;

public class myComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		
		if(i1<i2)
			return 100;
		if(i1>i2)
			return -100;
		else
			return 0;
	}
}
