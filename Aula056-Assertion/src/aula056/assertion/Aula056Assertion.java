/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula056.assertion;

import java.util.Scanner;

/**
 *
 * @author eliezer
 */
public class Aula056Assertion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Digite um numero de 1-10");
        int numero = new Scanner(System.in).nextInt();

        assert (numero <= 0 && numero > 10) : "numero Invalido";
        System.out.println("---------------------");
        System.out.println(numero);
    }

}
