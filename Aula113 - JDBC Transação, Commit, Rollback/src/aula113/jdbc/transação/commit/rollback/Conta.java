/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula113.jdbc.transação.commit.rollback;

/**
 *
 * @author eliezer
 */
public class Conta {

    int numero;
    String cliente;
    double saldo;

    public Conta(int numero, String cliente, double saldo) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public Conta() {
    }

    public Conta(String cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String toStrig() {
        return "Numer: " + getNumero() + "\n"
                + "Cliente:  " + getCliente() + "\n"
                + "Saldo: " + getSaldo() + "\n";

    }

}
