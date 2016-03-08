//Autor: Guillermo Siles Bonilla
package streams;

import java.util.stream.IntStream;

public class Ejemplo7 {
	// Accidentes
	public static void main(String [] args){
		
		
		IntStream.iterate(0, i -> i + 1)
	    .forEach(System.out::println);
		
		IntStream.iterate(0, i -> ( i + 1 ) % 2)
        .distinct()
        .limit(10)
        .forEach(System.out::println);
		
		IntStream.iterate(0, i -> ( i + 1 ) % 2)
        .parallel()
        .distinct()
        .limit(10)
        .forEach(System.out::println);
	}
}
