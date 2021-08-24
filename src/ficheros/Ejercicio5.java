package ficheros;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class Ejercicio5 {
	
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
			leerBinario("C:\\Users\\maria\\Documents\\MODULO DAM\\Programacion1DAW\\TEMA8\\ejercicio4.dat");
			copiarBinarioTexto("C:\\Users\\maria\\Documents\\MODULO DAM\\Programacion1DAW\\TEMA8\\ejercicio4.dat");
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void copiarBinario(int numCaracteres, int numPalabras, int numLineas) throws IOException{
		try {
			FileOutputStream fos=new FileOutputStream("C:\\Users\\maria\\Documents\\MODULO DAM\\Programacion1DAW\\TEMA8\\ejercicio4.dat", false);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			bos.write(Integer.toString(numCaracteres).getBytes(StandardCharsets.UTF_8));
			bos.write(Integer.toString(numPalabras).getBytes(StandardCharsets.UTF_8));
			bos.write(Integer.toString(numLineas).getBytes(StandardCharsets.UTF_8));
			
			bos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	
	public static void leerBinario(String ruta) throws IOException {
		try {
			BufferedInputStream bis=new BufferedInputStream(new FileInputStream(ruta));
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
	
	public static void copiarBinarioTexto(String ruta) throws IOException{
		try {
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(ruta));
		BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\maria\\Documents\\MODULO DAM\\Programacion1DAW\\TEMA8\\datoscopiados.txt"));
		int n=0;
		byte[] bytes=bis.readAllBytes();
		String text=new String(bytes, StandardCharsets.UTF_8);
		bw.write(text);
		bis.close();
		bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
		
	
		
		
	}
	
		
	

}

