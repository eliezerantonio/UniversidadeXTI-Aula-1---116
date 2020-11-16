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
public class PonteSincronizada implements Ponte {

    private int valor = -1;
    private boolean ocupada = false;

    @Override
    public synchronized void set(int valor) throws InterruptedException {
        while (ocupada) {
            System.out.println("Ponte cheia. Produtor deve aguardar");
            wait();
        }
        System.out.print("Produziu " + valor);
        this.valor = valor;
        ocupada = true;
        notifyAll();//notificando a thread que o nosso estado de avaliacap esta ocupado ou nao 
    }

    @Override
    public synchronized int get() throws InterruptedException {
        while (!ocupada) {
            System.out.println("Ponte vazia. consumidor deve agudardar");
            wait();
        }
        System.out.print("Consumiu " + valor);
        ocupada = false;
        notifyAll();//notificados as threads que o estado mudou
        return valor;
    }

}
