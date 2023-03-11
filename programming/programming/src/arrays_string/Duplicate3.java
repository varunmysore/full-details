package arrays_string;

import java.util.ArrayList;

public class Duplicate3 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(20);
		arr.add(10);
		arr.add(20);
		arr.add(20);
		arr.add(80);
		arr.add(70);
		arr.add(90);
		arr.add(60);
		arr.add(70);
		System.out.println(arr);
		for (int i = 0; i < arr.size(); i++) {
			for (int j = i + 1; j < arr.size(); j++) {
				if (arr.get(i).equals(arr.get(j))) {
					arr.remove(j);
					j--;
				}
			}
		}
		System.out.println(arr);
	}
}
