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
public abstract class Animal {

    String nome;

    double peso;

    public void fazerBarulho() {//metodod implementado
        System.out.println("Fazer Barulho");

    }

    public abstract void dormir(); //metoddo por implementar
}
