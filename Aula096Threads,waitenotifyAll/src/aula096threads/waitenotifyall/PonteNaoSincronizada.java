/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula096threads.waitenotifyall;

/**
 *
 * @author eliezer
 */
public class PonteNaoSincronizada implements Ponte {

    private int valor = -1;

    @Override
    public void set(int valor) throws InterruptedException {
        System.out.print(" Produziu " + valor);
        this.valor = valor;
    }

    @Override
    public int get() throws InterruptedException {
        System.err.print(" Consumiu " + valor);
        return valor;
    }

}
