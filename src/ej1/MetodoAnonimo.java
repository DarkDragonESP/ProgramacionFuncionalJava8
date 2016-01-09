package ej1;
/*Autor: Francisco Molina Sánchez
 *Ejemplo 1: Interfaz Funcional y Expresiones Lambda
 *Descripción:Implementa el método sumar de la interfaz InterfazFuncional 
 *mediante un clase anónima interna 
 *Este método suma los 2 argumentos de entrada e imprime el resultado
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
