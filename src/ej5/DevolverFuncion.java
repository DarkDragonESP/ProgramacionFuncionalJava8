package ej5;

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
		
		System.out.println("Nota final: "+ String.format("%.2f", 
					calcularNotaFinal(TipoEvaluacion.Continua).apply(4.5,7.0)));

	}
}