package src1.tareas;

import libs.Input;

public class Buggy1 {

	public static void main(String[] args) {
		// System.out.print("Por favor escribe un número entero negativo: ");
	    int i = get_negative_int();
	    Input.print(i + " is a negative integer\n");
	}
/* Todas las siguientes líneas de código se usan para realizar una funcion, este caso viene siendo ingresar el numero */
	
	public static int get_negative_int()
	{
	    int n;
	    do
	    {
	        Input.print("Por favor escribe un número entero negativo: ");
	        n = Input.get_int(); //Esta funcion da el valor que dio el usuario
	        if (n >= 0) {
	        	System.out.println(n + " no es negativo!!");
	        }
	    }
	        
	    while (n >= 0);
	    return n;
	}
}
