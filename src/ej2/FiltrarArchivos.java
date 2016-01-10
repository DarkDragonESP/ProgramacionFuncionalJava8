/*Autor: Francisco Molina S�nchez
 *Ejemplo 2: Filtrar Archivos
 *Descripci�n: Filtra e imprime los archivos con extensi�n .txt 
 *que existen en el directorio de trabajo
 */
package ej2;

import java.io.*;

public class FiltrarArchivos {
	public static void main(String[] args) {
		File directorioActual = new File(System.getProperty("user.dir"));		
		
		String[] archivos= directorioActual.list();
		
		System.out.println("\nSin filtrar:");
		for (String nombre : archivos) {
			System.out.println(nombre);
		}
		
		String[] archivosFiltrados= directorioActual.list(new FiltrarArchivosTexto());
		
		System.out.println("\nFiltrando \".txt\":");
		for (String nombre : archivosFiltrados) {
			System.out.println(nombre);
		}
	}
}

