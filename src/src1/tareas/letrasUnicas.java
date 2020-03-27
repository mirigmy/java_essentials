package src1.tareas;

import libs.Input;

public class letrasUnicas {

	public static void main(String[] args) {
		String nombre;
		System.out.println("Vamos a imprimir te un nombre las letras no repetidas");
		System.out.print("¿Cuál es tu nombre?");
		nombre = Input.get_string();
		char[] caracteresNombre = nombre.toCharArray();
		int numCaracteres = caracteresNombre.length;
		char[] letrasUnicas = new char[numCaracteres];
			
		for (int i = 0; i < numCaracteres; i++) {
			char actual = caracteresNombre [i];
			int posicionCaracActual = searchCharActual (actual, letrasUnicas);
			if (posicionCaracActual <0 ) {
				System.out.println(actual);
				letrasUnicas [i] = actual;
			}
			
		}

	}

	private static int searchCharActual(char actual, char[] letrasUnicas) {
		for (int i = 0; i < letrasUnicas.length;) {
		return i;
		}
	
	return -1;
}
}