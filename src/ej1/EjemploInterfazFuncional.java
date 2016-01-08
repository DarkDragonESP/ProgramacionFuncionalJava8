package ej1;
/*Autor: Francisco Molina Sánchez
 *Ejemplo 1: Interfaz Funcional y Expresiones Lambda
 *Descripción:
 *
 *
 * 
*/
//Implementa el método sumar de la interfaz EjemploInterfazFuncional 
//Este método suma los 2 argumentos de entrada e imprime el resultado
public class EjemploInterfazFuncional {
	public static void main(String[] args) {
		InterfazFuncional x = (int v1,int v2) -> { 
			int res= v1+v2; 
			System.out.println(res);
		};
		x.sumar(1, 2);
	}
}
