package ej1;
/*Autor: Francisco Molina S�nchez
 *Ejemplo 1: Interfaz Funcional y Expresiones Lambda
 *Descripci�n:Implementa el m�todo sumar de la interfaz InterfazFuncional 
 *mediante un clase an�nima interna 
 *Este m�todo suma los 2 argumentos de entrada e imprime el resultado
 */

public class MetodoAnonimo {
	public static void main(String[] args) {
		InterfazFuncional x = new InterfazFuncional() {
			@Override
			public void sumar(int v1, int v2) {
				int res=v1+v2;
				System.out.println(res);
			}
		};
		x.sumar(1, 2);
	}
}
