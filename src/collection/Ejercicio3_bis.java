package collection;
/*Crea un programa que lea de la entrada estándar una línea de texto y a continuación almacene en una
colección las palabras que no se repiten y en otra colección las que sí se repiten. El programa finalizará
mostrando el contenido de ambas colecciones (hacerlo sin escribir código para iterar).*/


import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio3_bis {
	static Scanner sc=new Scanner(System.in);
	static Set<String>palabrasRepetidas=new HashSet<String>();
	static Set<String>palabrasUnicas=new HashSet<String>();

	public static void main(String[] args) {
		System.out.println("Introduzca una linea de texto: ");
		String linea=sc.nextLine();
		String palabras[]=linea.split(" ");
		System.out.println(Arrays.toString(palabras));
		for(int i=0;i<palabras.length;i++) {
			for(int j=0;j<palabras.length;j++) {
				if(palabras[i].equals(palabras[j])&&(i!=j)) 
					palabrasRepetidas.add(palabras[i]);	
				}
			if(!palabrasRepetidas.contains(palabras[i]))
			palabrasUnicas.add(palabras[i]);
			}
		
		System.out.println(palabrasRepetidas);
		System.out.println(palabrasUnicas);
			
		}
	
		
		

	}


