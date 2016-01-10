
/*Autor: Francisco Molina Sánchez
 *Ejemplo 3: Interfaces Funcionales Básicas
 *Descripción: mostramos a continuación el uso de las interfaces básicas
 * para usar expresiones lambda, sin necesidad de crear una interfaz nueva.
 * Necesitamos importar el paquete java.util.function
 * 3.1: Expresion lambda que coge 2 argumentos de entrada y devuelve la suma
 * 3.2: Expresion lambda que "consume" un argumento de entrada y lo imprime
 * 3.3: Expresion lambda que coge 1 argumento de entrada y devuelve su hashcode
 * 3.4: Expresión lambda que toma un argumento de entrada y devuelve un booleano 
 * según la condición
 * 3.5: Expresión lambda reducida que inicializa una Lista
 * 3.6: Ejemplo del uso de forEach de una lista que toma como argumento un Consumer
 */
package ej3;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.*;

public class FuncionesBasicas {
	public static void main(String[] args) {
		//3.1
		BinaryOperator<Double> suma = (x, y) -> x + y ;
		System.out.println("La suma es: " + suma.apply(7.7, 7.3));
		//3.2
		Consumer<String> imprimir = cadena -> System.out.println(cadena);
		imprimir.accept("\nEsto es un String.");
		//3.3
		Function<String,Integer> hashCodeL = (contraseña)-> contraseña.hashCode();
		System.out.println("\nEl hashcode es: "+ hashCodeL.apply("contraseña"));
		//3.4
		Predicate<Double> verificar = (nota) -> nota >= 5;
		System.out.println("\n¿Aprobado?: " + verificar.test(7.0));
		//3.5	
		Supplier<List<String>> inicializar = LinkedList::new ;
		List<String> lista = inicializar.get();
		//3.6
		lista = Arrays.asList("\nEjemplo 1","Ejemplo 2","Ejemplo 3");
		lista.forEach(imprimir);
	}

}
