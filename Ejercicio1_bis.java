package collection;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/*Programa que lee de la entrada estándar una secuencia de nombres y los guarda en una colección de forma que ésta no contenga nombres 
 * repetidos. La primera línea de entrada contiene la cantidad de nombres. El resto de las líneas contienen los nombres a razón 
 * de uno por línea.El programa finalizará mostrando los nombres guardados en la colección en el mismo orden en que se insertaron.
 */

//No repetivos
//Orden de insercion linkedhashset


public class Ejercicio1_bis {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		String nombre = null;
		int numNombres = 0;
		Set<String>nombres=new LinkedHashSet<>();
		try {
		System.out.println("Introduzca un numero de nombres: ");
		numNombres=sc.nextInt();
		}catch (Exception e) {
			System.err.println("El caracter introducido debe ser numerico");
			System.exit(0);
		}
		System.out.println(numNombres);
		System.out.println("Introduzca "+numNombres+" nombres:");
		while(nombres.size()<=numNombres) {
			nombres.add(sc.nextLine());		
		}
		for(String n:nombres) {
			System.out.println(n);
		}
		
		

	}

}
