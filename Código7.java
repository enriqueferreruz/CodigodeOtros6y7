package com.generation;
import java.util.HashMap;
/*
 * Lo que intenta la aplicación es crear un hashmap y permitir que el usuario ingrese un país para devolverle 
 * su capital; asimismo, si este país/capital son desconocidos en el hashmap, crear la posibilidad de que
 * el usuario sume estos nuevos k y v al mapa
 */
import java.util.Scanner;

public class Código7 {
    public static final Scanner s = new Scanner(System.in);//hace falta hacer import de java.util, asimismo agregar System.in

    public static final HashMap<String, String> capitales = new HashMap<>();//se importa java.util; asimismo, se modifican los wrappers; se modifica nombre del map
     static {//se agrega static para hacer funcionar el método put
    capitales.put("Canadá", "Ottawa" );
    capitales.put("USA", "Washington");
    capitales.put("Estados Unidos", "Washington DC");
    capitales.put("México", "México DF");
    capitales.put("Belice", "Belmopán");
    capitales.put("Costa rica", "San José");
    capitales.put("El Salvador", "San Salvador");// se agrega v
    capitales.put("Guatemala", "Ciudad de Guatemala");
    capitales.put("Honduras", "Tegucigalpa");
    capitales.put("Nicaragua", "Managua");
    capitales.put("Panamá", "Panamá");
     }
    public static void main(String[] args) {//se agrega mét main
    	 String c = " ";//se corrige error de dedo
    			    do {
    			      System.out.print("Escribe el nombre de un país y te diré su capital: ");//se corrige error de dedo "in" a "out"
    			      c = s.nextLine();//se modifica por string
    			      
    			      if (!c.equalsIgnoreCase("salir")) {//se corrige error de dedo por "equals", "ignoreCase" para mejorar experiencia de usuario
    			        if (capitales.containsKey(c)) {//se agrega containsKey 
    			          System.out.print("La capital de " + c);//se agrega .out
    			          System.out.println(" es " + capitales.get(c));//se agrega capitales.get
    			        } else {
    			          System.out.print("No conozco la respuesta ");
    			          System.out.print("¿cuál es la capital de " + c + "?: ");
    			          String ca = s.nextLine();
    			          capitales.put(c, ca);
    			          System.out.println("Gracias por enseñarme nuevas capitales");
    			        }
    			      }
    			    } while (!c.equalsIgnoreCase("salir") );//se corrige error de dedo; se añade IgnoreCase
    			  }//main
}//class7
    
