package ej1;
//Implementaci�n de una interfaz funcional simple con un m�todo
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
