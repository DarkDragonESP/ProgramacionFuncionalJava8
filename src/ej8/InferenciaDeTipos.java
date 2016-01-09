/*Autor: Francisco Molina Sánchez
 *Ejemplo 1: Interfaz Funcional y Expresiones Lambda
 *Descripción:
 */
package ej8;
//nos ahorramso 3 interfaces
public class InferenciaDeTipos {
	@FunctionalInterface
	public interface Concatenacion<T> {
		public String concatenar(T x, T y, T z);    
	}
	public static void main(String[] args) {
		Concatenacion<String> concatenarString = (x,y,z) -> x+" "+y+" "+z ;
		Concatenacion<Integer> concatenarEnteros = (x,y,z) -> x+" "+y+" "+z ;
		System.out.println(
				concatenarString.concatenar("a","b","c")  +"\n"+
				concatenarEnteros.concatenar(1,2,3));
	}

}
