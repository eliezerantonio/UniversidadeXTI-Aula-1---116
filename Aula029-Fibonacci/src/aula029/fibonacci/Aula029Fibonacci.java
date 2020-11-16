/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula029.fibonacci;

/**
 *
 * @author eliezer
 */
public class Aula029Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int anterior = 1;
        int proximo = 1;
        System.out.print(anterior);


        while (proximo < 50) {
            System.out.print(","+proximo);
            proximo = proximo + anterior;
            anterior = proximo -anterior;
        }
    }

}
