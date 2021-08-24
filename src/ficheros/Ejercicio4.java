package ficheros;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Ejercicio4 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Introduzca ruta al archivo: ");
		
		String ruta=sc.nextLine();
		try {
			BufferedReader br=new BufferedReader(new FileReader(ruta));
			int numCaracteres = 0;
			int numPalabras = 0;
			int numLineas = 0;
			String linea=br.readLine();
			while(linea!=null) {
				numLineas++;
				for(String palabra:linea.split("\\P{L}+")) {
					numPalabras++;
					numCaracteres=palabra.length();	
				}
				linea=br.readLine();
			}
			br.close();
			
			copiarBinario(numCaracteres,numPalabras,numLineas);
			leerBinario(ruta);
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void copiarBinario(int numCaracteres, int numPalabras, int numLineas) throws IOException{
		try {
			FileOutputStream fos=new FileOutputStream("C:\\Users\\maria\\Documents\\MODULO DAM\\Programacion1DAW\\TEMA8\\ejercicio4.dat", true);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			bos.write(numCaracteres);
			bos.write(numPalabras);
			bos.write(numLineas);
			
			bos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	
	public static void leerBinario(String ruta) throws IOException {
		try {
			BufferedInputStream bis=new BufferedInputStream(new FileInputStream("C:\\Users\\maria\\Documents\\MODULO DAM\\Programacion1DAW\\TEMA8\\ejercicio4.dat"));
			int n = 0;
			while(n!=-1) {
				n=bis.read();
				System.out.println(n);
			}
			bis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
