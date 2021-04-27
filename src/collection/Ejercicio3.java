package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Ejercicio3 {

	public static void main(String[] args) {
		Map<String, String>cadenas=new HashMap<String, String>();
		cadenas.put("001", "Hola");
		cadenas.put("002", "Buenos dias");
		cadenas.put("003", "Hola");
		cadenas.put("004", "Buenas tardes");
		cadenas.put("005", "Hola");
		cadenas.put("006", "Buenas noches");
		
		Iterator<Entry<String, String>>i=cadenas.entrySet().iterator();
		while(i.hasNext()) {
			Entry<String, String>e=i.next();
			System.out.printf(e.getKey()+" - "+e.getValue()+"\n");
		}
		
		System.out.println(valoresUnicos(cadenas));
		

	}
	
	public static boolean valoresUnicos(Map<String, String>cadenas) throws ClassCastException {
		//Creo una estructura donde guardo dos valores el valor de la cadena y las veces que se repite
		Map<String, Integer>contador=new HashMap<String, Integer>();
		Iterator<Entry<String,String>>i=cadenas.entrySet().iterator();
		while(i.hasNext()) {
			Entry<String, String>e=i.next();
			if(!contador.containsKey(e.getValue())){
			 contador.putIfAbsent(e.getValue(), 1);
			//if(cadenas.putIfAbsent(e.getKey(), 1))
			}else {
			 int contadoractual= contador.get(e.getValue());
			 contadoractual++;
			 contador.replace(e.getValue(), contadoractual);
			}
		}
		
		//Itero sobre el objeto contador para ver si algun valor se repite dos o mas veces
		Iterator<Entry<String,Integer>>a=contador.entrySet().iterator();
		while(a.hasNext()) {
			Entry<String, Integer>e=a.next();
			if(e.getValue()>=2) {
				return false;
			}
		
			
		
		
	}
		return true;
	}
	
}

