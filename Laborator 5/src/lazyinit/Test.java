package lazyinit;

import java.util.HashMap;

public class Test implements LazyInterface{
	public static void main(String [] args) {
		Test t = new Test();
		System.out.println(t.a);

		HashMap<Integer, Integer> map = new HashMap<>();
		map.putAll();
	}
}
