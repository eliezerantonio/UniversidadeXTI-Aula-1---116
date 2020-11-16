/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula044construtores;

/**
 *
 * @author eliezer
 */
public class Aula044Construtores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro carro = new Carro("Grand i10", 180, 20);

        System.out.println("Modelo: " + carro.getModelo().toLowerCase() + "\nVelocidade: " + carro.getVelocidade() + "\nSegundos de Zero a em: " + carro.getSegundosZeroAcem());
    }

}
