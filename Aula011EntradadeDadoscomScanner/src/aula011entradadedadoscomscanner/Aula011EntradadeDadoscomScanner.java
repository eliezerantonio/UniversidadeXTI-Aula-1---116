/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula011entradadedadoscomscanner;

import java.util.Scanner;

/**
 *
 * @author eliezer
 */
public class Aula011EntradadeDadoscomScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;

        System.out.println(" Digite o nome ");
        nome = ler.nextLine();

        System.out.println("O nome é: " + nome);

    }

}
