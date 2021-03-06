/*Autor: Francisco Molina S�nchez
 *Ejemplo 10: Inferencia de tipos
 *Descripci�n: mostramos un ejemplo sencillo de concatenacion
 *en el que hacemos uso de una �nica interfaz con valores de entrada
 *de tipo T para aplicar la inferencia de tipos.Evitando hacer uso de m�s 
 *de una interfaz.
 */
package ej10;

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
