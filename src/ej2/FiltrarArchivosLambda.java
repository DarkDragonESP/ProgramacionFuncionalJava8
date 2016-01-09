/*Autor: Francisco Molina S�nchez
 *Ejemplo 2: Filtrar Archivos
 *Descripci�n:
 */
package ej2;

import java.io.*;
//Filtra e imprime los ficheros con extensi�n .txt en el directorio de trabajo
//Con expresiones lambda
public class FiltrarArchivosLambda {
	public static void main(String[] args) {
		
		File directorioActual = new File(System.getProperty("user.dir"));
		
		String[] archivos = directorioActual.list((directorio,nombre)->
							nombre.endsWith(".txt"));
		
		for (String nombre : archivos) {
			System.out.println(nombre);
		}
		
	}
}

