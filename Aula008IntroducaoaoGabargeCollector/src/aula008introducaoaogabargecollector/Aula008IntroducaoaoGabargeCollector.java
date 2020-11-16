/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula008introducaoaogabargecollector;

/**
 *
 * @author eliezer
 */
public class Aula008IntroducaoaoGabargeCollector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variavel Primtiva
        int x = 7 ; //desaperec na memoria
        x=10; /// valor passa a ser 10
        //Variavel de referencia 
        String y = "XTI";  // continua na memoria e coletado pelo Gabarge Collector
        y="XTI.com";
        y=null;
        System.out.println(x);
        System.out.println(y);
    }

}
