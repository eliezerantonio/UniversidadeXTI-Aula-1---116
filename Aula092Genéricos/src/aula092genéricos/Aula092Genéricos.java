/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula092genéricos;

/**
 *
 * @author eliezer
 */
public class Aula092Genéricos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Generico generico = new Generico();
        generico.setElemento("Lago Paranoá");
        String e = (String) generico.getElemento();
        e.toUpperCase();
    }

}
