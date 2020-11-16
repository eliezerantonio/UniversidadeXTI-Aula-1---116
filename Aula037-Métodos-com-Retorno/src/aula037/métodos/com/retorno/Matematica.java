/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula037.métodos.com.retorno;

/**
 *
 * @author eliezer
 */
public class Matematica {

    int maior(int um, int dois) {

        if (um > dois) {
            return um;
        } else {
            return dois;
        }
    }

    int soma(int um, int dois) {
        int soma = um + dois;
        return soma;

    }

}
