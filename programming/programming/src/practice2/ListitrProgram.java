package practice2;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListitrProgram {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("ramya");
		l.add("ashika");
		l.add("sreleela");
		l.add("rachita");		
		System.out.println(l);
		ListIterator ltr = l.listIterator();
		while(ltr.hasNext())
		{
			String s=(String) ltr.next();
			System.out.println(s);
			if(s.equals("sreleela"))
				ltr.set("divya");
		}
		System.out.println(l);

	}

}
