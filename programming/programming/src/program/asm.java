package program;

import java.util.ArrayList;

public class asm {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(1);
		a.add(5);
		a.add(1);
		a.add(3);
		a.add(3);
		System.out.println(a);
		ArrayList<Integer> b = new ArrayList<Integer>();
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) != a.get(i + 1))
				b.add(a.get(i));
			else
				i = i + 1;
		}
		System.out.println(b);
	}
}
