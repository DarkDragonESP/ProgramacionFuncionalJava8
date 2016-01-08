package ej9;

public class Excepciones {
	@FunctionalInterface
	public interface Operacion<T>{
		public T division(T x,T y) throws ArithmeticException;
	}
	public static void main(String[] args) {
		Operacion<Integer> operar = (x, y) -> {
			if(y==0) {
				throw new ArithmeticException("ERROR: division por cero");
			} else {                
				return x/y;
			}
		};
		System.out.println(operar.division(11,0));
	}

}
