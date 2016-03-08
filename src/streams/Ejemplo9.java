//Autor: Guillermo Siles Bonilla
package streams;

import java.util.Arrays;
import java.util.*;

public class Ejemplo9 {
	//Reduce
	public static void main(String [] args){
		List<String> nombres = Arrays.asList("Ana", "Guille", "David", "Fran");
		nombres
		.stream()
	    .reduce((n1, n2) -> n1.compareTo(n2) <= 0 ? n1 : n2)
	    .ifPresent(System.out::println);
		
		String todos = nombres
		.stream()
		.reduce("\nLaura", (n1, n2) -> (n1 + n2));
		System.out.println(todos);
		
		List<Person> p = Arrays.asList(new Person(19), new Person(20), new Person(49));
		p.stream()
	    .reduce(0, (sum, person) -> sum += person.getAge(), (sum1, sum2) -> sum1 + sum2);	
	}
}
