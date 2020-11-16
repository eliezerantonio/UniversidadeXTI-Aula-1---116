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
public class Galinha extends Animal implements VolumeCalculavel {
                                       //relacionamento tipo dispares
    @Override
    public void fazerBarulho(){
        
        System.out.println("Có,có");
        
    }

    @Override
    public void dormir() {
       
    }

    @Override
    public double calculoVolume() {
        return 0;
       
    }
    
}
