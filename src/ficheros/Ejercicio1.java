package ficheros;

import java.io.File;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class Ejercicio1 {
	/**Obtener informacion de ficheros y directorios**/

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Introduzca la ruta de un archivo:");
			String rutafile=sc.next();
			File fichero=new File(rutafile);
			//Vamos a comprobar si el archivo existe
			if(fichero.exists()) {
				System.out.println("El fichero "+fichero.getName()+" introducido existe.");
				//Si se trata de un fichero o de un directorio.
				if(fichero.isFile()) {
					System.out.println(fichero.getName()+ " es un fichero");
					//Nombre del fichero y permisos
					System.out.println("Nombre del fichero: "+fichero.getName()+" permisos de lectura: "+fichero.canRead()+" permiso de escritura: "+fichero.canWrite()+" permiso de ejecución: "+fichero.canExecute());
					System.out.println("El tamaño del fichero es: "+fichero.length()+" bytes");
				}else if(fichero.isDirectory()) {
					System.out.println(fichero.getName()+ " es un directorio");
				}else {
					System.out.println(fichero.getName()+ " no es ni un fichero ni un directorio");
				}
				
			}else {
				System.out.println("El fichero "+fichero.getName()+" introducido no existe.");
			}
			
			
			
		}catch(FileSystemNotFoundException e) {
			System.out.println("No se encuentra el archivo");
		} 
		
		
		
		
	}

}
