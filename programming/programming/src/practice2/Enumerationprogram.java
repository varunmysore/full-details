package practice2;

import java.util.Enumeration;
import java.util.Vector;

public class Enumerationprogram {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("ashika");
		v.add("sreleela");
		v.add("rachita");
		v.add("ramya");
		System.out.println(v);
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			String obj = (String) e.nextElement();
			System.out.println(obj);
		}
		System.out.println(v);
	}

}
