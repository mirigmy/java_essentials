package gNumericTypes;

import libs.Input;

public class EjemploFloat {

	public static void main(String[] args) { // no se ve que haga nada pero si tu pones dos n�meros te da el resultado de la divisi�n
		float f = Input.get_float(); // tu en pantalla le puedes poner un numero le puedes poner decimales
		
		float f2 = Input.get_float(); // sin necesidad de que te pregunte puedes dar otro n�mero y tambien puede ser decimal
		
		Input.print("f/f2 = " + (f/f2)); // en la pantalla ves el resultado de los n�meros anteriormente proporccionados

	}

}
