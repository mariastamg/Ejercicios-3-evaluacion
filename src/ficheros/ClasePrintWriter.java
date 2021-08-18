package ficheros;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ClasePrintWriter {

	public static void main(String[] args) {
		// La clase PrintWriter permite escribir caracteres en el fichero de la misma forma que la pantalla.
		/*Programa Java que lee texto por teclado y lo escribe en un fichero de texto llamado datos.txt. 
		 * El proceso consiste en leer una línea de texto por teclado y escribirla en el fichero. 
		 * Este proceso se repite hasta que se introduce por teclado la cadena FIN. 
		 * La cadena FIN que indica el final de lectura no se debe escribir en el fichero. */
		Scanner sc=new Scanner(System.in);
		try {
			PrintWriter salida=new PrintWriter("C:/Users/maria/Documents/MODULO DAM/Programacion1DAW/TEMA8/datos.txt");//se crea el fichero
			String cadena;
			System.out.println("Introduce texto. Para terminar introduce la cadena FIN");
			cadena=sc.nextLine();//Se introduce la cadena por teclado
			while(!cadena.equalsIgnoreCase("FIN")) {
				salida.println(cadena);//Se escribe la cadena en el fichero
				cadena=sc.nextLine();//Se introduce la siguiente cadena por teclado
			}
			salida.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
}
}
