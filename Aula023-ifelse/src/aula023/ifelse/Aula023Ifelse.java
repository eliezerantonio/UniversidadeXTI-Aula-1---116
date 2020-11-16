/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula023.ifelse;

import java.util.Random;

/**
 *
 * @author eliezer
 */
public class Aula023Ifelse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int numero = r.nextInt(10);
        System.out.println(numero);
        if (numero % 2 == 0) {
            System.out.println("Par");

        } else {
            System.out.println("Impar");
        }

        System.out.println("---------------------------------");
        int idades[] = new int[110];

        int idade = r.nextInt(idades.length);
        if (idade <= 17) {
            System.out.println("idade " + idade + " então é Crianca");
        } else if (idade > 18 && idade < 70) {
            System.out.println("idade " + idade + " então é Adulto ");
        } else {
            System.out.println("idade " + idade + " então é Idoso");
        }

    }

}
