/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula095threadssynchronized;

/**
 *
 * @author eliezer
 */
public class ComprasEmFamilia implements Runnable {

    ContaConjunta conta = new ContaConjunta();
    

    @Override
    public void run() {
        String cliente = Thread.currentThread().getName();
        for (int i = 0; i < 2; i++) {
            conta.levantar(20, cliente);
            if (conta.getSaldo() < 0) {
                System.err.println("Estourou!");
            }
        }
    }
}
