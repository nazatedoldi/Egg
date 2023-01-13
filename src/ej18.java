
import java.util.Random;
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
public class ej18 {

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
        System.out.println("La matriz traspuesta es ");
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizT[i][j] + "\t");
            }
             System.out.println("");
         }
    }
    
    }



