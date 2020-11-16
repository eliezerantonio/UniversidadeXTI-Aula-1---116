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
public class Aula096ThreadsWaitenotifyAll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ponte ponte = new PonteSincronizada();
        new Thread(new Produtor(ponte)).start();
        new Thread(new Consumidor(ponte)).start();
    }

}
