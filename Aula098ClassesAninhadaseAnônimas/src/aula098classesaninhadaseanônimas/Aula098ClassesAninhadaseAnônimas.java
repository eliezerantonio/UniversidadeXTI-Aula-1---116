/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula098classesaninhadaseanônimas;

/**
 *
 * @author eliezer
 */
public class Aula098ClassesAninhadaseAnônimas  {

    
    public static void main(String[] args) {
      Aninhamento janela = new Aninhamento();
     Aninhamento.ListenerAninhado listener= janela.new ListenerAninhado();
    }
    
}
