package gNumericTypes;

import libs.Input;

public class EjemploFloat {

	public static void main(String[] args) { // no se ve que haga nada pero si tu pones dos números te da el resultado de la división
		float f = Input.get_float(); // tu en pantalla le puedes poner un numero le puedes poner decimales
		
		float f2 = Input.get_float(); // sin necesidad de que te pregunte puedes dar otro número y tambien puede ser decimal
		
		Input.print("f/f2 = " + (f/f2)); // en la pantalla ves el resultado de los números anteriormente proporccionados

	}

}
