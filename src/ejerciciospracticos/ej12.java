/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;

import java.util.Scanner;

/**
 *
 * @author nazarenoagustintedoldi
 */
public class ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int correctas = 0, incorrectas = 0, longitud=0, aux2=0;
        System.out.println("Ingrese una cadena de 5 caracteres");
        System.out.println("El primer caracter debe tener una X y la última una O");
        String cadena = leer.nextLine();
        while (!cadena.equals("&&&&&")) {
            longitud = (cadena.length());
            if(cadena.substring(0,1).equalsIgnoreCase("x") && (cadena.endsWith("o")) && longitud == 5) {
              correctas++;
            } else {
                incorrectas++;
            }
            System.out.println("Ingrese una cadena de caracteres correctas");
            cadena = leer.nextLine();
        }
        System.out.println("Cadenas correctas: " +correctas);   
        System.out.println("Cadenas incorrectas " +incorrectas);
    }
    
}
