/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula060.stringbuffer.e.stringbuilder;

/**
 *
 * @author eliezer
 */
public class Aula060StringbufferEStringbuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Web");
        StringBuilder s2 = new StringBuilder("Java");

        System.out.println(s2.toString());

        System.out.println(s2.capacity());
        System.out.println(s2.length());

        System.out.println(s2.append(s1));
        System.out.println(s2.reverse());

    }

}
