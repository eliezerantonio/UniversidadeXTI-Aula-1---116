/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula041.variáveis.e.métodosestaticos;

/**
 *
 * @author eliezer
 */
public class Galinha {

    public static int ovosDaGranja;
    public int ovo;

    public Galinha botar() {
        ovo++;
        Galinha.ovosDaGranja++;
        return this;

    }
    
    public static double mediaOvos(int galinhas){
        return Galinha.ovosDaGranja/galinhas;
        
    }
}
