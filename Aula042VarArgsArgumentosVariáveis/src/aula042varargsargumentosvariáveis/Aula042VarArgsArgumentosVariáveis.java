/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula042varargsargumentosvariáveis;

/**
 *
 * @author eliezer
 */
public class Aula042VarArgsArgumentosVariáveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Soma s = new Soma();
     double total; 
    total=  s.soma(12.4,23,5);
      
        
        System.out.println(total);
    }
    
}
