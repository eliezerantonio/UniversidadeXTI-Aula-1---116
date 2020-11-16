/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula054exception.multi.pkgcatch.stacktrace.e.pkgthrows;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author eliezer
 */
public class Aula054ExceptionMultiCatchStacktraceEThrows {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean continua = true;

        while (continua) {

            try {
               dividir();
                continua = false;
            } catch (ArithmeticException  | InputMismatchException c) {//MultiCatch
                System.err.println(" Apenas operacoes validas" );
                c.printStackTrace(); //StackTrace imprimi a pilha de erro encontrado

            } finally {
                System.out.println("Excutado");
            }
        }
    }
    
    public static void dividir() throws ArithmeticException,InputMismatchException{
         System.out.println("Digite o primeiro numero");
                int numero = new Scanner(System.in).nextInt();
                System.out.println("Digite o segundo numero");
                int numero2 = new Scanner(System.in).nextInt();
                double resultado = numero / numero2;
                System.out.println(resultado);
    
}
}
