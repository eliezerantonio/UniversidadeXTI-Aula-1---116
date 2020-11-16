/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula095threadssynchronized;

/**
 *
 * @author eliezer
 */
public class Aula095Threadssynchronized {

    public static void main(String[] args) {
        ComprasEmFamilia irAsCompras = new ComprasEmFamilia();

        new Thread(irAsCompras, "Mãe").start();
        new Thread(irAsCompras, "Filha").start();
        new Thread(irAsCompras, "Pai").start();
        new Thread(irAsCompras, "BABÁ").start();

    }

}
