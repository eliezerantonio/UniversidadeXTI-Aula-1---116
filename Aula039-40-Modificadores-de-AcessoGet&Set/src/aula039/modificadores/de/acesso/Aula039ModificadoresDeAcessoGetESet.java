/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula039.modificadores.de.acesso;

/**
 *
 * @author eliezer
 */
public class Aula039ModificadoresDeAcessoGetESet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Eliezer");
        funcionario.setIdade(21);
        System.out.println("Nome:" +funcionario.getNome() +"\nIdade:" +funcionario.getIdade());
        
    }
    
}
