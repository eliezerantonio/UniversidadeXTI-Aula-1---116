/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula068.serialização.de.contas;

/**
 *
 * @author eliezer
 */
public class Conta implements java.io.Serializable{
    
    private String nome;
    private double saldo;
    
    public Conta() {
        
    }

    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }
    
   
    
    public void mostrarSaldo() {
        System.out.println(nome + " o seu saldo  e : " + saldo);
    }
    
    public void lenvantar(double valor) {
        saldo = saldo - valor;
        
    }
    
    public void deposita(double valor) {
        saldo = saldo + valor;
        
    }
    
    void transfereContaDestino(Conta destino, double valor) {
        this.lenvantar(valor);
        destino.deposita(valor);
    }
    
   
    
   
    
  
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
