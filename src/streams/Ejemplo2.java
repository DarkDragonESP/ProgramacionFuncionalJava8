//Autor: Guillermo Siles Bonilla
package streams;
import java.util.*;

public class Ejemplo2 {
	// Ejemplo de funciones lazy.
	public static void main(String [] args){
		List<String> l = Arrays.asList("Guille", "Gabriel");
		l.stream()
		.filter(s -> {
			System.out.println("filter: " + s);
	        return true;
		});
	}
}
