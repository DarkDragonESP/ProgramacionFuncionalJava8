package ej1;
//Implementación de una interfaz funcional simple con un método
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
