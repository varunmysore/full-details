package practice2;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorProgram {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("ashika");
		al.add("sreleela");
		al.add("rachita");
		al.add("ramya");
		System.out.println(al);
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			String obj = (String) itr.next();
			System.out.println(obj);
			if(obj.equals("sreleela"))
				itr.remove();
		}
	System.out.println(al);
	}

}
