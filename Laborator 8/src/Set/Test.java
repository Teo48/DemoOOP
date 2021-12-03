package Set;

import java.util.*;

public class Test {
	public static void main(String [] args) {
//		Set<Integer> set = new HashSet<>();
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		set.add(2);
//
//		for (int i : set) {
//			System.out.print(i + " ");
//		}
//
//		System.out.println();
//
//		TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
//		treeSet.addAll(set);
//		System.out.println(treeSet);
//
//		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
//		linkedHashSet.add(15);
//		linkedHashSet.add(2);
//		linkedHashSet.add(15);
//		linkedHashSet.add(1001);
//		System.out.println(linkedHashSet);

//		Set<Student> studentSet = new HashSet<>();
//		Student s1 = new Student(20, "Gigel");
//		Student s2 = new Student(22, "Ana");
//		Student s3 = new Student(20, "Gigel");
//		studentSet.add(s1);
//		studentSet.add(s2);
//		studentSet.add(s3);
//		System.out.println(studentSet);

		Set<Integer> s = new HashSet<>() {
			@Override
			public boolean add(Integer integer) {
				if (integer % 2 == 0) {
					super.add(integer);
					return true;
				}

				return false;
			}
		};

		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		System.out.println(s);
	}
}
