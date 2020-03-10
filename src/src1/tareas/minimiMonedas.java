package src1.tareas;

import libs.Input;

/* 1. Pedir al usuario el cambio total: double
 * 2. Multiplicar al usuario por 100 tener: int
 * 3. Dividirlo ente la moneda mas alta, sacar cuantas monedas
 * 4. Calcular el residuo
 * 5. El residuo dividirlo entre la sig. moneda, sacar cuantas monedas
 * 6. Sacar el residuoo con la moneda del 10c
 * 7. Resudyi dividirlo entre las monedas y sacar las monedas
 * 8. Calcular el residuo de la siguiente moneda
 * 9. El residuo es el numero de monesdas de 1c, sacar cuantas monedas
 * 10. Sacar todas las monedas
 * 11. Imprimirlo
 * 
 * Tarea: implementar que get.positive input y negative input
 */
public class minimiMonedas {

	public static void main(String[] args) {
		System.out.println("Por favor dame el cambio: ");
		double cambioTotal = Input.get_possitive_double();
		int cambioCentavos = (int) (cambioTotal * 100);
		int moneda1 = 25;
		int moneda2 = 10;
		int moneda3 = 5;
		int moneda4 = 1;
		int numMonedas1 = cambioCentavos / moneda1;
		int residuo = cambioCentavos % moneda1;
		int numMonedas2 = residuo / moneda2;
		residuo = residuo % moneda2;
		int numMonedas3 = residuo / moneda3;
		residuo = residuo % moneda3;
		int numMonedas4 = residuo / moneda4;
		residuo = residuo % moneda4;		
		int numeroTotalMonedas = (numMonedas1 + numMonedas2 + numMonedas3 + numMonedas4);
		System.out.println("Total de cambio: " + numeroTotalMonedas);
		

	}

}
