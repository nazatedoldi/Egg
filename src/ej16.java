
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nazarenoagustintedoldi
 */
public class ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector;
        System.out.println("Ingrese un tamaño del vector");
        int N = leer.nextInt();
        vector = new int [N];
        System.out.println("Ingrese los valores del vector de tamaño " +vector.length+":");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("v["+i+"]=");
            vector[i] = leer.nextInt();
        }
        System.out.println("Ingrese un número a buscar");
        int num = leer.nextInt();
        for (int i = 0; i < vector.length; i++) {
        if (num == vector[i]) {
            System.out.println("El numero se encuentra en la posición "+i);
        }
        if (num != vector[i]) {
            System.out.println("No se encuentra el numero");
        }
        } 
            
        }
    } 


