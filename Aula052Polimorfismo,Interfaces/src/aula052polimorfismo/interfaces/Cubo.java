
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
//Heranca multipla


public class Cubo implements AreaCalculavel, VolumeCalculavel {

    double lado;

    public Cubo(double lado) {
        this.lado = lado;

    }

    @Override
    public double calculoVolume() {
        return 6 * lado * lado;
    }

    @Override
    public double calculoArea() {
       return lado*lado;  }

}
