/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula091collectionmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author eliezer
 */
public class Aula091CollectionMap {

    public static void main(String[] args) {
        Map<String, String> pais = new HashMap<>();
        pais.put("BR", "Brasil");
        pais.put("RU", "Rússia");
        pais.put("IN", "Índia");
        pais.put("CN", "China");
        System.out.println(pais);
        System.out.println(pais.containsKey("IN"));
        System.out.println(pais.containsValue("China"));
        pais.remove("Ru");
        System.out.println(pais);

        Set<String> keys = pais.keySet();

        for (String key : keys) {
            System.out.println(key + ":" + pais.get(key));
        }
 
    }
}
