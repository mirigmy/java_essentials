package fHelloWorld;

import libs.Input;

public class Hello2 {

	public static void main(String args[])
	{
		System.out.print("Dame tu nombre "); // imprime en la pantalla Dame tu nombre y tu le puedes escribir tu nombre
		String name = Input.get_string(); // no se ve que hace en pantalla pero guarda lo que tu le escribiste en la linea anterior, es decir, el Miri
		System.out.println("hello, "+ name + "\n");   // imprime en pantalla tu nombre y te dice hola
	}
}