/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula046.enumeração.pkgenum.constantesjava;

/**
 *
 * @author eliezer
 */
public enum Medida {

    MM("Milimetro"), CM("Centimetro"), M("Metros");
    public String titulo;

    Medida(String titulo) {
        this.titulo = titulo;

    }
    
    public static void andar (Medida medida, int total){
        
    }

}
