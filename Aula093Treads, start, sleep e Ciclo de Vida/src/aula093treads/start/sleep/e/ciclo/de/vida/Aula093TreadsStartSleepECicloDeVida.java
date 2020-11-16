/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula093treads.start.sleep.e.ciclo.de.vida;

/**
 *
 * @author eliezer
 */
public class Aula093TreadsStartSleepECicloDeVida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new PingPong("Ping", 1700).start();
        new PingPong("Pong", 2000).start();
    }

}
