/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula093treads.start.sleep.e.ciclo.de.vida;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eliezer
 */
public class PingPong extends Thread {

    String palavra;
    long tempo;

    public PingPong(String palavra, long tempo) {
        this.palavra = palavra;
        this.tempo = tempo;

    }

    @Override
    public void run() {

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print(palavra+ " ");
                Thread.sleep(tempo);
            }
        } catch (InterruptedException ex) {
           return;
        }
    }

}
