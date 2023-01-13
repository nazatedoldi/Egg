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
public class ej1 {
  /* Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma*/
    
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        System.out.println("Ingrese otro número");
        int num2 = leer.nextInt();
        int suma = num + num2;
        int rest = 0;
        System.out.println("La suma es " +suma);
    }
    
}
