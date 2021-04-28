package collection;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) throws IOException {
		List<String> cadenas = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce cadenas de caracteres: ");
		String palabras = sc.nextLine();
		while (!palabras.isEmpty()) {
			cadenas.add(palabras);
			palabras = sc.nextLine();
		}
		System.out.println(algunaSeRepiteAlMenos3Veces(cadenas));

	}

	public static boolean algunaSeRepiteAlMenos3Veces(List<String> cadenas) {
		// Creo una estructura donde guardo dos valores el valor de la cadena y las
		// veces que se repite
		Map<String, Integer> contador = new HashMap<String, Integer>();
		Iterator<String> i = cadenas.iterator();
		while (i.hasNext()) {
			String e = i.next();
			if (!contador.containsKey(e)) {
				contador.putIfAbsent(e, 1);
			} else {
				int contadorActual = contador.get(e);
				contadorActual++;
				contador.replace(e, contadorActual);
			}
		}

		// Itero sobre contador para ver que claves se repiten mas de 3 veces
		Iterator<Entry<String, Integer>> c = contador.entrySet().iterator();
		while (c.hasNext()) {
			Entry<String, Integer> b = c.next();
			if (b.getValue() >= 3) {
				return true;
			}
				
		}

		return false;

	}
}