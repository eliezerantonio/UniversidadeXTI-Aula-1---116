/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula043.métodossobrecarregados;

/**
 *
 * @author eliezer
 */
public class Aula043MétodosSobrecarregados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Matematica m = new Matematica();

        System.out.println(m.media(2, 5));
        System.out.println(m.media("100", "50"));
        System.out.println(m.media(12,23,3,4,5));
    }

}
