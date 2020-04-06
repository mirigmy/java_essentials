package src1.tareas;

public class Movies {
	String titulo; // atributos, miembros o camposde la clase
	String genero;
	int duracion;
	
	public void iniciarPelicula() { // metodo el comportamiento de la clase
		System.out.println ("Inicia la pelicula");
	}
	public void reproducir() {
		System.out.println ("Vas a ver la peli: " + titulo);
		System.out.println ("");
	}
}
