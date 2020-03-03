package src1.tareas;

import libs.Input;

public class botellasAgua {

	public static void main(String[] args) {
		System.out.println("Hola: \nMe puedes decir cuánto tiempo tardas en bañarte? ");
		int minutos;
		minutos = Input.get_possitive_int();
		int botellasAgua;
		botellasAgua = minutos * 12;
		System.out.print("Aah tu gastas: " + botellasAgua + " botellas de agua");
	}

}
