//Autor: Guillermo Siles Bonilla
package streams;

import java.util.Arrays;
import java.util.List;

public class Ejemplo5 {
	// Orden
	public static void main(String [] args){
		List<String> l = Arrays.asList("Guille", "Gabriel", "Ana", "Laura");
		
		// Caso no eficiente
		l.stream()
		.map(s -> {
			System.out.println("Map.");
			return s.toUpperCase();
		})
		.filter(s -> {
			System.out.println("Filter.");
			return s.length() == 5;
		})
		.forEach(System.out::println);
		
		
		System.out.println('\n' + "Nuevo caso" + '\n');
		
		
		// Caso eficiente
		l.stream()
		.filter(s -> {
			System.out.println("Filter.");
			return s.length() == 5;
		})
		.map(s -> {
			System.out.println("Map.");
			return s.toUpperCase();
		})
		.forEach(System.out::println);
	}

}
