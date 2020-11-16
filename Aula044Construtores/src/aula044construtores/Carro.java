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
public class Carro {

    private String modelo;
    private int velocidade;
    private double segundosZeroAcem;

    public Carro() {
    }

    public Carro(String modelo, int velocidade, double segungosZeroAcem) {
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.segundosZeroAcem = segungosZeroAcem;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getSegundosZeroAcem() {
        return segundosZeroAcem;
    }

    public void setSegundosZeroAcem(double segundosZeroAcem) {
        this.segundosZeroAcem = segundosZeroAcem;
    }

}
