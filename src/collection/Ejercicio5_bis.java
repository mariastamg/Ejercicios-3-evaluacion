package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/*Programa para practicar las operaciones básicas con una cola. 
 * Tendrá que leer de la entrada estándar los datos siguientes:
• Una línea en la que se escribirán 3 números enteros que llamaremos N, K y X.
• Una línea en la que se escribirán N números, entre los que estará el número X.
Los N números leídos en la segunda línea se almacenarán en una cola y a continuación se retirarán 
K números. Finalmente se comprobará si el número X aún se encuentra almacenado en la cola. 
Si es así se mostrará true en la salida estándar. En caso contrario se mostrará el número más 
pequeño de los que permanecen en la cola. Si la cola estuviese vacía se mostrará el valor cero.*/

public class Ejercicio5_bis {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n, k, x;
		String linea;
		String linea2 = "";
		// Una línea en la que se escribirán 3 números enteros que llamaremos N, K y X.
		System.out.println("Introduzca 3 numeros enteros: ");
		linea = sc.nextLine();
		n = Integer.parseInt(String.valueOf(linea.charAt(0)));
		k = Integer.parseInt(String.valueOf(linea.charAt(1)));
		x = Integer.parseInt(String.valueOf(linea.charAt(2)));

		// Una línea en la que se escribirán N números, entre los que estará el número
		// X.
		System.out.println("Introduzca " + n + " numeros enteros:");
		linea2 = sc.nextLine();
		Queue<Integer> numeros = new LinkedList<Integer>();
		for (int i = 0; i < linea2.length(); i++) {
			numeros.add(Integer.parseInt(String.valueOf(linea.charAt(i))));
		}
		// Comprobamos que el tamaño de la cola sea igual a n, en caso contrario cerramos el programa
		if (numeros.size() != n) {
			System.out.println("La cantidad de numeros no es la correcta, se cierra el programa");
			System.exit(0);
		}

		// Comprobamos que la cola contiene el numero x, en caso contrario cerramos el programa

		if (!numeros.contains(x)) {
			System.out.println("El numero " + x + " no esta contenido en la linea, se cierra el programa");
			System.exit(0);
		}

		// Tenemos que retirar K numeros de la cola, lo primero comprobamos que K sea menor que el tamaño de la cola
		if(numeros.size()>k) {
        for(int i=0;i<k;i++) {
        	numeros.remove();
        }
        if(numeros.contains(x)) {
        	System.out.println(true);
        }else {
        	devuelveMenor(numeros);
        }
		}else if(numeros.size()==k){
        	System.out.println("El tamaño de la cola es igual a "+k+" no podemos extraer los numeros");	
        	
        }else {
        	System.out.println("El tamaño de la cola es menor a "+k);
        	
        
	}
		
	}
	
	public static int devuelveMenor(Queue<Integer> numeros) {
		int numPeq = 0;
		if (!numeros.isEmpty()) {
			numPeq = ((LinkedList<Integer>) numeros).peekFirst();
			Iterator<Integer> i = numeros.iterator();
			while (i.hasNext()) {
				if (i.next() < numPeq) {
					numPeq = i.next();
				}
			}
		} else {
			numPeq = 0;
		}

		return numPeq;

	}

}
	
		
		
