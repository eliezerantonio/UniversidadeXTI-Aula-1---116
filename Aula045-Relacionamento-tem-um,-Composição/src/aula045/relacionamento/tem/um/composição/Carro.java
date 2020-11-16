package aula045.relacionamento.tem.um.composição;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author eliezer
 */
public class Carro {

    private String modelo;
    private int velocidade;
    private double segundosZeroAcem;
    Motor motor;

    public Carro() {
    }

    public Carro(String modelo, int velocidade, double segungosZeroAcem) {
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.segundosZeroAcem = segungosZeroAcem;

    }

    public Carro(String modelo, int velocidade, double segungosZeroAcem, Motor motor) {

        this.modelo = modelo;
        this.velocidade = velocidade;
        this.segundosZeroAcem = segungosZeroAcem;
        this.motor = motor;

    }

    public void estado() {

        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidade: " + this.velocidade);
        System.out.println("Segundos de zero a cem:  " + this.segundosZeroAcem);
        motor.estado(); // se eu usa-se extends seria super.estado();
        System.out.println("---------------------------------------");
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
