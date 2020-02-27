package hChars;

import libs.Input;

public class Ascii2 { //en esta parte mandamos llamar nuestro programa anterior o bien hacer la clase Ascii2

	public static void main(String[] args) {
		for (char c = 'A'; c <= 'Z'; c++) //el caracter se convierte en numero vamos a ejecutar un ciclo usando "char" donde nuestro objeto c, sera la letra A, entonces si A es menor o igual a Z se va a seguir ejecutando y sumando la siguiente letra
											// en este caso manda llamar la clase anterior Ascii2 (donde A tendra el valor de 65 hasta llegar a 90
	    {
	        Input.print(c + " is " + (int) c + "\n" ); // nos va a imprimir la letra el mensaje is nuestro numero y enviar al siguiente renglon
	    }

	}

}
