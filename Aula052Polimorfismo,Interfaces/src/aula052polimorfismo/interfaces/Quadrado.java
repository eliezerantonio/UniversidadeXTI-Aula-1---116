/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula052polimorfismo.interfaces;

/**
 *
 * @author eliezer
 */
public class Quadrado implements AreaCalculavel {

    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculoArea() {
        return lado * lado;

    }
    
    /*public static void area(AreaCalculavel a){
        System.out.println(a.calculoArea());
        
    }*/

}
