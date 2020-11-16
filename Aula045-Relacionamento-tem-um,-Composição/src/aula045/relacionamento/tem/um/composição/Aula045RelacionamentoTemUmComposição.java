/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula045.relacionamento.tem.um.composição;

/**
 *
 * @author eliezer
 */
public class Aula045RelacionamentoTemUmComposição {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Motor v12 = new Motor("v12", 650);
        Motor v4 = new Motor("v4", 110);

        Carro carro = new Carro("Lexus", 280, 20);
        Carro carro2 = new Carro("Grand i10", 180, 10);

        carro.motor = v12;
        carro.estado();
        //System.out.println("Modelo: " + carro.getModelo().toLowerCase() + "\nVelocidade: " + carro.getVelocidade() + "\nSegundos de Zero a em: " + carro.getSegundosZeroAcem() + "\nPotencia Motor: " + carro.motor.getPotencia() + "\nTipo: " + carro.motor.getTipo());

      
        carro2.motor = v4;
        carro.estado();

        Carro carro3 = new Carro("Mercedes 2011", 300, 20, new Motor("v8", 300));

        carro.estado();

    }

}
