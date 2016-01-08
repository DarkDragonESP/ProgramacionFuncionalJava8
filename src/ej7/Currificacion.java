package ej7;

import java.util.function.*;
public class Currificacion {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Boolean> mayorQue = (x, y) -> x>y ;
		System.out.println("Sin currificacion: " +mayorQue.apply(2, 3)+" \n");


		Function<Integer, Function<Integer,Boolean>> mayorQueC = x -> y -> x>y ;
		Function<Integer,Boolean> funcIntermedia;

		funcIntermedia = mayorQueC.apply(2);
		System.out.println("Con Currificacion:\nEsto es una función intermedia "+funcIntermedia);
		System.out.println(funcIntermedia.apply(3));
	
		System.out.println("\nOtra forma: "+mayorQueC.apply(2).apply(3));
				
	}

}
