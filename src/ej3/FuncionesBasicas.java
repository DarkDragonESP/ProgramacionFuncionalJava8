/*Autor: Francisco Molina Sánchez
 *Ejemplo 3: Interfaces Funcionales Básicas
 *Descripción: mostramos a continuación el uso de las interfaces básicas
 * para usar expresiones lambda, sin necesidad de crear una interfaz nueva.
 * Necesitamos importar el paquete java.util.function
 */
package ej3;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class FuncionesBasicas {
	public static void main(String[] args) {

		BinaryOperator<Double> suma = (x, y) -> x + y ;
		System.out.println("La suma es: " + suma.apply(7.7, 7.3));

		Consumer<String> imprimir = (cadena) -> System.out.println(cadena);
		imprimir.accept("Esto es un String.");

		Function<String,Integer> hashCodeL = (contraseña)-> contraseña.hashCode();
		System.out.println("El hashcode es: "+ hashCodeL.apply("contraseña"));

		Predicate<Integer> verificar = (edad) -> edad >= 18;
		System.out.println("La edad es mayor a 18: " + verificar.test(20));
		
		UnaryOperator<List<String>> inicializar = ArrayList::new ;
		
		Function<Double,String> inicializar2 = String::valueOf ;
		System.out.println(inicializar2.apply(123.4));
	}

}
