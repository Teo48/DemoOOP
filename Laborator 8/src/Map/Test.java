package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Test {
	public static void main(String [] args) {
//		HashMap<Integer, String> map = new HashMap<>();
//		map.put(1, "Metallica");
//		map.put(2, "Led Zeppelin");
//		map.put(3, "Guns N' Roses");
//		map.put(1, "Rolling Stones");
//
//		for (var i : map.entrySet()) {
//			System.out.println(i.getKey() + ": " + i.getValue());
//		}
//
//		TreeMap<String, Integer> treeMap = new TreeMap<>();
//		treeMap.put("Metallica", 1);
//		treeMap.put("Led Zeppelin", 2);
//		treeMap.put("Guns N' Roses", 3);
//		System.out.println("--------------------");
//
//		for (var i : treeMap.entrySet()) {
//			System.out.println(i.getKey() + ": " + i.getValue());
//		}
//
//		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
//		linkedHashMap.put("Metallica", 1);
//		linkedHashMap.put("Led Zeppelin", 2);
//		linkedHashMap.put("Guns N' Roses", 3);
//
//		System.out.println("--------------------");
//		for (var i : linkedHashMap.entrySet()) {
//			System.out.println(i.getKey() + ": " + i.getValue());
//		}

		int [] v = new int[] {1, 1, 1, 2, 2, 3};
		HashMap<Integer, Integer> map = new HashMap<>();
		int len = v.length;

		for (int i = 0; i < len; ++i) {
			map.put(v[i], map.getOrDefault(v[i], 0) + 1);
		}

		System.out.println(map);
	}
}
