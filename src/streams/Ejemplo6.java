//Autor: Guillermo Siles Bonilla
package streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.function.Supplier;

public class Ejemplo6 {
	// Reutilización
	public static void main(String [] args){
		
		// Version mala
		/*
		IntStream stream = IntStream.of(1, 2);
		stream.forEach(System.out::println);
		stream.forEach(System.out::println);
		*/
		
		// Version buena
		
		Supplier<Stream<String>> streamSupplier =
			() -> Stream.of("d2", "a2", "b1", "b3", "c")
			.filter(s -> s.startsWith("a"));
			
		streamSupplier.get().forEach(System.out::println);  
		streamSupplier.get().forEach(System.out::println);  

	}
}
