package parcurgerea.colectiilor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String [] args) {
		List<Integer> v = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		Iterator<Integer> it = v.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

		it = v.iterator();
		while (it.hasNext()) {
			if (it.next() % 2 == 0) {
				it.remove();
			}
		}

		System.out.println("\n=========================");
		it = v.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

		System.out.println();
		v = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		for (int i : v) {
			System.out.print(i + " ");
		}
	}
}
