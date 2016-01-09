/*Autor: Francisco Molina Sánchez
 *Ejemplo 1: Interfaz Funcional y Expresiones Lambda
 *Descripción:
 */
package ej7;

import java.util.*;
import java.util.function.*;
public class Currificacion {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Boolean> mayorQue = (x, y) -> x>y ;
		System.out.println("Sin currificacion: " +mayorQue.apply(2, 3)+" \n");


		Function<Integer, Function<Integer,Boolean>> mayorQueC = x -> y -> x>y ;
		Function<Integer,Boolean> funcIntermedia;

		funcIntermedia = mayorQueC.apply(2);
		System.out.println("Con Currificacion:\nEsto es una función intermedia "+funcIntermedia);
		System.out.println(funcIntermedia.apply(3));
	
		System.out.println("\nOtra forma: "+mayorQueC.apply(2).apply(3));
			
		
		List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println("\n¿Es mayor que 4?");
		lista.forEach(x-> System.out.println(x+" "+mayorQueC.apply(x).apply(4)));
	}

}
