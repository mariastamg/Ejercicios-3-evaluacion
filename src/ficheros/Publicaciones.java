package ficheros;

import java.io.Serializable;

public class Publicaciones implements Serializable {
	
	int codigo;
	String titulo;
	int anyoPublicacion;
	
	public Publicaciones(int codigo, String titulo, int anyoPublicacion) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.anyoPublicacion = anyoPublicacion;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnyoPublicacion() {
		return anyoPublicacion;
	}

	public void setAnyoPublicacion(int anyoPublicacion) {
		this.anyoPublicacion = anyoPublicacion;
	}

	@Override
	public String toString() {
		return "Publicaciones [codigo=" + codigo + ", titulo=" + titulo + ", anyoPublicacion=" + anyoPublicacion
				+ "]";
	}
	
	
}

