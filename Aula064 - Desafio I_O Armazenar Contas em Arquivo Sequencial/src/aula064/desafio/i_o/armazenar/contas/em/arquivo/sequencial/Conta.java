/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula064.desafio.i_o.armazenar.contas.em.arquivo.sequencial;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.print.DocFlavor;

/**
 *
 * @author eliezer
 */
public class Conta {
    
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
    
    public void armazenarContas(ArrayList<Conta> contas) {
        Path caminho = Paths.get("/home/eliezer/Documents/Arquivo/ListaDeContas.txt");
        Charset utf8 = StandardCharsets.UTF_8;
        try (BufferedWriter w = Files.newBufferedWriter(caminho, utf8)) {
            for (Conta conta : contas) {
                w.write(conta.getNome() + ";" + conta.getSaldo() + "\n");
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void buscarContas(ArrayList<Conta> contas) {
        Path caminho = Paths.get("/home/eliezer/Documents/Arquivo/ListaDeContas.txt");
        Charset utf8 = StandardCharsets.UTF_8;
        try (BufferedReader w = Files.newBufferedReader(caminho, utf8)) {
            for (Conta conta : contas) {
                
                System.out.println(w.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
            
        }
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
