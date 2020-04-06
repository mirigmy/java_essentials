package src1.tareas;

public class EjemploMovie {

	public static void main(String[] args) {
		Movies m = new Movies(); // Instancia es cuando creas una variable de tipo algo 
		m.titulo = "Lord of the Rings"; 
		m.genero = "Fantasia";
		m.duracion = 3;
		m.iniciarPelicula();
		m.reproducir();
	
	
		Movies b = new Movies(); // Instancia es cuando creas una variable de tipo algo 
		b.titulo = "Bahubali";
		b.genero = "Fantasia";
		b.duracion = 4;	
		b.iniciarPelicula();
		b.reproducir();
	}
}
