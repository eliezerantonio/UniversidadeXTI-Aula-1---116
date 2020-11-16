/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg049polimorfismo.sobrescrita.de.métodos;

import java.awt.Image;

/**
 *
 * @author eliezer
 */
public class Galinha extends Animal {

    public Galinha() {
        super(0, "");
    }
     @Override
    void fazerBarulho(){
        System.out.println("Có,có");
    }

}
