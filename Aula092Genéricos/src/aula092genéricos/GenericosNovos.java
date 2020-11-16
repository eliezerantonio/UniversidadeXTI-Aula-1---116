/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula092genéricos;

import java.util.ArrayList;

/**
 *
 * @author eliezer
 */
public class GenericosNovos<E> {

    E elemento;

    public void setElemento(E elemento) {
        this.elemento = elemento;
    }

    public E getElemento() {
        return elemento;

    }

    public double soma(ArrayList<? extends Number> lista) { //curinga
        double total = 0;
        for (Number number : lista) {
            total = total + number.doubleValue();
        }

        return total;

    }

    public static void main(String[] args) {
        GenericosNovos<String> g = new GenericosNovos();
        g.setElemento("Eliezer");

        System.out.println(g.getElemento().toLowerCase());

    }
}
