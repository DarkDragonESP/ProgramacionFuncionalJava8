package ej2;

import java.io.*;
//Filtra e imprime los ficheros con extensión .txt en el directorio de trabajo
//Creando la clase TextFilesFilter como filtro
public class FiltrarArchivos {
	public static void main(String[] args) {
		File currentDir = new File(System.getProperty("user.dir"));
		
		String[] files= currentDir.list(new TextFilesFilter());
		for (String nombre : files) {
			System.out.println(nombre);
		}
	}
}

