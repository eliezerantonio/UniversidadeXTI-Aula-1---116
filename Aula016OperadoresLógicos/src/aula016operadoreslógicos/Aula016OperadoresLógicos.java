/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula016operadoreslógicos;

import java.util.Scanner;

/**
 *
 * @author eliezer
 */
public class Aula016OperadoresLógicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a = 2;
        System.out.println((a == 2) && (2 == 1));
        System.out.println(a == 2 || 2 == 1);

        System.out.println("--------------------------------------");

        System.out.println("Digite um numero para tabuada");
        int numero = new Scanner(System.in).nextInt();

        for (int i = 2; i < 12; i++) {

            int resultado = i * numero;

            System.out.println(i + " * " + numero + " = " + resultado);

        }

    }

}
