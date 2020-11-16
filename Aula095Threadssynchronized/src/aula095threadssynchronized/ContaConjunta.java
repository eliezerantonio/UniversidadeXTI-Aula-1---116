/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula095threadssynchronized;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eliezer
 */
public class ContaConjunta {

    private double saldo = 150.000;

    public double getSaldo() {
        return saldo;
    }

    public synchronized void levantar(double valor, String cliente) {

        if (saldo >= valor) {
            double saldoOriginal = saldo;
            System.out.println("Saldo Actual da conta conjunta " + saldoOriginal);
            System.out.println(cliente + " Vai Levantar na conta conjunta");
            try {
                System.out.println(cliente + " Esperando");
                Thread.sleep(3000);//Aguardando o processamento
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            double saldoFinal = saldo = saldo - valor;

            String sms = cliente + " Levantou " + valor
                    + " [Saldo Original= " + saldoOriginal
                    + ",saldo final= " + saldoFinal + " ]";
            System.out.println(sms);
            System.out.println("---------------------------------------------------------------------");
        } else {
            System.err.println("Saldo insuficente para " + cliente);
        }
    }

}
