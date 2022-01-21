package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluation {
	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> stream = list.stream().map((number) -> printData(number));

		stream.forEach(a -> System.out.println("Operatie terminala: "+ a));
	}

	public static Integer printData(Integer n)  {
		System.out.println("Operatie intermediara: "+ n);
		return n;
	}
}
