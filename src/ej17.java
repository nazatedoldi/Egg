
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
public class ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector;
        int num_cifras = 1;
        System.out.println("Ingrese un tamaño del vector");
        int N = leer.nextInt();
        vector = new int [N];
        System.out.println("Ingrese los valores del vector de tamaño " +vector.length+":");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("v["+i+"]=");
            vector[i] = leer.nextInt();
        while (vector[i] >= 10) {
            vector[i] = vector[i]/10;
            num_cifras ++;
        } System.out.println(+num_cifras);    
        
        } 
    }
    
}
