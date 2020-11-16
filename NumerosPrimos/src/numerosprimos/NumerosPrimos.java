/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos;

/**
 *
 * @author eliezer
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
       
        int i = 500;
        while (i >= 500) {
            int j = i, contador = 0;
            while (j > 1) {
                if (i % j == 0) {
                    contador++;
                    j--;
                }
                if (contador == 0) {
                }
                System.out.println("numero: " + i);

                i--;

            }
        }

    }
}
