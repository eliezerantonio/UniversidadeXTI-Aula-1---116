/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula094threadsrunnable;

/**
 *
 * @author eliezer
 */
public class Aula094Threadsrunnable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runnable ping = new PingPongRunnable("Ping", 1700);
        Runnable pong = new PingPongRunnable("Pong", 2000);

        new Thread(ping, "pong").start();
        new Thread(pong, "pong").start();
    }

}
