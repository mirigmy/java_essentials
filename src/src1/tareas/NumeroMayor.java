package src1.tareas;

import libs.Input;

public class NumeroMayor {

	public static void main(String[] args) {
		System.out.print("Dame un numero del 1 al 10");
		int numero1 = Input.get_int();
		System.out.print("Dame otro numero del 1 al 10");
		int numero2 = Input.get_int();
		
		if (numero1 > numero2) {
			System.out.print(numero1 + " Es tu numero mayor");
		}
		if (numero1 < numero2) {
			System.out.print(numero2 + " Es tu numero mayor");
		}
		else {
			System.out.print("Te dije que escribieras numeros diferentes");
		}
			
		
	}

}
