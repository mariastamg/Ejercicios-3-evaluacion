package collection;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/*Programa que lee de la entrada est�ndar una secuencia de nombres y los guarda en una colecci�n de forma que �sta no contenga nombres 
 * repetidos. La primera l�nea de entrada contiene la cantidad de nombres. El resto de las l�neas contienen los nombres a raz�n 
 * de uno por l�nea.El programa finalizar� mostrando los nombres guardados en la colecci�n en el mismo orden en que se insertaron.
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
