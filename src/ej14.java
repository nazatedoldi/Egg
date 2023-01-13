
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
public class ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cantidad en euros");
        double euros = leer.nextInt();
        
                double lib = euros*0.86;
                System.out.println(+euros+ " equivale a " +lib+ " libras");
               
                double peso = euros*1.28611;
                System.out.println(+euros+ " equivale a " +peso+ " pesos");
                
                double yenes = euros*129.852;
                System.out.println(+euros+ " equivale a " +yenes+ " yenes");
                
                
        }
    }
    

