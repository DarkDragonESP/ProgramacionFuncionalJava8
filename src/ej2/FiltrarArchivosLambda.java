/*Autor: Francisco Molina S�nchez
 *Ejemplo 2: Filtrar Archivos
 *Descripci�n: Filtra e imprime los ficheros con extensi�n .txt 
 *en el directorio de trabajo haciendo uso de expresiones lambda
 */
package ej2;

import java.io.*;

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

