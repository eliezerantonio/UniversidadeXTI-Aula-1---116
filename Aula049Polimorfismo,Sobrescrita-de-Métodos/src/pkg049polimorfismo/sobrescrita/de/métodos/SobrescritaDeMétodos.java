/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg049polimorfismo.sobrescrita.de.métodos;

import javax.swing.JOptionPane;
import pkg049polimorfismo.sobrescrita.de.métodos.Soma;

/**
 *
 * @author eliezer
 */
public class SobrescritaDeMétodos {

    public static void Calcular(Matematica m, double x, double y) {
        System.out.println(m.calcular(x, y));
    }

    public static void main(String[] args) {
        Animal cao = new Cachoro();
        cao.fazerBarulho();
        Matematica matematica = new Matematica();
        Animal galinha = new Galinha();
        galinha.fazerBarulho();

        Calcular(new Soma(), 4, 5);
        
    }

}
