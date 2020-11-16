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
public class Aula036MétodosComParâmetros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.cliente = "Eliezer Antonio";
        conta.saldo = 100;

        ///conta.deposita(30);
        conta.mostrarSaldo();

        Conta conta2 = new Conta();
        conta2.cliente = "Nex Faria";
        conta2.saldo = 0;
        conta2.mostrarSaldo();
        System.out.println("Apos a transferencia");
        conta.transfereContaDestino(conta2, 50);
        conta.mostrarSaldo();
        conta2.mostrarSaldo();
    }

}
