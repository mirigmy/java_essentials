package classsExcercicse;

import libs.Input;

public class CicloWhile {

	public static void main(String[] args) {
		int contador = 2;
		
		while (contador <= 15) {
			Input.print (contador + " ");
			contador = contador + 2;
		}
		
		String espacio = " ";
		int contador1 = 2;
		
		while (contador1 <= 15) {
					Input.print (" " + espacio + contador1);
					contador1 = contador1 + 2;
					
				}
	}

}
