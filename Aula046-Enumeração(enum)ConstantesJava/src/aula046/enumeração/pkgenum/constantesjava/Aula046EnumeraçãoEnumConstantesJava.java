/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula046.enumeração.pkgenum.constantesjava;

/**
 *
 * @author eliezer
 */
public class Aula046EnumeraçãoEnumConstantesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(PecasXadrez.BISPO);

        System.out.println(Medida.CM.titulo);

        //Percorrendo tdos elementos dentro da medida
        for (Medida m : Medida.values()) {
            System.out.println(m + " : " + m.titulo);
        }
    }

}
