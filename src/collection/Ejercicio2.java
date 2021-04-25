package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		Collection<Integer>numeros=new HashSet<Integer>();
		Random r = new Random();
		//4 num aleatorios y los almacenamos en HashSet
		for (int i=0; i<4; i++)
			numeros.add(r.nextInt(100) + 1);
		System.out.println(numeros);
		System.out.println(contieneImpares(numeros));

	}
	
	public static boolean contieneImpares(Collection<Integer>numeros) {
		Iterator<Integer>i=numeros.iterator();
		while(i.hasNext()) {
			if(!(i.next()%2==0))
				return true;	
		}
		
		return false;
		
		
	}

}
