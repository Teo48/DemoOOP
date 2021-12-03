package queues;

public class Student {
	int age;
	String name;

	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return age == student.age && name.equals(student.name);
	}

	@Override
	public String toString() {
		return "Student{" +
				"age=" + age +
				", name='" + name + '\'' +
				'}';
	}

	//	@Override
//	public int hashCode() {
//		return Objects.hash(age, name);
//	}
}
