package gNumericTypes;

import libs.Input;

public class Ints {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is "); // imprime en pantalla "x is" y puedes ponerle un número
	    int x = Input.get_int(); // ingresas el número y le tienes que dar enter para que se guarde la informacion
	    
	    // prompt user for y
	    System.out.print("y is "); // te imprime el "y is" para que pongas un numero
	    int y = Input.get_int(); // pones el número en pantalla, le das enter y se guarda
	    
	    // perform calculations for user
	    System.out.print(x + " plus " + y + " is " + (x + y) + "\n"); // te imprime el resultado de la suma de tus numeros de "x" y "y"
	    System.out.print(x + " minus " + y + " is " + (x - y) + "\n"); // te imprime el resultado de la resta de tus numeros de "x" y "y"
	    System.out.print(x + " times " + y + " is " + (x * y) + "\n"); // te imprime el resultado de la multiplicacion de tus numeros de "x" y "y"
	    System.out.print(x + " divided by " + y + " is " + (x / y) + "\n"); // te imprime el resultado de la división de tus numeros de "x" y "y"
	    System.out.print("The remainder of " + x + " over "+ y + " is " + (x % y) + "\n"); // imprime un mensaje donde te da lo que le pusiste en x otro mensaje y luego lo que corresponde a "y"
	    																				// y luego otro mensaje que te dice is y luego te manda el resultado en porcentaje de tu numero x y tu numero y	
	}																					// esto es una division entera
}


