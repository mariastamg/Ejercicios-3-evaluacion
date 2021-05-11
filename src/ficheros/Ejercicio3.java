package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {
//num palabras, num caracteres, num lineas
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca ruta al archivo: ");
		try {
			String ruta=sc.nextLine();
			FileReader freader= new FileReader(ruta);
			BufferedReader in=new BufferedReader(freader);
			int numCaracteres=0;
			int numPalabras=0;
			int numLineas=0;	
			try {
				String linea=in.readLine();
				while(linea!=null) {
					numLineas++;
					for (String palabra : linea.split("\\P{L}+")) {
						numPalabras++;
						numCaracteres += palabra.length();
					}
					linea=in.readLine();
				}
				in.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			System.out.println("El numero de lineas del fichero es: "+numLineas);
			System.out.println("El numero de palabras del fichero es: "+numPalabras);
			System.out.println("El numero de caracteres del fichero es: "+numCaracteres);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
