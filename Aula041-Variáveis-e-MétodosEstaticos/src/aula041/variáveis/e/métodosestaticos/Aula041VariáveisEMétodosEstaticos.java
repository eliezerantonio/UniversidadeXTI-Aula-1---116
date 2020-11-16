/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula041.variáveis.e.métodosestaticos;

/**
 *
 * @author eliezer
 */
public class Aula041VariáveisEMétodosEstaticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
        Galinha galinha = new Galinha();
        galinha.botar().botar().botar();
        Galinha galinha2 = new Galinha();
        galinha2.botar().botar();

        System.out.println(galinha.ovo);
        System.out.println(Galinha.ovosDaGranja);
        System.out.println(Galinha.mediaOvos(2));
        
        
     
    }

}
