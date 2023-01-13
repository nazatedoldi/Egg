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
public class ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor límite:");   
        int limite = leer.nextInt();
        while (limite < 0) {
            System.out.println("Debe ser un límite positivo. Inténtenlo nuevamente.");
            break;
        }
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        int suma = num;
        while (suma < limite) {
            System.out.println("Ingrese otro numero");
            int numero = leer.nextInt();
            suma += numero;   
        } System.out.println("Ha superado el valor límite. La suma es " +suma);
    
         /*    if (num > limite) {
                break;
            }
            System.out.println("Ingrese otro número");
            int num2 = leer.nextInt();
            int suma = num + num2; */
            
            
         
        }
    }
