//Autor: Guillermo Siles Bonilla
package streams;
import java.util.*;

public class Ejemplo1 {
	// Ejemplo de stream básico.
	public static void main(String [] args){
		List<String> l = Arrays.asList("Guille", "Fran", "Daniel", "Gabriel");
		l.stream()
		.filter(lalista -> lalista.startsWith("G"))
		.sorted()
		.map(String::toUpperCase)
		.forEach(System.out::println);
	}
}