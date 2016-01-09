/*Autor: Francisco Molina Sánchez
 *Ejemplo 6: Asignando una expresión lambda o función
 *Descripción: usamos el ejemplo anterior para mostrar como
 *se puede asignar una funcion a una variable y su uso. 
 */
package ej6;

import java.util.function.BiFunction;

public class DevolverFuncion {
	enum TipoEvaluacion {Continua, ExamenFinal};

	public static BiFunction<Double, Double, Double> calcularNotaFinal(TipoEvaluacion tipo) {
		switch (tipo) {
		case Continua:
			return (parcial, exFinal) -> parcial*0.2 + exFinal*0.8;
		case ExamenFinal:
			return (parcial,exFinal) -> exFinal;
		default:
			return null;
		}
	}

	public static void main(String[] args) {
		
		BiFunction<Double, Double, Double> variable = calcularNotaFinal(TipoEvaluacion.ExamenFinal);
		
		System.out.println("Nota final: "+String.format("%.2f",  variable.apply(4.5,7.0)));

	}
}