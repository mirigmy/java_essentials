package src1.tareas;

public class MixedMessages {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		while (x < 5) {
			//Mensaje 1
			//y = x -y; // Resultado 00 11 21 32 42 
			
			//Mensaje 2
			 //y = y + x; // Resultado 00 11 23 36 410 
			
			// Mensaje 3
			/*  y = y +2;
			if (y > 4) { // Resultado 02 14 25 36 47 
				y = y -1;
			} */
			
			// Mensaje 4
		/*	 x = x + 1;
			y = y + x; // Resultado 11 34 59    */
			
			// Mensaje 5
			if (y < 5) {
				x = x + 1; // Resultado 02 14 36 48 
				if (y <3) {
					x = x -1;
				}
			}
			
			y = y + 2; 
			
			System.out.print(x + "" + y + " ");
			x = x + 1;
		}
		

	}

}
