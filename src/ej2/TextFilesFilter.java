package ej2;

import java.io.File;
import java.io.FilenameFilter;
//Filtro para el ejemplo de FiltrarArchivos
public class TextFilesFilter implements FilenameFilter{
	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(".txt");
	}
}

