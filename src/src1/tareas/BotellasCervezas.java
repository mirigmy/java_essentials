package src1.tareas;

public class BotellasCervezas {
	
		   public static void main (String[] args) {
////		     int beerNum = 99;
//		     String word = "bottles";
//
//		   while (beerNum > 0) {
//
//		      if (beerNum == 1) {
//		        word = "bottle"; // singular, as in ONE bottle.
//		      }
//
//		      System.out.println(beerNum + " " + word + " of beer on the wall");
//		      System.out.println(beerNum + " " + word + " of beer.");
//		      System.out.println("Take one down.");
//		      System.out.println("Pass it around.");
//		      beerNum = beerNum - 1;
//
//		      if (beerNum > 0) {
//		         System.out.println(beerNum + " " + word + " of beer on the wall");
//		      } else {
//		         System.out.println("No more bottles of beer on the wall");
//		     } 


// VAMOS A HACER LAS MISMAS BOTELLAS PERO AL REVES!!!
		  
		   int cerveza = 1;
		   String chela = "chelas";
		   
		   while (cerveza <= 99) {

		      if (cerveza == 1) {
		        chela = "chela"; 
		      }

		      System.out.println(cerveza + " " + chela + " tomaste de la pared");
		      System.out.println(cerveza + " " + chela + " ya te terminaste");
		      System.out.println("Ya te la acabaste entonces...");
		      System.out.println("Tomate otra");
		      cerveza = cerveza + 1;

		      //if (cerveza == 99) {
		      //   System.out.println(cerveza + " " + chela + " tomaste de la pared");
		      //} else 
		      if (cerveza < 99) {
		         System.out.println("Tu sigue tomando cerveza");
		     } 
		      else {
		    	  System.out.println("YA TOMASTE UN MONTON!!!");
		      }
		      // end else
		   } // end while loop
		 } // end main method
		   }



		