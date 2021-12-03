package liste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String [] args) {
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);

		System.out.println(l);
		l.set(1, 55);
		l.remove(0);
		System.out.println(l);

		l.add(1000);
		l.add(10);
		l.add(500);
		Collections.sort(l);
		System.out.println(l);

		System.out.println("Pozitia lui 55 este: " + Collections.binarySearch(l, 55));
	}
}
