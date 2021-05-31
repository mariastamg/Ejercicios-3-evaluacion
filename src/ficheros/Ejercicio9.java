package ficheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/*A partir de las clases Publicación definidas en el ejercicio 1 de la unidad 7, escribe un 
 * programa que almacene en un fichero datos de libros y revistas mediante serialización de objetos 
 * Libro y Revista.*/

public class Ejercicio9 implements Serializable {

	public static void main(String[] args) throws IOException {
		
		Publicaciones publicacion []=new Publicaciones[4];
		
		publicacion[0]=new Publicaciones(001,"El Quijote",1800);
		publicacion[1]=new Publicaciones(002,"100 años de Soledad", 1940);
		publicacion[2]=new Publicaciones(003, "El señor de los Anillos", 1950);
		publicacion[3]=new Publicaciones(004, "La chica del tren", 2017);
		
		
		
		FileOutputStream fichero_guardar;
		try {
			fichero_guardar = new FileOutputStream("c:\\pruebas\\serializacion.dat");
			ObjectOutputStream escribiendo_fichero=new ObjectOutputStream(fichero_guardar);
			escribiendo_fichero.writeObject(publicacion);
			escribiendo_fichero.close();
			
			//Ahora rescatamos la informacion del fichero
			FileInputStream fichero_leer=new FileInputStream("c:\\pruebas\\serializacion.dat");
			ObjectInputStream leyendo_objeto=new ObjectInputStream(fichero_leer);
			
			//Ahora necesitamos un array para guardar la informacion del array que nos devuelve
			Publicaciones []publicacion_recuperada=new Publicaciones[4];
			try {
				publicacion_recuperada=(Publicaciones[]) leyendo_objeto.readObject();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			leyendo_objeto.close();
			for(Publicaciones p:publicacion_recuperada) {
				System.out.println(p);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		

	}

}
