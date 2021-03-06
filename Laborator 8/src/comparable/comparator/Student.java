package comparable.comparator;

public class Student implements Comparable<Student> {
	private String name;
	private String surname;

	public Student(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public int compareTo(Student o) {
		if (this.surname.equals(o.surname)) {
			return this.name.compareTo(o.name);
		}
		return this.surname.compareTo(o.surname);
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				'}';
	}
}