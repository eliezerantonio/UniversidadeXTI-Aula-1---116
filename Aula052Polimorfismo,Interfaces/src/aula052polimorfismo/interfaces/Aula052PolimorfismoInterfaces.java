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
public class Aula052PolimorfismoInterfaces {

    public static void area(AreaCalculavel a) {
        System.out.println(a.calculoArea());
    }

    public static void volume(VolumeCalculavel v) {
        System.out.println(v.calculoVolume());
    }

    public static void main(String[] args) {
      area(new Quadrado(2));
      volume(new Cubo(2));
    }

}
