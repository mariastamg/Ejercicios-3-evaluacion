package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*Leer sin buffer
		try {
			FileReader in=new FileReader("c:\\pruebas\\ElQuijote-UTF8.txt");
			String texto = "";
			try {
				int c=in.read();
				while(c!=-1) {
					texto=texto+(char)c;
					c=in.read();
				}
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		System.out.println(texto);	
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}*/
		
		//Leer con buffer
		try {
			BufferedReader in=new BufferedReader(new FileReader("c:\\pruebas\\ElQuijote-UTF8.txt"));
			String texto="";
			try {
				String linea=in.readLine();
				while(linea!=null) {
					texto=texto+linea+'\n';
					linea=in.readLine();
				}
				in.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			System.out.println(texto);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
