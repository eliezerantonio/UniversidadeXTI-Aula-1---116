/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula088collectionutilitáriocollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import static java.util.Collections.unmodifiableCollection;
import java.util.List;

/**
 *
 * @author eliezer
 */
public class Aula088CollectionUtilitárioCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Guarana");
        lista.add("Uva");
        lista.add("Acai");
        lista.add("coco");
        lista.add("Manga");
        lista.add("Abacate");
        Collections.sort(lista);
        System.out.println(lista);
        
        Collections.reverse(lista);
        System.out.println(lista);
        
        Collections.shuffle(lista);
        System.out.println(lista);
        
        Collections.shuffle(lista);
        System.out.println(lista);
        
        Collections.addAll(lista,"Pera","Laranja","Manga");
        System.out.println(lista);
        
        System.out.println(Collections.frequency(lista, "Manga"));
        List<String> lista2 =Arrays.asList("Manga","Goiaba");
        boolean b =Collections.disjoint(lista, lista2);
        System.out.println(b);
        
        System.out.println(Collections.binarySearch(lista, "Uva"));
        
        Collections.fill(lista, "Nada");
        System.out.println(lista);
        /*colecao nao mudificavel*/
        Collection<String> constante=unmodifiableCollection(lista);
   
         
    }

}
