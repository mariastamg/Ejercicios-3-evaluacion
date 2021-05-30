package ficheros;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;



public class Ejercicio_6 {
	
	

	public static void main(String[] args) {
		
		
		Marco miMarco=new Marco();
		miMarco.setBounds(300, 200, 500, 300);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		

	}	
}

class Marco extends JFrame{
	
	
	public Marco() {
		setTitle("Elige archivo");
		setVisible(true);
		Panel miPanel=new Panel();
		add(miPanel);
			
		
		
	}
	
}

class Panel extends JPanel{
	
	private JMenuItem UTF8;
	private JMenuItem Windows;
	
	public Panel() {
		setVisible(true);
		JMenuBar barraMenu=new JMenuBar();
		barraMenu.setBorderPainted(true);
		add(barraMenu);
		JMenu menu=new JMenu("Archivo");
		barraMenu.add(menu);
		JMenu abrir=new JMenu("Abrir");
		menu.add(abrir);
		//Creamos submenu con dos archivos
		UTF8=new JMenuItem("El Quijote UTF8");
		Windows=new JMenuItem("El Quijote Windows-1252");
		abrir.add(UTF8);
		abrir.add(Windows);
		Evento evento=new Evento();
		UTF8.addActionListener(evento);
		Windows.addActionListener(evento);
		
		
	}
	
	class Evento implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==UTF8) {
				File archivo=new File("c:\\pruebas\\ElQuijote-UTF8.txt");
				leerArchivo(archivo);
			}else {
				File archivo=new File("c:\\pruebas\\ElQuijoteWindows-1252.txt");
				leerArchivo(archivo);
			}
			
			
			
		}
		
		public void leerArchivo(File archivo){
			try {
				FileReader fr=new FileReader(archivo);
				BufferedReader br=new BufferedReader(fr);
				System.out.println(br.readLine());
				br.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
	
	
	
}

