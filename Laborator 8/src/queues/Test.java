package queues;

import java.util.*;

public class Test {
	public static void main(String [] args) {
		Student s1 = new Student(20, "Gigel");
		Student s2 = new Student(22, "Ana");
		Student s3 = new Student(19, "Ionel");

		Queue<Student> q = new LinkedList<>();
		q.add(s1);
		q.add(s2);
		q.add(s3);

		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}

		Deque<Student> deque = new ArrayDeque<>();
		deque.add(s1);
		deque.add(s2);
		deque.add(s3);

		System.out.println("---------------------------");
		while (!deque.isEmpty()) {
			System.out.println(deque.pollLast());
		}

		PriorityQueue<Student> pq = new PriorityQueue<>((a, b) -> b.age - a.age);
		pq.add(s1);
		pq.add(s2);
		pq.add(s3);

		System.out.println("---------------------------");
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
}
