/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula037.métodos.com.retorno;

/**
 *
 * @author eliezer
 */
public class Aula037MétodosComRetorno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematica m = new Matematica();
        int resultado = m.maior(10, 20);

        System.out.println(resultado);

        System.out.println(m.soma(21, 1));
    }

}
