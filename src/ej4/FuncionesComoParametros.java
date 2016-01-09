package ej4;
/*Autor: Francisco Molina Sánchez
 *Ejemplo 4: Funciones de orden superior
 *Descripción: en este ejemplo mostramos como pasar una función como 
 *parámetro. En este caso, le pasamos a la funcion procesar, la expresión
 *lambda "x -> x.hashCode()" y el mismo String. Esta expresion lambda
 *dado un String devuelve su hashcode. 
 *Procesar ejecuta la expresion lambda teniendo como argumento de entrada el 
 *String cadena.
 *Todo esto lo imprimimos por pantalla.
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
							procesar(x -> x.hashCode() ,cadena)));
	}

}
