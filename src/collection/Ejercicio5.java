package collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) throws IOException {
		// creo la pila
		Deque<Integer> pilaNumeros = new ArrayDeque<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca numeros positivos y negativos:");
		Scanner sc = new Scanner(br.readLine());
		// creamos la pila
		while (sc.hasNext()) {
			pilaNumeros.push(sc.nextInt());
		}
		negativosAbajoPositivosArriba(pilaNumeros);
		
		
		sc.close();
	}

	public static void negativosAbajoPositivosArriba(Deque<Integer> pilaNumeros) throws IllegalArgumentException, ClassCastException, NullPointerException {
		//Creo una cola
		Queue<Integer>colaNumeros=new LinkedList<Integer>();
		
		while (!pilaNumeros.isEmpty()) {
			int numero=pilaNumeros.pop();
			if(numero<0) {
			 ((LinkedList<Integer>) colaNumeros).offerLast(numero);
			}else {
				((LinkedList<Integer>) colaNumeros).offerFirst(numero);
			}
		}
		System.out.println(colaNumeros);
	}
}

