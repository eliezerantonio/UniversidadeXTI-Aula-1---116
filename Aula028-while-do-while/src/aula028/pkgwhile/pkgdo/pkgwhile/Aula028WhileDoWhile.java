/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula028.pkgwhile.pkgdo.pkgwhile;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author eliezer
 */
public class Aula028WhileDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 0;
        while (n < 4) {
            System.out.println(n);
            n++;
        }

        do {
            System.out.println(n);
            n++;
        } while (n < 4);
        System.out.println("--------------------------------------------");
        ArrayList<String> lista = new ArrayList<>();
        String produto;

        System.out.println("Digite seus produtos para sair digite FIM");

        while (!"FIM".equals(produto = new Scanner(System.in).nextLine())) {

            lista.add(produto);
            //  System.out.println(produto);

        }
        System.out.println(lista.toString());
    }

}
