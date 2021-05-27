package collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Ejercicio7 {
	
	//Tope → [2, 7, 12, 5, 14, 9, 7, 10, 17, 17, 22, 6]
	
	public static Deque<Integer> eliminarSiMayoresEncima (Deque<Integer>pilaOriginal){
		Deque<Integer>pilaNueva=new LinkedList<Integer>();
	    while(!pilaOriginal.isEmpty()) {
			if(pilaNueva.isEmpty()) {
				pilaNueva.push(pilaOriginal.peek());
				//pilaOriginal.pop();
			}else{
				int a=pilaNueva.peek();
				int b=pilaOriginal.peek();
				if(a>b) {
					//pilaOriginal.pop();
					
				}else {
					pilaNueva.push(b);
					//pilaOriginal.pop();	
				}
				
			}
			pilaOriginal.pop();
		}
		
		return pilaNueva;
	}

	public static void main(String[] args) {
		Deque<Integer>pila=new LinkedList<Integer>();
		
	
		pila.push(6);
		pila.push(22);
		pila.push(17);
		pila.push(17);
		pila.push(10);
		pila.push(7);
		pila.push(9);
		pila.push(14);
		pila.push(5);
		pila.push(12);
		pila.push(7);
		pila.push(2);
		
		
		System.out.println(eliminarSiMayoresEncima(pila));
		

	}

}
