/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula053exception.pkgtry.pkgcatch.e.pkgfinally;

import java.util.InputMismatchException;
import java.util.Scanner;
import sun.awt.CausedFocusEvent;

/**
 *
 * @author eliezer
 */
public class Aula053ExceptionTryCatchEFinally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean continua = true;
        do {
            try {
             
                System.out.println("Digite o numero");
                int numero = new Scanner(System.in).nextInt();
                System.out.println("Digite o divisor");
                int divisor = new Scanner(System.in).nextInt();
                int resultado;

                System.out.println(resultado = numero / divisor);
                continua = false;
            } catch (ArithmeticException e) {

                System.err.println("Não pode dividir por zero");

            } catch (InputMismatchException a) {

                System.err.println("Apenas numero inteiros");

            } finally {
                System.out.println("Executado");
            }

        } while (continua = true);

    }

}
