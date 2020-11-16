/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula027foreach;

/**
 *
 * @author eliezer
 */
public class Aula027foreach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pares[] = {9, 2, 3, 4, 6};

        System.out.println("For Tradicional ");

        for (int i = 0; i < pares.length; i++) {
            int par = pares[i];
            System.out.println(par);
        }
        
        System.out.println("Forach ou for aprimorado");
        
        for (int par :pares){
            System.out.println(par);
        }

    }

}
