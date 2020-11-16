/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula086collectionintrodução;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 *
 * @author eliezer
 */
public class Aula086CollectionIntrodução {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("A");
        c.add("E");
        c.add("I");
        System.out.println(c.toString());
        System.out.println(c.contains("A"));
        System.out.println(c.isEmpty());
        System.out.println(c.remove("E"));
        System.out.println(c.toString());
        Collection<String> c2 = Arrays.asList("O", "U");
        c.addAll(c2);
        c.containsAll(c2);//verifica se exite todos os elemtnos da colecao c2
        for (String string : c) {
            System.out.println(string);
        }
        String[] s = c.toArray(new String[c.size()]);
        System.out.println(Arrays.toString(s));
        c.clear();
        System.out.println(c.toString());
    }

}
