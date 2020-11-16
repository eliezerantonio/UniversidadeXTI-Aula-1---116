/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula022arraylist;

import java.util.ArrayList;

/**
 *
 * @author eliezer
 */
public class Aula022ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();

        cores.add("Azul");
        cores.add("Branco");
        cores.add("Vermelho");
        cores.add(0, "Castanho");

        System.out.println("Elementos: " + cores.toString());
        System.out.println("tamanho: " + cores.size());
        System.out.println("Recuperando");
        System.out.println(cores.get(2));
        System.out.println("Pesquisando ");
        System.out.println("Indece do elemento " + cores.indexOf("Vermelho"));
        System.out.println("Remvendo");
        cores.remove("Castanho");
        
        
        System.out.println("verificando se element existe");
        System.out.println("Tem castanhoo? " +cores.contains("Castanho"));
    }

}
