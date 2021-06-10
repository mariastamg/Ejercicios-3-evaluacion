package collection;
/*Crea un programa que realice las tareas siguientes:
 * Almacenar en una lista 100 números aleatorios entre 1 y 100 y mostrarlos todos utilizando uno de los métodos de iteración.
 * Almacenar los números de la lista original en otra colección sin que se repita ninguno y mostrarlos todos usando un método de iteración 
 * diferente al anterior.
 * Almacenar los números de la lista original en otra colección en la que se almacenen ordenados y sin que se repita ninguno 
 * y mostrarlos todos usando un método de iteración diferente al anterior.
 * */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio2_bis {

	public static void main(String[] args) {
		ArrayList<Integer>coleccion1=new ArrayList<Integer>();
		coleccion1=aleatoriosEntre1y100();
		//Iteramos sobre los elementos de la primera lista con un iterador
		System.out.println("La primera coleccion es: ");
		Iterator<Integer>i=coleccion1.iterator();
		while(i.hasNext()) {
			System.out.println("->"+(i.next()));
		}
		
		//Iteramos sobre los elementos de la segunda lista con un bucle ForEach
		Set<Integer>coleccion2=new TreeSet<Integer>();
		System.out.println("La segunda coleccion es: ");
		coleccion2.addAll(coleccion1);
		coleccion2.forEach(numero -> System.out.println("<<"+numero));
		
		
		//Iteramos sobre los elementos de la tercera lista con un bucle for mejorado
		Set<Integer>coleccion3=new HashSet<Integer>();
		System.out.println("La tercera coleccion es: ");
		coleccion3.addAll(coleccion1);
		for (Integer e:coleccion3) {
			System.out.println("--"+e);
		}
		
		
		

	}
	
	public static ArrayList<Integer> aleatoriosEntre1y100() {
		 ArrayList<Integer> listaNum = new ArrayList<Integer>();
		 Random rd=new Random();
		 //100 numeros aleatorios entre 1 y 100
		 for(int i = 1; i<=100; i++)
		    listaNum.add(rd.nextInt(100)+1);
		
		return listaNum;
	}

}
