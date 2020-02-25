package gNumericTypes;

import libs.Input;

public class Adder {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is: "); //esta linea imprime al usuario x
	    int x = Input.get_int(); // para que le escribas a la consola el numero x
	    
	    // prompt user for y
	    System.out.print("y is: ");
	    int y = Input.get_int(); //esta linea imprime al usuario y
	    
	    // calculate sum for user
	    System.out.println("sum is " + (x + y) + "\n");   //suma x y y
	} //te arroja el resultado
	
}