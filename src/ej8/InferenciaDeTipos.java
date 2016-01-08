package ej8;

public class InferenciaDeTipos {
	public interface Concatenacion<T> {
	    public String concatenar(T x, T y, T z);    
	}
	public static void main(String[] args) {
		Concatenacion<String> concatenarString = (s,t) -> s+":"+ t;

	}

}
