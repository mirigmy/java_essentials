package hChars;

import libs.Input;

public class Ascii {

	public static void main(String[] args) { // este programa tambien es un ciclo que inicia con for
	    for (int i = 65; i < 65 + 26; i++) // nos dice que nuestro objeto "i" empieza con el número 65 y este es igual a esa cantidad y menor a 91, va a sumar dos 
	    {
	        Input.print((char) i + " is " + i + "\n"); // char puede hacer que se convierta en letras y apartir de la 65 en adelante es el abecedario con letras la salida de esta ejecución es que nos va a poner la variable "char" que en este caso son las
	        											// letras del abecedario mas la palabra is y comienza con el numero 65 y lo va a ir sumando
	        											// hasta que llegue al numero 91
	    }

	}

}
