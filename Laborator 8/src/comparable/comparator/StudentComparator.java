package comparable.comparator;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getSurname().equals(o2.getSurname())) {
			return o1.getName().compareTo(o2.getName());
		}

		return o1.getSurname().compareTo(o2.getSurname());
	}
}
