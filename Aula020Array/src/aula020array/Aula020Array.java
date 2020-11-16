/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula020array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author eliezer
 */
public class Aula020Array {

    public static void main(String[] args) {

        String[] paises = {"Angola", "Zambia", "Namibia", "Egipto"};
        System.out.println("Mostrando cada numero");
        System.out.println(paises[0]);
        System.out.println(paises[1]);
        System.out.println(paises[2]);
        System.out.println(paises[3]);
        System.out.println("Mostrando o total de elementos no array");
        System.out.println(paises.length);
        System.out.println("Mostrando todos elementso no array");
        System.out.println(Arrays.toString(paises));
        System.out.println("------------------------------------------");
        int[] numeros = new int[3];

        numeros[0] = 20;
        numeros[1] = 50;
        numeros[2] = 10;
        System.out.println("Mostrando cada numero");
        System.out.println(numeros[0] + "\n" + numeros[1] + "\n" + numeros[2]);
        System.out.println("Mostrando o total de elementos no array");
        System.out.println(numeros.length);
        System.out.println("Mostrando todos elementso no array");
        System.out.println(Arrays.toString(numeros));
    }

}
