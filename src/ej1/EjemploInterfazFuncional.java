package ej1;
/*Autor: Francisco Molina S�nchez
 *Ejemplo 1: Interfaz Funcional y Expresiones Lambda
 *Descripci�n:
 *
 *
 * 
*/
//Implementa el m�todo sumar de la interfaz EjemploInterfazFuncional 
//Este m�todo suma los 2 argumentos de entrada e imprime el resultado
public class EjemploInterfazFuncional {
	public static void main(String[] args) {
		InterfazFuncional x = (int v1,int v2) -> { 
			int res= v1+v2; 
			System.out.println(res);
		};
		x.sumar(1, 2);
	}
}
