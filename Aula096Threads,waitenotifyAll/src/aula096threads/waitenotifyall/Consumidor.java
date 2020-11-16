/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula096threads.waitenotifyall;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eliezer
 */
public class Consumidor implements Runnable {

    private Ponte ponte;
    private Random random = new Random();

    public Consumidor(Ponte ponte) {
        this.ponte = ponte;

    }

    @Override
    public void run() {
        int total = 0;
        for (int i = 0; i < 5; i++) {

            try {
                Thread.sleep(random.nextInt(3000));
                total = total + ponte.get();
                System.out.println("\t " + total);
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
