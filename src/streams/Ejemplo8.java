//Autor: Guillermo Siles Bonilla
package streams;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Ejemplo8 {

	// Collect
	
	public static void main(String [] args){
		
		List<String> nombres = Arrays.asList("Pepe", "Juan", "Guille", "Ana");
		List<String> nombresf = nombres.stream()
								.filter(s -> s.startsWith("G"))
								.collect(Collectors.toList());
		System.out.println(nombresf.toString());
		
		List<Integer> salarios = Arrays.asList(1000,980,1200,5500,1100);
		List<Integer> salariosord = salarios.stream()
									.sorted()
									.collect(Collectors.toList());
		System.out.println(salariosord.toString());
		
		String todos = nombres.stream().collect(Collectors.joining(", "));
		System.out.println(todos);
		
	}

}
