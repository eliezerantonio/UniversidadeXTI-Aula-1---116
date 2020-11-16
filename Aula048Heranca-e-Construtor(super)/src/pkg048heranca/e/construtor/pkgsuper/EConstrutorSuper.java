/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg048heranca.e.construtor.pkgsuper;

/**
 *
 * @author eliezer
 */
public class EConstrutorSuper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cachoro rex = new Cachoro();
        Curuja curuj = new Curuja();

        System.out.println(rex instanceof Animal);

        System.out.println(rex.equals(curuj)
        );
        System.out.println(rex.getClass());
        System.out.println(rex.hashCode());
        System.out.println(rex.toString());
    }

}
