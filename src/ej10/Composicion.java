/*Autor: Francisco Molina S�nchez
 *Ejemplo 10: Composici�n
 *Descripci�n: mostramos como usar composicion de funciones
 *con expresiones lambda.Podemos usar los m�todos "compose" (despues de)
 *y "andThen" (antes de) para aplicarlo seg�n el orden que deseamos en el que
 *se ejecutan las funciones
 */
package ej10;
import java.util.function.*;
public class Composicion {
 
	public static void main(String[] args) {
		Function<Integer, Integer> f = x -> x + 2;
		Function<Integer, Integer> g = x -> x * 5;
		Function<Integer, Integer> c1,c2;
		
		c1 = f.compose(g);
		c2 = f.andThen(g);
		
		System.out.println("Compose(f despues de g) c1=(f�g) (x*5)+2  c1(5)= "+c1.apply(5));
		System.out.println("AndThen(f antes de g)   c2=(g�f) (x+2)*5  c2(5)=" +c2.apply(5));
		
	}

}
