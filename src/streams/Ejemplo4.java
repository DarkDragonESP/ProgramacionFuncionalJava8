//Autor: Guillermo Siles Bonilla
package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Ejemplo4 {
	// tipos
	public static void main(String [] args){
		List<String> l = Arrays.asList("1. Guille", "2. Gabriel");
		l.stream()
		.map(s -> s.substring(0, 1))
		.mapToInt(Integer::parseInt)
		.max()
		.ifPresent(System.out::println);
		
		/*
		List<Integer> ll = Arrays.asList(1,2,3);
		ll.stream()
		.map(s -> s*2)
		.max()
		.ifPresent(System.out::println);
		*/
		
		/*
		IntStream.range(1,4)
		.map(s -> s*2)
		.max()
		.ifPresent(System.out::println);
		*/
	}
}
