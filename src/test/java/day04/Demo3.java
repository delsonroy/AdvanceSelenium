package day04;

import java.util.ArrayList;

public class Demo3 {

	public static void main(String[] args) {

		ArrayList<String[]> list = new ArrayList<String[]>();

		String[] a = { "A1", "A2", "A3" };
		list.add(a);
		String[] b = { "B1", "B2", "B3" };
		list.add(b);
		String[] c = { "C1", "C2", "C3" };
		list.add(c);

		for (String[] arr : list) {

			for (String val : arr) {

				System.out.print(val + " ");

			}
			System.out.println();

		}

	}

}
