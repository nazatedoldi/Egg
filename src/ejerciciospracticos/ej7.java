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
public class ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese una frase");
         String frase = leer.nextLine();
         String frase1 = "eureka";
     if(frase.equals(frase1)) {
         System.out.println("La frase es correcta");
     }else{
         System.out.println("La frase es incorrecta");
     }     
    }
    
}
