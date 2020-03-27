package src1.tareas;

public class EjemploMovie {

	public static void main(String[] args) {
		Movies m = new Movies();
		m.titulo = "Lord of the Rings";
		m.genero = "Fantasia";
		m.duracion = 3;
		m.inicio();
		m.pelicula();
	
	
		Movies b = new Movies();
		b.titulo = "Bahubali";
		b.genero = "Fantasia";
		b.duracion = 4;	
		b.inicio();
		b.pelicula();
	}
}
