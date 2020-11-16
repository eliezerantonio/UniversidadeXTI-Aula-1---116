/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula059.string.split.tokens.e.delimitadores;

/**
 *
 * @author eliezer
 */
public class Aula059StringSplitTokensEDelimitadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String s= "JAVA;CSS;SQL;PHP;C#";
     String tonkens[]=s.split(";");
     
        System.out.println(tonkens.length);
        
        for (String tonken : tonkens) {//peguei cada token dentro do array tokenks 
            System.out.println(tonken);
            
        }
    }
    
}
