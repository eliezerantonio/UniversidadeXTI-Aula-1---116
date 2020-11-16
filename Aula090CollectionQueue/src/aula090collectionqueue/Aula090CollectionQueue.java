/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula090collectionqueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author eliezer
 */
public class Aula090CollectionQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //FIFO
        Queue<String> fila = new LinkedList();
        fila.add("Sandra");
        fila.add("Maria");
        fila.add("Jessica");
        System.out.println(fila);

        System.out.println(fila.peek());//Mostra o elemento a ser atendido
        System.out.println(fila.poll());//Remove o elemento do inico da filaa
        System.out.println(fila);
        /*outros metdodos disponiveis em linkdLIst*/
        LinkedList<String> f = (LinkedList<String>) fila;
        f.addFirst("Brenda");
        f.addLast("Caiu");
        System.out.println(f.peekFirst());//mostra o primeiro da fila
        System.out.println(f.peekLast());//mostra o ultimo da fila

        System.out.println(f.pollFirst());
        System.out.println(f.pollLast());
        System.out.println(f);
    }

}
