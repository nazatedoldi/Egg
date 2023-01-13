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
public class ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo");
        int num = leer.nextInt();
        System.out.println("Ingrese otro número entero positivo");
        int num2 = leer.nextInt();
        int suma = num + num2;
        int resta = num - num2;
        int multiplicar = num*num2;
        int dividir = num/num2;
        System.out.println("Elija una opción del siguiente menú ");
        System.out.println(" "
                + " 1) SUMAR "
                + " 2) RESTAR "
                + " 3) MULTIPLICAR "
                + " 4) DIVIDIR "
                + " 5) SALIR ");
        int op = leer.nextInt();
        if (op == 5) {
            System.out.println("¿Está seguro que desea salir del programa? (S/N)");
            String resp = leer.nextLine();
            if (resp == "S") {
                System.out.println("Hasta luego");
            } else {
                System.out.println("Vuelva a ingresar dos  números  y elegir una opción del menú");
            }
        }
        switch (op) {
            case 1:
                System.out.println("La suma de los números es " +suma);
                break;
            case 2:
                System.out.println("La resta de los números es " +resta);
                break;
            case 3:
                System.out.println("La multplicación de los números es " +multiplicar);
                break;
            case 4:
                System.out.println("La division de los números es " +dividir);
                break;
        }
            
                  
                
        }
    }


          
                
                
        
        
        
    
        
    

