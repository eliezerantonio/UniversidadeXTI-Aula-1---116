/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula089collectionset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author eliezer
 */
public class Aula089CollectionSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cores[] = {"Azul", "Amarelo", "Branco", "Castenho", "Vermelho", "Cinza", "Azul", "Amarelo"};
        List lista = Arrays.asList(cores);
        System.out.println(lista.toString());
        Set<String> set = new HashSet<>(lista);
        System.out.println(set);

    }

}
