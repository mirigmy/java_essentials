package src1.tareas;

import libs.Input;

public class botellasAgua {

	public static void main(String[] args) {
		System.out.print("Hola: Me puedes decir cu�nto tiempo tardas en ba�arte? ");
		int minutos;
		minutos = Input.get_int();
		int botellasAgua;
		botellasAgua = minutos * 12;
		System.out.print("Aah tu gastas: " + botellasAgua + " botellas de agua");
	}

}
