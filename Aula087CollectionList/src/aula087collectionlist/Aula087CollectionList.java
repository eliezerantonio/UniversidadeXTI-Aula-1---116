/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula087collectionlist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eliezer
 */
public class Aula087CollectionList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Futebol");
        list.add("Basquete");
        list.add("Tenis");
        list.add("Volei");
        list.add("Natacao");
        list.add("Hockey");
        list.add("Boxe");
        list.add("Futebol");
        System.out.println(list);
        System.out.println(list.indexOf("Natacao"));
        System.out.println(list.subList(2, 4));
        list.subList(2, 4).clear();

        for (int i = 0; i < list.size(); i++) {
            String letra = list.get(i);
            list.set(i, letra.toUpperCase());
        }

        for (String lista : list) {
            System.out.println(lista.toLowerCase());
        }

        System.out.println(list);
        System.out.println(list.indexOf("Natacao"));

    }

}
