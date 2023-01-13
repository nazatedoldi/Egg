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
public class ej5 {
/*  Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número.   */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
           System.out.println("Ingrese un número");
           double num = leer.nextInt();
           System.out.println("El doble es " +2*num);
           System.out.println("El triple es " +3*num);
           System.out.println("La raiz redondeada " +Math.sqrt(num));
           
    }
    
}
