package src1.tareas;

public class EjemploLibroJava {

	// EJEMPLO DE WHILE

	public static void main(String[] args) {
		// Primero se declaran valores
		
			int x = 1; // Declaramos un integer llamado name que vale 1

			System.out.println("imprimir algo antes del loop"); // imprimimos en pantalla un mensaje
			while (x < 4) { //creamos un loop - mientras la variable x sea menor a 4 va a entrar al ciclo
				System.out.print("Estamos dentro del loop. "); // Imprime en pantalla el mensaje 1 la primera ves que entra y como es println, el mensaje se imprime en siguiente linea
				System.out.println("Valor del loop: " + x); // Imprime el mensaje y el valor de x
				// Primer ciclo: la variable x tiene el valor de 1, entonces mandamos imprimir
				// Estamos dentro del loop y el valor del mensaje
				x = x +1;	// Incrementamos el valor de x (en este caso 1 mas) para salir del loop		
			}
			// Mientras el valor de x sea menor a 4 va a imprimir en pantalla los mensajes y ademas el valor se ira incrementando
			System.out.println("Se imprime despues del loop"); // imprimimos en pantalla este mensaje
		

		{
			System.out.println(" ");
		}	

		// CAMBIA EL EJEMPLO Y PONLE == PREGRUNTAA!!!! EN EL LIBRO DICE QUE SI PONEMOS WHILE (X1 == 4) {} APARECE UN TRUE PORQUE NO ESTA!!!!
		
			System.out.println("Nuevo ejemplo de loop pero vas a ponerle == ");
			
			while (x == 4) {

				System.out.print("Estamos dentro del loop. "); 
				System.out.println("Valor del loop: " + x); 
				x = x +1;	
			}

			System.out.println("Salimos de este loop"); 
		

	}
}