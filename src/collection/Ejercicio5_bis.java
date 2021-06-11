package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/*Programa para practicar las operaciones b�sicas con una cola. 
 * Tendr� que leer de la entrada est�ndar los datos siguientes:
� Una l�nea en la que se escribir�n 3 n�meros enteros que llamaremos N, K y X.
� Una l�nea en la que se escribir�n N n�meros, entre los que estar� el n�mero X.
Los N n�meros le�dos en la segunda l�nea se almacenar�n en una cola y a continuaci�n se retirar�n 
K n�meros. Finalmente se comprobar� si el n�mero X a�n se encuentra almacenado en la cola. 
Si es as� se mostrar� true en la salida est�ndar. En caso contrario se mostrar� el n�mero m�s 
peque�o de los que permanecen en la cola. Si la cola estuviese vac�a se mostrar� el valor cero.*/

public class Ejercicio5_bis {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n, k, x;
		String linea;
		String linea2 = "";
		// Una l�nea en la que se escribir�n 3 n�meros enteros que llamaremos N, K y X.
		System.out.println("Introduzca 3 numeros enteros: ");
		linea = sc.nextLine();
		n = Integer.parseInt(String.valueOf(linea.charAt(0)));
		k = Integer.parseInt(String.valueOf(linea.charAt(1)));
		x = Integer.parseInt(String.valueOf(linea.charAt(2)));

		// Una l�nea en la que se escribir�n N n�meros, entre los que estar� el n�mero
		// X.
		System.out.println("Introduzca " + n + " numeros enteros:");
		linea2 = sc.nextLine();
		Queue<Integer> numeros = new LinkedList<Integer>();
		for (int i = 0; i < linea2.length(); i++) {
			numeros.add(Integer.parseInt(String.valueOf(linea.charAt(i))));
		}
		// Comprobamos que el tama�o de la cola sea igual a n, en caso contrario cerramos el programa
		if (numeros.size() != n) {
			System.out.println("La cantidad de numeros no es la correcta, se cierra el programa");
			System.exit(0);
		}

		// Comprobamos que la cola contiene el numero x, en caso contrario cerramos el programa

		if (!numeros.contains(x)) {
			System.out.println("El numero " + x + " no esta contenido en la linea, se cierra el programa");
			System.exit(0);
		}

		// Tenemos que retirar K numeros de la cola, lo primero comprobamos que K sea menor que el tama�o de la cola
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
        	System.out.println("El tama�o de la cola es igual a "+k+" no podemos extraer los numeros");	
        	
        }else {
        	System.out.println("El tama�o de la cola es menor a "+k);
        	
        
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
	
		
		
