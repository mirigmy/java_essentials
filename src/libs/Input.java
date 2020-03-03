package libs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
	public int sx;
	public static Scanner sc = new Scanner(System.in);

	public static int get_int() {
		Integer retInt = Integer.MAX_VALUE;
		while(retInt.equals(Integer.MAX_VALUE)) {
			try {
				int i = sc.nextInt();
				retInt = i;
			}catch(InputMismatchException ime) {
				System.out.println("Wrong format for integer. input a correct integer: ");
				sc = new Scanner(System.in);
			}
		}
		return retInt;
	}

	public static float get_float() {
		Float retFloat = Float.MAX_VALUE;
		while(retFloat.equals(Float.MAX_VALUE)) {
			try {
				float f = sc.nextFloat();
				retFloat = f;
			}catch(InputMismatchException ime) {
				System.out.println("Wrong format for float. input correct float: ");
				sc = new Scanner(System.in);
			}
		}
		return retFloat;
	}

	public static char get_char() {
		Character retChar = Character.MAX_VALUE;
		while(retChar.equals(Character.MAX_VALUE)) {
			try {
				String s = sc.next();
				retChar = s.charAt(0);
			}catch(InputMismatchException ime) {
				System.out.println("Wrong format for float. input correct float: ");
				sc = new Scanner(System.in);
			}
		}
		return retChar;
	}

	public static String get_string() {
		String retStr = "";
		while(retStr.equals("")) {
			try {
				String s = sc.nextLine();
				retStr = s;
			}catch(InputMismatchException ime) {
				System.out.println("Wrong format for float. input correct float: ");
				sc = new Scanner(System.in);
			}
		}
		return retStr;
	}

	public static void print(String s) {
		System.out.print(s);
	}

	public static void print(int i) {
		System.out.print(i);
	}

	public static void print(float f) {
		System.out.print(f);
	}

	public static void print(double d) {
		System.out.print(d);
	}
	
	public static void print(char c) {
		System.out.print(c);
	}

	public static double get_double() {
		Double retDouble = Double.MAX_VALUE;
		while(retDouble.equals(Double.MAX_VALUE)) {
			try {
				double d = sc.nextDouble();
				retDouble = d;
			}catch(InputMismatchException ime) {
				System.out.println("Wrong format for float. input correct double: ");
				sc = new Scanner(System.in);
			}
		}
		return retDouble;
	}

	public static void print(String[] split) {
		for(int i = 0; i < split.length; i++) {
			print(split[i] + "\n");
		}
		
	}

	public static int get_negative_int()
	{
	    int n;
	    do
	    {
	        Input.print("Por favor escribe un n�mero entero negativo: ");
	        n = Input.get_int(); //Esta funcion da el valor que dio el usuario
	        if (n >= 0) {
	        	System.out.println(n + " no es negativo!!");
	        }
	    }
	        
	    while (n >= 0);
	    return n;
	}
	public static int get_possitive_int()
	{
	    int n;
	    do
	    {
	        Input.print("Por favor escribe un n�mero entero positivo: ");
	        n = Input.get_int(); //Esta funcion da el valor que dio el usuario
	        if (n < 0) {
	        	System.out.println(n + " no es postivo!!");
	        }
	    }
	        
	    while (n < 0);
	    return n;
	}


}
