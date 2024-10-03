package com.generation;

import java.util.Scanner;//se importa Scanner

/**
 * Esta aplicación crea un arreglo de 20 números aleatorios y
 * permite al usuario resaltar los múltiplos de 5
 * o de 7
 */
public class código6 {
	  public static void main(String[] args) {//se agrega método main
		  int[] n = new int[20];// se agrega new

		    for (int i = 0; i < n.length; i++) {// se corrige sintaxis n.lenght para que no sea un valor fijo
		      n[i] = (int)(Math.random() * 381) + 20;
		      System.out.print(n[i] + " "); // se añade .out
		    }
		    
		    System.out.println("\n¿Qué números quiere resaltar? ");// se corrige sintaxis (ln)
		    System.out.print("(opción 1 – los múltiplos de CINCO, opción 2 – los múltiplos de SIETE): ");//se modifica a letras para que sea más claro
		    
		    Scanner sc = new Scanner(System.in);
	        int opcion = sc.nextInt();  // Se cambia a Scanner para leer la opción porque System.console arrojaba null
//		    int opcion = Integer.parseInt(System.console().readLine());// se corrige sintaxis ")"

		    int multiplo = (opcion == 1) ? 5 : 7;// se corrige sintaxis de operador ternario

		    for (int e : n) {//se corrige sintaxis (for) y se corrige el tipo de dato a int
		      if (e % multiplo == 0) {
		        System.out.print("[" + e + "] ");
		      } else {// se corrige sintaxis (})
		        System.out.print(e + " ");//se corrige sintaxis (.out)
		      }
		    }
	}
  
  
}//class6