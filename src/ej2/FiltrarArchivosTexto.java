/*Autor: Francisco Molina Sánchez
 *Ejemplo 2: Filtrar Archivos
 *Descripción: implementa el metodo accept de la interfaz FilenameFilter
 *para filtrar los ficheros que tienen la extension ".txt" 
 */
package ej2;

import java.io.File;
import java.io.FilenameFilter;

public class FiltrarArchivosTexto implements FilenameFilter{
	@Override
	public boolean accept(File directorio, String nombre) {
		return nombre.endsWith(".txt");
	}
}

