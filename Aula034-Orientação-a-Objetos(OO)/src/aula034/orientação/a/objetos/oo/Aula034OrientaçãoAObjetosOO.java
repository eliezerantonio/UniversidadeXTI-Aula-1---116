/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula034.orientação.a.objetos.oo;

/**
 *
 * @author eliezer
 */
public class Aula034OrientaçãoAObjetosOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cachorro pastorAlemao = new Cachorro();
        pastorAlemao.raca = "Pastor Alemao";
        pastorAlemao.tamanho = 30;
        pastorAlemao.latir();
        
        System.out.println(pastorAlemao.raca +"\n" + pastorAlemao.tamanho);
        
        
        
    }

}
