package ej1;

//Implementa el método sumar de la interfaz EjemploInterfazFuncional mediante clases anónimas internas 
//Este método suma los 2 argumentos de entrada e imprime el resultado
public class EjemploInterfazMetodoAnonimo {
	public static void main(String[] args) {
		InterfazFuncional x = new InterfazFuncional() {
			@Override
			public void sumar(int v1, int v2) {
				int res=v1+v2;
				System.out.println(res);
			}
		};
		x.sumar(1, 2);
	}
}
