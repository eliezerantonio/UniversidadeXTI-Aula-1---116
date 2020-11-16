/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula036.métodos.com.parâmetros;

/**
 *
 * @author eliezer
 */
public class Conta {

    String cliente;
    double saldo;

    void mostrarSaldo() {
        System.out.println(cliente + " o seu saldo  e : " + saldo);
    }

    void lenvantar(double valor) {
        saldo = saldo - valor;

    }
    void deposita(double valor) {
        saldo = saldo + valor;

    }
    void transfereContaDestino(Conta destino,double valor){
        this.lenvantar(valor);
        destino.deposita(valor);
    }

}
