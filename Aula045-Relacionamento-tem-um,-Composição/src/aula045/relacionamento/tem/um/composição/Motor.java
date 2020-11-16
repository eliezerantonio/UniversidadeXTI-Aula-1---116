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
public class Motor {

    private String tipo;
    private int potencia;

    public Motor() {

    }

    public void estado() {
        System.out.println("Tipor:" + this.tipo);
        System.out.println("Potencia: " + this.potencia);
    }

    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

}
