/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nazarenoagustintedoldi
 */
public class ej19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        int matrizT[][] = new int[3][3];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese los datos de la fila " +(i+1));
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=leer.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizT[j][i] = matriz[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizT[j][i] = -matriz[i][j];
                
    }
        }
        if(Arrays.deepEquals(matriz, matrizT)) {
            System.out.println("Es una matriz antisimétrica.");     
        } else {
            System.out.println("No es una matriz antisimetrica.");
        }
    }
}

