package gNumericTypes;

import libs.Input;

public class Floats {

	public static void main(String args[]) // son numeros estaticos, no imprime nada en pantalla
	{
		// prompt user for x
		System.out.print("x is "); // imprime en pantalla "x" aqui puedo agregar núros decimales
	    float x = Input.get_float(); // para que se guarde el input necesito darle enter 
	    
	    // prompt user for y
	    System.out.print("y is ");
	    float y = Input.get_float(); // ya guardado vuelvo a correr el paso y puedo poner el "y" otra ves con números decimales
	    							// necesito darle enter para que se guarden los cambios
	    // perform division for user
	    System.out.print(x + " divided by " + y + " is " + ( x / y) + "\n"); // corres de nuevo esta linea para que te muestre el resultado
	}
}


