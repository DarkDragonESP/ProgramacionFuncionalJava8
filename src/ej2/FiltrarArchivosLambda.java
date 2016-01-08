package ej2;

import java.io.*;
//Filtra e imprime los ficheros con extensión .txt en el directorio de trabajo
//Con expresiones lambda
public class FiltrarArchivosLambda {
	public static void main(String[] args) {
		File currentDir = new File(System.getProperty("user.dir"));
		
		String[] filesLambda = currentDir.list((dir,name)->name.endsWith(".txt"));
		for (String nombre : filesLambda) {
			System.out.println(nombre);
		}
	}
}

