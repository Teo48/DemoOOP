package streams;

import kotlindemo.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Functions {
	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//		Consumer<List<Integer>> doubleItems = l -> {
//			for (int i = 0; i < l.size(); ++i) {
//				l.set(i, l.get(i) << 1); // << i <==> *2^i
//			}
//		};
//
//		Consumer<List<Integer>> printList = System.out::println;
//		doubleItems.andThen(printList).accept(list);

//		Predicate<Integer> filterEven = i -> (i & 1) == 0;
//		Predicate<Integer> isPowerOfTwo = i -> (i & (i - 1)) == 0;
//		System.out.println(filterEven.and(isPowerOfTwo).test(2));

//		list.stream()
//				.filter(filterEven.and(isPowerOfTwo))
//				.forEach(System.out::println);
//
//		Function<Integer, Integer> f = x -> x + 2;
//		Function<Integer, Integer> g = x -> x * 3;
//		System.out.printf("f(%d) = %d\n", 2, f.apply(2));
//		System.out.printf("g(%d) = %d\n", 2, g.apply(2));
//		System.out.println(f.andThen(g).apply(2)); // -> g(f(x))
//		System.out.println(f.compose(g).apply(2)); // -> f(g(x))
//
//		Supplier<Double> h = Math::random;
//		System.out.println(h.get());

//		String [] s = new String[]{"alice", "cooper", "greta", "van", "fleet", "chester"};
//		String [] res = Arrays.stream(s)
//				.map(String::toUpperCase)
//				.toArray(String[]::new);
//
//		Arrays.stream(res)
//				.forEach(System.out::println);
//
//		String[] filteredStrings = Arrays.stream(s)
//				.filter(i -> i.startsWith("c"))
//				.toArray(String[]::new);
//
//		Arrays.stream(filteredStrings)
//				.forEach(System.out::println);


		// peek()
//
//		Stream<Student> studentStream = Stream.of(new Student("Gigel", "X", 1L),
//																							new Student("Gigel", "Y", 2L));
//		studentStream.peek(i -> i.setId(i.getId() * 2)).forEach(System.out::println);

		//reduce()
//		Stream<Integer> stream = Stream.of(1, 2, 3, 4 ,5);
//		System.out.println(stream.reduce(0, Integer::sum));

//		int reduced = Stream.of(1, 2, 3).reduce(10, Integer::sum, Integer::sum);
//		System.out.println(reduced);
//
//		int reducedParallel = Arrays.asList(1, 2, 3).parallelStream().reduce(10, Integer::sum, Integer::sum);
//		System.out.println(reducedParallel);
//
//		List<List<Integer>> listOfLists = List.of(List.of(1, 2, 3, 4), List.of(7, 8, 9, 10), List.of(5, 6));
//		// [1, 2, 3, 4], [7, 8, 9, 10], [5, 6] -> [1, 2, 3, 4, 7, 8, 9, 10, 5, 6]
//		List<Integer> singleList = listOfLists.stream()
//				.flatMap(List::stream)
//				.collect(Collectors.toList());
//		System.out.println(singleList);
//
//		List<String> strings = Arrays.asList("POO", "SO", "IOCLA", "POO", "SD", "AA");
//		Map<String, Long> groupByStrings = strings.stream()
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//		System.out.println(groupByStrings);
////
//		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		Map<Boolean, List<Integer>> oddEven = numbers.stream()
//				.collect(Collectors.partitioningBy(i -> (i & 1) == 0));
//
//		System.out.println(oddEven);
	}
}
