/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula042varargsargumentosvariáveis;

/**
 *
 * @author eliezer
 */
public class Soma {

    double soma(double... numeros) {
        double total = 0;

        for (double n : numeros) {
            total += n;
        }
        return total;

    }
    double soma2(double[] numeros) {
        double total = 0;

        for (double n : numeros) {
            total += n;
        }
        return total;

    }

}
