/*Autor: Francisco Molina Sánchez
 *Ejemplo 2: Filtrar Archivos
 *Descripción:
 */
package ej2;

import java.io.*;
//Filtra e imprime los ficheros con extensión .txt en el directorio de trabajo
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

