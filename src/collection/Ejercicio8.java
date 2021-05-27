package collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;



public class Ejercicio8 {
	
	public static Map<String,Integer> interseccion(Map<String,Integer>m1, Map<String,Integer>m2) {
		Map<String,Integer>mapaInterseccion=new TreeMap<String, Integer>();
		Iterator<Entry<String, Integer>>i=m1.entrySet().iterator();
		while(i.hasNext()) {
			Entry<String,Integer>e1=i.next();
			Iterator<Entry<String,Integer>>i2=m2.entrySet().iterator();
			while(i2.hasNext()) {
				Entry<String,Integer>e2=i2.next();
				if(e1.equals(e2)) {
					mapaInterseccion.put(e1.getKey(),e1.getValue());
					
				}
				
			}
		}
		
		
		return mapaInterseccion;
		
	}

	public static void main(String[] args) {
		Map<String, Integer>mapa1=new TreeMap<String, Integer>();
		Map<String, Integer>mapa2=new TreeMap<String, Integer>();
		
				mapa1.put("Fernando", 53);
				mapa1.put("Manuela", 29);
				mapa1.put("Ana",41 );
				mapa1.put("Luis",65 );
				mapa1.put("Mario",33 );
				mapa1.put("Adrián",21 );
				mapa1.put("Carmen",39 );
				mapa1.put("Elena",19 );
				
				mapa2.put("Valentina", 37);
				mapa2.put("Ana", 41);
				mapa2.put("Mario",33);
				mapa2.put("Benito",67 );
				mapa2.put("Carmen",39 );
				mapa2.put("Ramón",44 );
				mapa2.put("Elena",19 );
				mapa2.put("Hugo",32  );
				
				System.out.println(mapa1);
				System.out.println(mapa2);
				
			System.out.println(interseccion(mapa1,mapa2));	
						
									

		

	}

}
