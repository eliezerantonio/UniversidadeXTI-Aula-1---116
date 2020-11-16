/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula024switch;

/**
 *
 * @author eliezer
 */
public class Aula024switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char sexo = 'M';

        switch (sexo) {

            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Desconhecido");

        }
    }

}
