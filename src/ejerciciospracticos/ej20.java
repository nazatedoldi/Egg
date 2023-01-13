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
public class ej20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Una matriz mágica es aquella donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Este programa ha sido creado para que usted verifique si una matriz de 3x3 es mágica o no.");
        int matriz[][] = new int[3][3];
        int sumas_columnas[] = new int[matriz.length];
        int suma_filas = 0;
        int suma_diagonales = 0;
        int acumulador = 0;
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese los datos de la fila " +(i+1)+ ":");
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=leer.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
                suma_filas += matriz[i][j];
                sumas_columnas[i] += matriz[j][i];
            }
            System.out.print("= " +suma_filas);
            System.out.println("");
            suma_filas = 0;     
        }
        System.out.println(Arrays.toString(sumas_columnas));
        for (int i = 0; i < 3; i++) {
              suma_diagonales += matriz[i][i];  
              acumulador = acumulador + matriz[i][i];
        }
        System.out.print("La diagonal arroja como resultado un número = " +acumulador);
        System.out.println("");
        } 
        }
   

