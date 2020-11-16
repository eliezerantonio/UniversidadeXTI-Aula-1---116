/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg049polimorfismo.sobrescrita.de.métodos;

/**
 *
 * @author eliezer
 */
public class Soma extends Matematica {

    @Override
    public double calcular(double x, double y) {
        return x + y;

    }

}
