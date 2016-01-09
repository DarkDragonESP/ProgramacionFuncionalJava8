package ej4;
/*Autor: Francisco Molina Sánchez
 *Ejemplo 1: Interfaz Funcional y Expresiones Lambda
 *Descripción:
 */
import java.util.*;
import java.util.function.*;

public class FuncionesComoParametros {
	
	public static Integer procesar(Function<String,Integer> operacion,String cadena) {
        return operacion.apply(cadena);
    }
	
	public static void main(String[] args) {		
		List<String> lista= Arrays.asList("Ejemplo 1","Ejemplo 2","Ejemplo 3");
		
		lista.forEach(cadena -> System.out.println(
							procesar(x -> x.hashCode(),cadena)));
	}

}
