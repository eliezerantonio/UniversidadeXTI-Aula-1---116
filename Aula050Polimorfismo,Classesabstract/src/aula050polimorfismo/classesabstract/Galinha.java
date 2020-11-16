/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula050polimorfismo.classesabstract;

/**
 *
 * @author eliezer
 */
public class Galinha extends Animal {
    
    @Override
    public void fazerBarulho(){
        
        System.out.println("Có,có");
        
    }

    @Override
    public void dormir() {
       
    }
    
}
