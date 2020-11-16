/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula097garbagecollector;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eliezer
 */
public class Aula097GarbageCollector {

    public static long carregarMemoria() {

        List<Integer> lista = new ArrayList();

        for (int i = 0; i < 100_000; i++) {
            lista.add(i);
        }
        return Runtime.getRuntime().freeMemory();

    }

    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        int MB = 1_048_576;//total de bytes em 1mb
        double total = rt.maxMemory() / MB;//retorna a quanridade tootal de memeoria dispoviel para nossa jvm executar
        double inicio = total - (carregarMemoria()) / MB;

        System.out.println(total);
        System.out.println(inicio);

        rt.runFinalization();
        rt.gc();
        double fim = total - (rt.freeMemory()) / MB;
        System.out.println("Inicio: " + inicio + " Fim: " + fim);
    }

}
