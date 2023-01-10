package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluation {
	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> stream = list.stream().map((number) -> printData(number));

//		stream.forEach(a -> System.out.println("Operatie terminala: "+ a));
//
//		List<Integer> intList = new ArrayList<>();
//		intList.add(1);
//		intList.add(2);
//
//		Stream<Integer> intListStream = intList.stream();
//		intList.add(3);
//		System.out.println(intListStream.count());
	}

	public static Integer printData(Integer n)  {
		System.out.println("Operatie intermediara: "+ n);
		return n;
	}
}
