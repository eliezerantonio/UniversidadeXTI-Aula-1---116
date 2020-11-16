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
public class Cachoro extends Animal{
    public Cachoro(){
        super(0,"");
    }
    
    @Override//polimorfismo
    void fazerBarulho(){
        System.out.println("Au!,au!");
    }
}
