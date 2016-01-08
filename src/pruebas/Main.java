package pruebas;

import java.util.function.*;

public class Main {
 
    public static void main(String[] args) {
 
        Consumer<String> imprimir = (texto) -> System.out.println(texto);
 
        imprimir.accept("\nFuck Yehaaa!!!");
 
        Predicate<Integer> verifyAge = (age) -> age > 10;
 
        System.out.println("\nLa edad es mayor a 10: " + verifyAge.test(12));
 
        BinaryOperator<Double> sum = (x, y) -> { return x + y; };
 
        System.out.println("\nLa suma de 23.7 + 65.2 es igual a: " + sum.apply(23.7, 65.2));
        System.out.println();
    } // main
 
} // Main