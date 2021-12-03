package comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
	public static void main(String [] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Kirk", "Hammett"));
		students.add(new Student("Jimmy", "Page"));
		students.add(new Student("David", "Silva"));
		students.add(new Student("Bernardo", "Silva"));

//		Collections.sort(students);
//		System.out.println(students);
//		students.sort(new StudentComparator());
//		students.sort(new StudentComparator());
//		System.out.println(students);
//
//		students.sort(new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				if (o1.getSurname().equals(o2.getSurname())) {
//					return o1.getName().compareTo(o2.getName());
//				}
//
//				return o1.getSurname().compareTo(o2.getSurname());
//			}
//		});

		students.sort((o1, o2) -> {
			if (o1.getSurname().equals(o2.getSurname())) {
				return o1.getName().compareTo(o2.getName());
			}

			return o1.getSurname().compareTo(o2.getSurname());
		});
//
		System.out.println(students);
//
//
//		ArrayList<Integer> numbers = new ArrayList<>();
//		numbers.add(5);
//		numbers.add(1);
//		numbers.add(3623);
//		numbers.add(13);
//		numbers.add(7);
//		numbers.sort(new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2 - o1;
//			}
//		});
//
//		System.out.println(numbers);
	}
}
