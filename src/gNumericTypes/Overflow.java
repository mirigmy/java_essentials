package gNumericTypes;

public class Overflow {

	public static void main(String args[])
	{
		int n = 1; // quei me dice que n es un numero entero que tiene un valor de 1
	    for (int i = 0; i < 32; i++) // manda llamar un for (ciclo) donde la variable i comienza en 0 y si variable i es menor a 64 entonces la variable i a¿va a aumentar 1 ves y se ejecuta la siguiente linea
	    {
	    	System.out.print("i: " + i +" "+ n + "\n"); // imprime nuestro objeto n y su valor y agrega adems una linea adicional
	        n = n * 2; // mi objeto n le da el numero inicial y lo multiplica por 2
	        			// como inicie un ciclo se va a ejecutar hasta que sea igual o mayor a 64...
	        			// se sale del numero de cifras que contiene la calculadora, por eso se hace de forma negativa
	    }
	}
}



