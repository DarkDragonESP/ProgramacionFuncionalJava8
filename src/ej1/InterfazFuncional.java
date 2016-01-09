package ej1;
/*Autor: Francisco Molina Sánchez
 *Ejemplo 1: Interfaz Funcional y Expresiones Lambda
 *Descripción: Implementación de una interfaz funcional simple 
 *con un método sumar y 2 metodos predefinidos
 */
@FunctionalInterface
public interface InterfazFuncional{
	public void sumar(int v1,int v2);

	public default int doble(int n) {
		return 2*n;
	}

	public default int triple(int n) {
		return 3*n;
	}
}

