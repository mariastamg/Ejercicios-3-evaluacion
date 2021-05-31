package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map.Entry;

/*Crea un programa que use un objeto de la clase Palabras, 
 * definida en el ejercicio 4 de colecciones, para contener las palabras almacenadas en el 
 * fichero “Lemario ES UTF-8.txt”. A continuación, el programa almacenará en una colección todas 
 * aquellas palabras del fichero “El Quijote UTF-8.txt” que no estén en el lemario sin repetir 
 * ninguna. Después mostrarlas en orden alfabético.*/
public class Ejercicio7 {
	
	private static Set<String>noEstan=new TreeSet<String>();

	public static void main(String[] args) throws IOException {
		
		File archivo=new File("c:\\pruebas\\LemarioESUTF-8.txt");
		try {
			FileReader fr=new FileReader(archivo);
			BufferedReader br=new BufferedReader(fr);
			String texto=br.readLine();
			

			Palabras palabras=new Palabras();
			palabras.addPalabra(texto);
			System.out.println(texto);
			//Creamos un treeset donde vamos a almacenar las palabras del quijote.txt que no esten en lemario
			File archivoQuijote=new File("c:\\pruebas\\ElQuijoteUTF8.txt");
			FileReader fr2=new FileReader(archivoQuijote);
			BufferedReader br2=new BufferedReader(fr2);
			String textoQuijote=br2.readLine();
			String[]palabra=textoQuijote.split(" ");
			
			//recorro el array palabra
			Iterator i=Arrays.asList(palabra).iterator();
			while(i.hasNext()) {
				String plbra=(String) i.next();
				boolean cont=palabras.contiene(plbra);
				if(cont==false) {
					noEstan.add(plbra);
				}
				
			}
			
			
			for(String palabraNo:noEstan) {
				System.out.println(palabraNo);
			}
			
			br2.close();
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}


